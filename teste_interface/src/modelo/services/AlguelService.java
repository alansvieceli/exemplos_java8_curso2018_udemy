package modelo.services;

import modelo.entidades.AluguelDeCarro;
import modelo.entidades.Fatura;

public class AlguelService {
	
	private Double precoPorDia;
	private Double precoPorHora;
	
	//private ImpostoBrasilService impostoService;
	private IImpostoService impostoService;

	//public AlguelService(Double precoPorDia, Double precoPorHora, ImpostoBrasilService impostoService) {
	public AlguelService(Double precoPorDia, Double precoPorHora, IImpostoService impostoService) {
		super();
		this.precoPorDia = precoPorDia;
		this.precoPorHora = precoPorHora;
		this.impostoService = impostoService;
	}	
	
	public void processarFatura(AluguelDeCarro aluguel) {
		long t1 = aluguel.getInicio().getTime();
		long t2 = aluguel.getFim().getTime();
		double horas = (double)(t2 - t1) / 1000 / 60 / 60;  //dividir pra segundos / minutos / horas
		double pagamentoSemImposto = 0;
		
		if (horas <= 12.0) {
			pagamentoSemImposto = Math.ceil(horas) * precoPorHora;
		} else {
			pagamentoSemImposto = Math.ceil(horas / 24) * precoPorDia;			
		}
		
		double imposto = impostoService.imposto(pagamentoSemImposto);
				
		aluguel.setFatura(new Fatura(pagamentoSemImposto, imposto));
	}

}
