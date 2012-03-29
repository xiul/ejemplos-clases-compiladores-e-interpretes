package ast;

public class NodoBase {
	/*Esta clase fue creada para tener un origen comun de todas las clases...
	 * 
	 * ESTE MODELO DE AST PUEDE SER MEJORADO DE MUCHAS FORMAS, POR SIMPLIFICACION Y
	 * DIDACTICA EN CLASE, SE LLEVARA A CABO DE FORMA MUY SIMPLE Y POCO FLEXIBLE
	 * */
	
	private NodoBase HermanoDerecha;

	public NodoBase(NodoBase hermanoDerecha) {
		super();
		HermanoDerecha = hermanoDerecha;
	}

	public NodoBase() {
		super();
		HermanoDerecha=null;
	}

	public NodoBase getHermanoDerecha() {
		return HermanoDerecha;
	}

	public void setHermanoDerecha(NodoBase hermanoDerecha) {
		HermanoDerecha = hermanoDerecha;
	}
	
	public boolean TieneHermano() {
		return (HermanoDerecha!=null);
	}
	
}
