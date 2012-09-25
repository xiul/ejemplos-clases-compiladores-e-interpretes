package ast;

public class nodoOperacion extends NodoBase {
	
	private NodoBase hijoIzquierda;
	private NodoBase hijoDerecha;
	private boolean esBinaria;
	
	private String tipoOperacion;

	public boolean isEsBinaria() {
		return esBinaria;
	}

	public nodoOperacion(String tipoOperacion, boolean esBinaria) {
		super();
		this.setHijoIzquierda(null);
		this.setHijoDerecha(null);
		this.tipoOperacion = tipoOperacion;
		this.esBinaria=esBinaria;
	}

	public String getTipoOperacion() {
		return tipoOperacion;
	}

	public void setTipoOperacion(String tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}

	public NodoBase getHijoIzquierda() {
		return hijoIzquierda;
	}

	public void setHijoIzquierda(NodoBase hijoIzquierda) {
		this.hijoIzquierda = hijoIzquierda;
	}

	public NodoBase getHijoDerecha() {
		return hijoDerecha;
	}

	public void setHijoDerecha(NodoBase hijoDerecha) {
		this.hijoDerecha = hijoDerecha;
	}
	

}
