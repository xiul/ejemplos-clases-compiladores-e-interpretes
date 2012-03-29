import java.io.*;
import java.lang.*;

%%

%{
	static FileInputStream FInStr = null;
	static String fInName ; //nombre archivo entrada

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
		{ 	
			fInName = argv[0];		
			noeraunejerciciodeespacios yy = new noeraunejerciciodeespacios(new FileInputStream(fInName));
			while (yy.yylex() != -1) ; }
		} //Final main
%}


%initthrow{ // Declaro el tipo de excepcion declarada en la clausula throw
	FileNotFoundException
%initthrow}


%integer
%class noeraunejerciciodeespacios

%%
[A-Za-z0-9]+ { System.out.print(yytext()); }
^[ ]+		{ /*nada*/}
[ ]+$		{ /*nada*/}
[ ]+			{ System.out.print(" ");}
"\r\n"+		{ System.out.println();}







