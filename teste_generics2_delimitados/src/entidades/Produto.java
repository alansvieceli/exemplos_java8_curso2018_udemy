package entidades;

public class Produto implements Comparable<Produto>{
	
	private String nome;
	private Double preco;
	
	public Produto(String nome, Double price) {
		this.nome = nome;
		this.preco = price;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrice() {
		return preco;
	}

	public void setPrice(Double price) {
		this.preco = price;
	}

	@Override
	public String toString() {
		return nome + ", " + String.format("%.2f", preco);
	}

	@Override
	public int compareTo(Produto args0) {
		return preco.compareTo(args0.getPrice());
	}

}
