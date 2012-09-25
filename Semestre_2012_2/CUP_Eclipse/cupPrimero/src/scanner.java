import java_cup.runtime.Scanner;
import java_cup.runtime.Symbol;


public class scanner implements Scanner {

	private java.io.BufferedReader archivito;
	public scanner(java.io.InputStream streamEntrada) {
		archivito = new java.io.BufferedReader(
						new java.io.InputStreamReader(
								 streamEntrada
								                      )
					                           );
	}

	@Override
	public Symbol next_token() throws Exception {
		
		int c=0;
		do
		{
			try
			{
				c=archivito.read();
			}
			catch(Exception e)
			{
				System.err.println("Aprenda a usar a java antes de intentar hacer esto");
			}
			
			switch(c)
			{
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
			case '0':
						return new java_cup.runtime.Symbol(sym.DIGITO);
			case '+': 	return new java_cup.runtime.Symbol(sym.SUMA);
			case '-': 	return new java_cup.runtime.Symbol(sym.RESTA);
			case '*':	return new java_cup.runtime.Symbol(sym.MULTI);
			case '/':   return new java_cup.runtime.Symbol(sym.DIVI);
			case '^':	return new java_cup.runtime.Symbol(sym.POTENCIA);
			case '(': return new java_cup.runtime.Symbol(sym.PARENTIZQ);
			case ')': return new java_cup.runtime.Symbol(sym.PARENTDER);
			case '=': return new java_cup.runtime.Symbol(sym.IGUAL);
			default: break;
			}
			
		}while(c!=sym.EOF);
		return null;
	}

}
