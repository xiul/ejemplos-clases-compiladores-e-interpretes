package ast;

public class nodoEscribir extends NodoBase {

	private NodoBase expresion;

	public nodoEscribir(NodoBase expresion) {
		super();
		this.expresion = expresion;
	}

	public NodoBase getExpresion() {
		return expresion;
	}

	public void setExpresion(NodoBase expresion) {
		this.expresion = expresion;
	}
}
