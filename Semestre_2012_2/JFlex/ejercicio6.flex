import java.io.*;
import java.lang.*;
%%
%{
	static FileInputStream FInStr = null;
	static String fInName ; //nombre archivo entrada
     static boolean suma=false;
	static Integer tk_begin=10;
	static Integer tk_if=20;
	static Integer tk_then=30;
	static Integer tk_else=40;
	static Integer tk_end=50;
	static Integer tk_par_abre=60;
	static Integer tk_par_cierra=70;
	static Integer tk_asignacion=80;
	static Integer tk_arroba=90;
	static Integer tk_mas=100;
	static Integer tk_menos=110;
	static Integer tk_divi=120;
	static Integer tk_id=130;
	static Integer tk_entero=140;	
	static Integer tk_real=150;	

	public static void main (String argv[])
	throws java.io.IOException {

		//Obtención de parámetros pasados en línea de comandos
		if ( argv.length != 1) 
		{ 	//error: nr. Parámetros incorrecto
			System.out.println ("Número parámetros incorrecto!. Uso: ");
			System.out.println ( "\tjava contador archivo.EXT");
			return; 
		}
		else 
		{ 	
			fInName = argv[0];		
			sexto yy = new sexto(new FileInputStream(fInName));
do{
 int tok_actual = yy.yylex();
 switch(tok_actual){
   case 10: System.out.println("TOK_BEGIN"); break;
   case 20: System.out.println("TOK_IF"); break;
   case 30: System.out.println("TOK_THEN"); break;
   case 40: System.out.println("TOK_ELSE"); break;
   case 50: System.out.println("TOK_END"); break;
   case 60: System.out.println("TOK_("); break;
   case 70: System.out.println("TOK_)"); break;
   case 80: System.out.println("TOK_ASIGNACION"); break;
   case 90: System.out.println("TOK_@"); break;
   case 100: System.out.println("TOK_+"); break;
   case 110: System.out.println("TOK_-"); break;
   case 120: System.out.println("TOK_/"); break;
   case 130: System.out.println("TOK_ID"); break;
   case 140: System.out.println("TOK_ENTERO"); break;
   case 150: System.out.println("TOK_REAL"); break;
	}
			 }while(tok_actual!=-1);
		} //Final main
%}

%initthrow{ // Declaro el tipo de excepcion declarada en la clausula throw
	FileNotFoundException
%initthrow}


%integer
%class sexto

%%
"begin"   	{return tk_begin;}
"end"		{return tk_end;}
"if"		{return tk_if;}
"else"	{return tk_else;}
"then"	{return tk_then;}
"("		{return tk_par_abre;}
")"		{return tk_par_cierra;}
":="		{return tk_aignacion;}
"@"		{return tk_arroba;}
"+"		{return tk_mas;}
"-"		{return tk_menos;}
"/"		{return tk_divi;}
[0-9]+	{return tk_entero;}
[0-9]+"."[0-9]+ {return tk_real;}
[a-zA-Z][a-zA-Z0-9]+  {return tk_id;}
[ \r\n]+ {/* ignoro */} 