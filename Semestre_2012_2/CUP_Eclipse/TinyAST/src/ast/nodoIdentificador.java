package ast;

public class nodoIdentificador extends NodoBase {

	private String nombre;

	public nodoIdentificador(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
