package ast;

public class NodoValor extends NodoBase {
	private int valor;

	public NodoValor(int valor) {
		super();
		this.valor = valor;
	}

	public NodoValor() {
		super();
	}
	
	public int getValor() {
		return valor;
	}

}
