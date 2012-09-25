package ast;

public class nodoSuma extends nodoOperacion {

	public nodoSuma(NodoBase opIzq, NodoBase opDer) {
		super("Suma", true);
		this.setHijoIzquierda(opIzq);
		this.setHijoDerecha(opDer);
	}
	
}
