package ast;

public class NodoOperacion extends NodoBase {
		
	private NodoBase opIzquierdo;
	private NodoBase opDerecho;
	private tipoOp operacion;
	
	public NodoOperacion(NodoBase opIzquierdo, tipoOp tipoOperacion, NodoBase opDerecho) {
		super();
		this.opIzquierdo = opIzquierdo;
		this.opDerecho = opDerecho;
	}

	public NodoOperacion(tipoOp tipoOperacion) {
		super();
		this.opIzquierdo = null;
		this.opDerecho = null;
	}

	public NodoBase getOpIzquierdo() {
		return opIzquierdo;
	}

	public void setOpIzquierdo(NodoBase opIzquierdo) {
		this.opIzquierdo = opIzquierdo;
	}

	public NodoBase getOpDerecho() {
		return opDerecho;
	}

	public void setOpDerecho(NodoBase opDerecho) {
		this.opDerecho = opDerecho;
	}

	public tipoOp getOperacion() {
		return operacion;
	}

	
}
