package ast;

public class NodoLeer extends NodoBase {
	private String id;

	public NodoLeer(String identificador) {
		super();
		this.id = identificador;
	}

	public NodoLeer() {
		super();
		id="";
	}

	public String getId() {
		return id;
	}

	public void setExpresion(String identificador) {
		this.id = identificador;
	}

}
