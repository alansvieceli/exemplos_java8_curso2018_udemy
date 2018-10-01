package model.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.excecoes.DominioException;

public class Reservar {
	
	private Integer numeroQuarto;
	private Date dataEntrada;
	private Date dataSaida;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservar() {
		
	}

	public Reservar(Integer numeroQuarto, Date dataEntrada, Date dataSaida) throws DominioException {
		if (!dataSaida.after(dataEntrada)) {
			throw new DominioException("Data de entrada nao pode ser maior quea data de saída.");
		}
		this.numeroQuarto = numeroQuarto;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}

	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public long duracao() {
		long dif = dataSaida.getTime() - dataEntrada.getTime();
		return TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);		
	}
	
	public void atualizarEstadia(Date dataEntrada, Date dataSaida) throws DominioException {
		Date hoje = new Date();
		if (dataEntrada.before(hoje) || dataSaida.before(hoje)){
			throw new DominioException("As Datas nao deve ser anteriores a data atual.");					
		} else if (!dataSaida.after(dataEntrada)) {
			throw new DominioException("Data de entrada nao pode ser maior quea data de saída.");
		} 
		
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;				
	}

	@Override
	public String toString() {
		return "Número do quarto: " + this.numeroQuarto +
				", Entrada: " + sdf.format(this.dataEntrada) +
				" - Saída: " + sdf.format(this.dataSaida) +
				", " + this.duracao()+ " noite(s)";
	}	

}
