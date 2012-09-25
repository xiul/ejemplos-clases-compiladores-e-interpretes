package ast;

public class nodoRepeat extends NodoBase {

	private NodoBase expLogica;
	private NodoBase secuenciaSentencias;

	public nodoRepeat(NodoBase expLogica, NodoBase secuenciaSentencias) {
		super();
		this.expLogica = expLogica;
		this.secuenciaSentencias = secuenciaSentencias;
	}
	
}
