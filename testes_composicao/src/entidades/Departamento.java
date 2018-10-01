package entidades;

public class Departamento {
	
	@Override
	public String toString() {
		return "Departamento [nome=" + nome + "]";
	}

	private String nome;
	
	public Departamento() {
		
	}

	public Departamento(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
