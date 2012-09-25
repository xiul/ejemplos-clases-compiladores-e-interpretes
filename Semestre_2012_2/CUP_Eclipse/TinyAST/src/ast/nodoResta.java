package ast;

public class nodoResta extends nodoOperacion {

	public nodoResta(NodoBase opIzq, NodoBase opDer) {
		super("Resta", true);
		this.setHijoIzquierda(opIzq);
		this.setHijoDerecha(opDer);
	}
}
