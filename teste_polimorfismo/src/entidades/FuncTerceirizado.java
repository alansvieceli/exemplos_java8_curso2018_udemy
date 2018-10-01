package entidades;

public class FuncTerceirizado extends Funcionario {
	
	private Double custoAdicional;
	
	public FuncTerceirizado() {
		super();
	}

	public FuncTerceirizado(String nome, Integer horas, Double valorPorHora, Double custoAdicional) {
		super(nome, horas, valorPorHora);
		this.custoAdicional = custoAdicional;
	}

	public Double getCustoAdicional() {
		return custoAdicional;
	}

	public void setCustoAdicional(Double custoAdicional) {
		this.custoAdicional = custoAdicional;
	}

	@Override
	public double pagamento() {
		// TODO Auto-generated method stub
		return super.pagamento() + (custoAdicional * 1.1);		
	}
	

}
