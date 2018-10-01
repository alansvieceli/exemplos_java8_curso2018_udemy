package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.enumerados.NivelDeTrabalho;

public class Trabalhador {
	
	private String nome;
	private NivelDeTrabalho nivel;
	private Double SalarioBase;
	
	private Departamento departamento;
	private List<ContratoDeHoras> contratos = new ArrayList<>();
	
	public Trabalhador() {
		
	}

	public Trabalhador(String nome, NivelDeTrabalho nivel, double i, Departamento departamento) {
		super();
		this.nome = nome;
		this.nivel = nivel;
		SalarioBase = i;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelDeTrabalho getNivel() {
		return nivel;
	}

	public void setNivel(NivelDeTrabalho nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return SalarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		SalarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoDeHoras> getContratos() {
		return contratos;
	}

	public void AdicionarContrato(ContratoDeHoras contrato) {
		contratos.add(contrato);		
	}
	
	public void RemoverContrato(ContratoDeHoras contrato) {
		contratos.remove(contrato);
	}
	
	public double CalcularHoras(int ano, int mes) {
		double soma = this.getSalarioBase();
		Calendar cal = Calendar.getInstance();
		for (ContratoDeHoras contratoDeHoras : contratos) {
			cal.setTime(contratoDeHoras.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = cal.get(Calendar.MONTH) + 1; //os meses iniciam com 0
			
			if ((c_ano == ano) && (c_mes == mes)) {
				soma += contratoDeHoras.ValorTotal();
			}			
		}
		return soma;		
	}

	@Override
	public String toString() {
		String ret = "Trabalhador [nome=" + nome + ", nivel=" + nivel + ", SalarioBase=" + SalarioBase + ", departamento="
				+ departamento + "]";
		
		ret += "\n";
		for (ContratoDeHoras ch : this.getContratos()) {
			ret += "  - " + ch.toString() + '\n';
		}
		
		return ret;
		
	}
	
	
	
}
