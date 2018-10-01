package servicos;

public class CalculoBrasilServico implements ICalculoService{
	
	private double taxaDeJuros;

	public CalculoBrasilServico(double taxaDeJuros) {
		super();
		this.taxaDeJuros = taxaDeJuros;
	}

	@Override
	public double getTaxaDeJuros() {
		return taxaDeJuros;
	}

}
