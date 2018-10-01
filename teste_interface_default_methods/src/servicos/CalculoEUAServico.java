package servicos;

public class CalculoEUAServico implements ICalculoService{
	
	private double taxaDeJuros;

	public CalculoEUAServico(double taxaDeJuros) {
		super();
		this.taxaDeJuros = taxaDeJuros;
	}

	@Override
	public double getTaxaDeJuros() {
		return taxaDeJuros;
	}

}
