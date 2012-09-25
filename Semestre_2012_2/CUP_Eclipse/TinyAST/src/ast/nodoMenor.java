package ast;

public class nodoMenor extends nodoOperacion {
	public nodoMenor(NodoBase opIzq, NodoBase opDer) {
		super("Comparacion <", true);
		this.setHijoIzquierda(opIzq);
		this.setHijoDerecha(opDer);
	}
}
