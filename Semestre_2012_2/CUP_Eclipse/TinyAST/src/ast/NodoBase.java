package ast;

public class NodoBase {
	
	private NodoBase HermanoDerecha;

	public boolean tieneHermano()
	{
		return HermanoDerecha!=null;
	}
	
	public NodoBase getHermanoDerecha() {
		return HermanoDerecha;
	}

	public void setHermanoDerecha(NodoBase hermanoDerecha) {
		HermanoDerecha = hermanoDerecha;
	}
	

}
