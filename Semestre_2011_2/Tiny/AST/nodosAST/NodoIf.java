package ast;

public class NodoIf extends NodoBase {

	private NodoBase prueba;
	private NodoBase parteThen;
	private NodoBase parteElse;
	
	public NodoIf(NodoBase prueba, NodoBase parteThen) {
		super();
		this.prueba = prueba;
		this.parteThen = parteThen;
		this.parteElse = null;
	}
	
	public NodoIf(NodoBase prueba, NodoBase parteThen, NodoBase parteElse) {
		super();
		this.prueba = prueba;
		this.parteThen = parteThen;
		this.parteElse = parteElse;
	}
	
	public NodoIf() {
		super();
		this.prueba = null;
		this.parteThen = null;
		this.parteElse = null;		
	}

	public NodoBase getPrueba() {
		return prueba;
	}

	public void setPrueba(NodoBase prueba) {
		this.prueba = prueba;
	}

	public NodoBase getParteThen() {
		return parteThen;
	}

	public void setParteThen(NodoBase parteThen) {
		this.parteThen = parteThen;
	}

	public NodoBase getParteElse() {
		return parteElse;
	}

	public void setParteElse(NodoBase parteElse) {
		this.parteElse = parteElse;
	}
	
	
	
}
