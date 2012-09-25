
public class ValorIdentificador {

	public ValorIdentificador(String tipo, String nombre) {
		this.tipo = tipo;
		this.nombre = nombre;
	}
	
	public ValorIdentificador(String nombre) {
		this.tipo = "NaN";
		this.nombre = nombre;
	}
	
	public String nombre;
	public String tipo;
	public int intValor;
	public float floatValor;
	
}
