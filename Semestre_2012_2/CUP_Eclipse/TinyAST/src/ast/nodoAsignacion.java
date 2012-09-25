package ast;

public class nodoAsignacion extends NodoBase {
	
	public nodoAsignacion(String hijoIzquierda, NodoBase hijoDerecha) {
		super();
		HijoIzquierda = new nodoIdentificador(hijoIzquierda);
		HijoDerecha = hijoDerecha;
	}
	private nodoIdentificador HijoIzquierda;
	private NodoBase HijoDerecha;
	
	

}
