import java.io.*;
import java_cup.runtime.*;


class Scanner implements java_cup.runtime.Scanner {

	private java.io.BufferedReader FileIn;
	
	Scanner(java.io.InputStream instream){
		FileIn = new java.io.BufferedReader(
			new java.io.InputStreamReader(instream)
		);
	}
	
	public java_cup.runtime.Symbol next_token()
	throws java.io.IOException
	{
		int c=0;
		do{
			try
			{
				c=FileIn.read();
			}catch(IOException e){
				System.out.println("Error");
			}
			
			switch(c){
			case '1':
			{return new java_cup.runtime.Symbol(sym.DIGITO,new Integer(1));}
			case '2':
			{return new java_cup.runtime.Symbol(sym.DIGITO,new Integer(2));}				
			case '3': 
			{return new java_cup.runtime.Symbol(sym.DIGITO,new Integer(3));}
			case '4':
			{return new java_cup.runtime.Symbol(sym.DIGITO,new Integer(4));}
			case '5': 
			{return new java_cup.runtime.Symbol(sym.DIGITO,new Integer(5));}
			case '6': 
			{return new java_cup.runtime.Symbol(sym.DIGITO,new Integer(6));}
			case '7':
			{return new java_cup.runtime.Symbol(sym.DIGITO,new Integer(7));}				
			case '8':
			{return new java_cup.runtime.Symbol(sym.DIGITO,new Integer(8));}				
			case '9':
			{return new java_cup.runtime.Symbol(sym.DIGITO,new Integer(9));}				
			case '0':
			{return new java_cup.runtime.Symbol(sym.DIGITO,new Integer(0));}				

			case '+': {return new java_cup.runtime.Symbol(sym.SUMA);}
			case '-': {return new java_cup.runtime.Symbol(sym.RESTA);}
			case '*': {return new java_cup.runtime.Symbol(sym.MULTIPLICACION);}
			case '/': {return new java_cup.runtime.Symbol(sym.DIVISION);}
			case '(': {return new java_cup.runtime.Symbol(sym.LPARENT);}
			case ')': {return new java_cup.runtime.Symbol(sym.RPARENT);}
			case '^': {return new java_cup.runtime.Symbol(sym.POTENCIA);}
			case '=': {return new java_cup.runtime.Symbol(sym.RESULTADO);}
			default: {break;}
			}
			}while(true);
		}
		
	}