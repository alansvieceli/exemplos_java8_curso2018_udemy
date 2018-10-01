package modelo.entidades;

import modelo.enumerados.Cor;

public abstract class Figura implements IFigura{
	
	private Cor cor;

	public Figura(Cor cor) {
		super();
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}	

}
