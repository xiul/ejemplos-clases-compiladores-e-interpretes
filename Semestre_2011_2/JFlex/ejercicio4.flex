import java.io.*;
import java.lang.*;

%%

%{
	static FileInputStream FInStr = null;
	static String fInName ; //nombre archivo entrada
	public int min=0,m2=0,comb=0,cinco=0;
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
			contador yy = new contador(new FileInputStream(fInName));
			while (yy.yylex() != -1) ; }
			//Imprimir resultados
			
			System.out.println ("Minusculas "+min+" Mayusculas "+m2);
			
			System.out.println ("combinaditas "+comb+" Cinco "+cinco);	
		} //Final main
%}


%initthrow{ // Declaro el tipo de excepcion declarada en la clausula throw
	FileNotFoundException
%initthrow}


%integer
%class contador

%%
[A-Za-z][A-Za-z][A-Za-z][A-Za-z][A-Za-z] {cinco++;}
[ \r\n\t]+ { /*No usamos estos caracteres*/ }
[a-z]+ { min++; }
[A-Z]+ { m2++; }
[A-Za-z]+ { comb++; }

