package ast;

public class nodoNumero extends NodoBase {

	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public nodoNumero(int valor) {
		super();
		this.valor = valor;
	}
	
}
