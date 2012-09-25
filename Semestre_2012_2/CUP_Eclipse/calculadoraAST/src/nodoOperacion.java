
public class nodoOperacion extends nodoBase {

	public nodoBase hijoIzquierdo;
	public nodoBase hijoDerecho;
	public int operando;
	
	public nodoOperacion(nodoBase iz, int tipo) {
		this.hijoIzquierdo=null;
		this.hijoIzquierdo=iz;
		this.operando=tipo;
	}
	
	public nodoOperacion(nodoBase iz, nodoBase der, int tipo) {
		this.hijoIzquierdo=null;
		this.hijoDerecho=null;
		this.hijoIzquierdo=iz;
		this.hijoDerecho=der;
		this.operando=tipo;
	}

}
