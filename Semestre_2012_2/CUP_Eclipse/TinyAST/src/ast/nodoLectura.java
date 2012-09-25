package ast;

public class nodoLectura extends NodoBase {
	private String variable;

	public nodoLectura(String variable) {
		super();
		this.variable = variable;
	}

	public String getVariable() {
		return variable;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}
	
}
