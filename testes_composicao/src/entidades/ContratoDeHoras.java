package entidades;

import java.util.Date;

public class ContratoDeHoras {
	
	private Date data;
	private Double ValorPorHora;
	private Integer horas;
	
	public ContratoDeHoras() {
		
	}

	public ContratoDeHoras(Date data, Double valorPorHora, Integer horas) {
		super();
		this.data = data;
		ValorPorHora = valorPorHora;
		this.horas = horas;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorPorHora() {
		return ValorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		ValorPorHora = valorPorHora;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	public double ValorTotal() {
		return ValorPorHora * horas;
	}
	
	@Override
	public String toString() {
		return "ContratoDeHoras [data=" + data + ", ValorPorHora=" + ValorPorHora + ", horas=" + horas + "]";
	}


}
