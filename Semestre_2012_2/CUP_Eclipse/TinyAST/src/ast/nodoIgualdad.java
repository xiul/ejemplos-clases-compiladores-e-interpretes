package ast;

public class nodoIgualdad extends nodoOperacion {
	public nodoIgualdad(NodoBase opIzq, NodoBase opDer) {
		super("Comparacion =", true);
		this.setHijoIzquierda(opIzq);
		this.setHijoDerecha(opDer);
	}
}
