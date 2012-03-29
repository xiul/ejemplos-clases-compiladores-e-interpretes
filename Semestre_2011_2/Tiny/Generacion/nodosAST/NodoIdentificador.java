package ast;

public class NodoIdentificador extends NodoBase {
	private String nombre;

	public NodoIdentificador(String nombre) {
		super();
		this.nombre = nombre;
	}

	public NodoIdentificador() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

}
