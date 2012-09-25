package ast;

public class nodoIf extends NodoBase {

	private NodoBase expLogica;
	private NodoBase parteThen;
	private NodoBase parteElse;
	
	public nodoIf(NodoBase expLogica, NodoBase parteThen, NodoBase parteElse) {
		super();
		this.expLogica = expLogica;
		this.parteThen = parteThen;
		this.parteElse = parteElse;
	}

	public nodoIf(NodoBase expLogica, NodoBase parteThen) {
		super();
		this.expLogica = expLogica;
		this.parteThen = parteThen;
		this.parteElse = null;
	}
	
	
	
	
}
