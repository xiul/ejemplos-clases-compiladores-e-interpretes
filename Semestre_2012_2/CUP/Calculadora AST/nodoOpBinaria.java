
public class nodoOpBinaria extends nodoBase {

	//public enum tipoOperador {suma ,resta ,multi ,divi, potencia};
	public nodoBase hijoIzq;
	public nodoBase hijoDer;
	public String tipoOp; 

	public nodoOpBinaria(
						nodoBase operandoIzquierda,
						nodoBase operandoDerecha,
						String tipo) {
		super("Op_Binaria");
		hijoIzq = operandoIzquierda;
		hijoDer = operandoDerecha;
		tipoOp = tipo;
	}
}
