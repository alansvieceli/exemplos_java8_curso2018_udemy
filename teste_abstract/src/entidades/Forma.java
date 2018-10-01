package entidades;

import entidades.enumerados.Cores;

public abstract class Forma {
	
	private Cores cor;
	
	public Forma() {
		
	}

	public Forma(Cores cor) {
		super();
		this.cor = cor;
	}

	public Cores getCor() {
		return cor;
	}

	public void setCor(Cores cor) {
		this.cor = cor;
	}
	
	public abstract Double area();
	
}
