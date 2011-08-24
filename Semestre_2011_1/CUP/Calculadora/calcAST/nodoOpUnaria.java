public class nodoOpUnaria extends nodoBase {

	public nodoBase hijo;
	
	public nodoOpUnaria(nodoBase operando) {
		super("nodo_Signo");
		hijo = operando;
	}

}
