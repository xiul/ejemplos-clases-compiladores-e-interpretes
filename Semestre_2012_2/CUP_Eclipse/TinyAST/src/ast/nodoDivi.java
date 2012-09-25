package ast;

public class nodoDivi extends nodoOperacion {

	public nodoDivi(NodoBase opIzq, NodoBase opDer) {
		super("Division", true);
		this.setHijoIzquierda(opIzq);
		this.setHijoDerecha(opDer);
	}
}
