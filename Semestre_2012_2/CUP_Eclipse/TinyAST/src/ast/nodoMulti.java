package ast;

public class nodoMulti extends nodoOperacion {

	public nodoMulti(NodoBase opIzq, NodoBase opDer) {
		super("Multiplicacion", true);
		this.setHijoIzquierda(opIzq);
		this.setHijoDerecha(opDer);
	}

}
