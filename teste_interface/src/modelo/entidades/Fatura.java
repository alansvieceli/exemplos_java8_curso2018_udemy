package modelo.entidades;

public class Fatura {
	
	private Double pagamentoBasico;
	private Double Imposto;
	
	public Fatura() {
		
	}

	public Fatura(Double pagamentoBasico, Double imposto) {
		super();
		this.pagamentoBasico = pagamentoBasico;
		Imposto = imposto;
	}

	public Double getPagamentoBasico() {
		return pagamentoBasico;
	}

	public void setPagamentoBasico(Double pagamentoBasico) {
		this.pagamentoBasico = pagamentoBasico;
	}

	public Double getImposto() {
		return Imposto;
	}

	public void setImposto(Double imposto) {
		Imposto = imposto;
	}
	
	public Double getPagamentoTotal() {
		return this.getPagamentoBasico() + this.getImposto();
	}	

}
