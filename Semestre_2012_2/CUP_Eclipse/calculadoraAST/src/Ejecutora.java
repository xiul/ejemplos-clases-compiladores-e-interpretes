
public class Ejecutora {

	public static int ejecutar(nodoBase n) {
		int tmp=-1000,a=-1000,b=-1000;
		if(n instanceof nodoOperacion)
		{
			nodoOperacion tmpnodo = (nodoOperacion) n;
			if(tmpnodo.hijoIzquierdo!=null)
			{
				a=ejecutar(tmpnodo.hijoIzquierdo);
			}
			
			if(tmpnodo.hijoDerecho!=null)
			{
				b=ejecutar(tmpnodo.hijoDerecho);
			}
		}
		
		if(n instanceof nodoEntero)
		{
			return ((nodoEntero) n).Numero;
		}
		else if(n instanceof nodoOperacion)
		{
			if(a!=-1000 && b!=-1000)
			{
				nodoOperacion op = (nodoOperacion) n;
				
				if(op.operando==tipoOperacion.suma){ //suma
					tmp=a+b;
				}else if(op.operando==tipoOperacion.resta){ //
					tmp=a-b;
				}else if(op.operando==tipoOperacion.multi){ //
					tmp=a*b;
				}else if(op.operando==tipoOperacion.divi){ //
					tmp=a/b;
				}else if(op.operando==tipoOperacion.potencia){ 
					double aa=a, bb=b;
					tmp=(int) Math.round((Math.pow(aa, bb)));
				}
				return tmp;
			}
			else if(a!=-1000 && b==-1000)
			{
				nodoOperacion op = (nodoOperacion) n;
				if(op.operando==tipoOperacion.neg){ //negacion
					tmp=a*-1;
				}
				return tmp;
			}
			else
			{
				System.err.println("Algo salio muy mal...");
			}
		}
		
		return tmp;
	}
	
}
