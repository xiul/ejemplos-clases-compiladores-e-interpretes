import java.io.*;
import java.lang.*;

%%
digito=[0-9]
entero=digito+
entsigno=[+\-]?entero

%{
	static FileInputStream FInStr = null;
	static String fInName ; //nombre archivo entrada
	public static int cont=0;
	public static void main (String argv[])
	throws java.io.IOException {

		int numparams = argv.length; //número argumentos pasados

		//Obtención de parámetros pasados en línea de comandos
		if ( numparams != 1) 
		{ 	//error: nr. Parámetros incorrecto
			System.out.println ("Número parámetros incorrecto!. Uso: ");
			System.out.println ( "\tjava contador archivo.EXT");
			return; 
		}
		else 
		{ 	fInName = argv[0];		
			ejer7 yy = new ejer7(new FileInputStream(fInName));
			while (yy.yylex() != -1) ; }
			//Imprimir resultados
				
		} //Final main
%}


%initthrow{ // Declaro el tipo de excepcion declarada en la clausula throw
	FileNotFoundException
%initthrow}


%integer
%class ejer7
%ignorecase

%%
begin|else|if|then|end {System.out.println ("\tPalabra reservada"+yytext());}
[(,),:=.] {System.out.println ("\tCaracter especial"+yytext());}
{entero} {System.out.println ("\tNumero entero"+yytext());}
{entsigno}[.,]{entero} {System.out.println ("\tNumero decimal"+yytext());}
[@+\-/]?[a-zA-Z0-9]+ {System.out.println ("\tPalabra combinada"+yytext());}
[\t ] {/*No se hace nada :)*/}
[\r\n] {System.out.println ("\tLinea:"+cont++);}
{entsigno}([.,]{entero})?E{entsigno} {System.out.println ("\texponencial"+yytext());}
