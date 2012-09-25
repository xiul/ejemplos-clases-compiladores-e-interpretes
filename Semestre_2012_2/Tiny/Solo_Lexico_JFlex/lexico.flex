package Tiny;
import java.io.FileInputStream;

%%
%intwrap
%class Scanner
%{

	private int lineanum;
	private boolean debug=true;

	static FileInputStream FInStr = null;
	static String fInName ; //nombre archivo entrada

	public static void main(String argv[]) 
	throws java.io.IOException {
		int numparams = argv.length; //número argumentos pasados
		if ( numparams != 1) 
		{ 	//error: nr. Parámetros incorrecto
			System.out.println ("Número parámetros incorrecto!. Uso: ");
			System.out.println ( "\tjava yylex archivo.EXT");
			return; 
		}
		else 
		{ 	
			fInName = argv[0];		
			Scanner yy = new Scanner(new FileInputStream(fInName));
			while (yy.yylex() != -1) ; 
		}
	}
%}
%eofval{
    return sym.EOF;
%eofval}

digito		= [0-9]
numero		= {digito}+
letra			= [a-zA-Z]
identificador	= {letra}+
nuevalinea		= \n | \n\r | \r\n
espacio		= [ \t]+

%%

"if"            {	if(debug) System.out.println("token IF");
			return sym.IF;
			}
"then"          { if(debug) System.out.println("token THEN");
			return sym.THEN;
			}
"else"          {	if(debug) System.out.println("token ELSE");
			return sym.ELSE;
			}
"end"           {	if(debug) System.out.println("token END");
			return sym.END;
			}
"repeat"        {	if(debug) System.out.println("token REPEAT");
			return sym.REPEAT;
			}
"until"         {	if(debug) System.out.println("token UNTIL");
			return sym.UNTIL;
			}
"read"          {	if(debug) System.out.println("token READ");
			return sym.READ;
			}
"write"         {	if(debug) System.out.println("token WRITE");
			return sym.WRITE;
			}
":="            {	if(debug) System.out.println("token ASSIGN");
			return sym.ASSIGN;
			}
"="             {	if(debug) System.out.println("token EQ");
			return sym.EQ;
			}
"<"             {	if(debug) System.out.println("token LT");
			return sym.LT;
			}
"+"             {	if(debug) System.out.println("token PLUS");
			return sym.PLUS;
			}
"-"             {	if(debug) System.out.println("token MINUS");
			return sym.MINUS;
			}
"*"             {	if(debug) System.out.println("token TIMES");
			return sym.TIMES;
			}
"/"             {	if(debug) System.out.println("token OVER");
			return sym.OVER;
			}
"("             {	if(debug) System.out.println("token LPAREN");
			return sym.LPAREN;
			}
")"             {	if(debug) System.out.println("token RPAREN");
			return sym.RPAREN;
			}
";"             {	if(debug) System.out.println("token SEMI");
			return sym.SEMI;
			}
{numero}        {	if(debug) System.out.println("token NUM");
			return sym.NUM;
			}
{identificador}	{	if(debug) System.out.println("token ID");
				return sym.ID;
			}
{nuevalinea}       {lineanum++;}
{espacio}    { /* saltos espacios en blanco*/}
"{"[^}]+"}"  { /* salto comentarios */ if(debug) System.out.println("token COMENTARIO"); }
.               {System.err.println("Caracter Ilegal encontrado en analisis lexico: " + yytext() + "\n");}


