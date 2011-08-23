package ast;

public class NodoValor extends NodoBase {
	private String nombre;

	public NodoValor(String nombre) {
		super();
		this.nombre = nombre;
	}

	public NodoValor() {
		super();
	}

	public String getNombre() {
		return nombre;
	}


}
