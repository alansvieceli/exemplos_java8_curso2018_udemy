package aplicacao;

import java.util.ArrayList;
import java.util.List;

import entidades.Produto;
import servicos.ProdutoService;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Produto> lista = new ArrayList<>();
		lista.add(new Produto("Tv", 900.00));
		lista.add(new Produto("Mouse", 50.00));
		lista.add(new Produto("Tablet", 350.50));
		lista.add(new Produto("HD Case", 80.90));
			
		lista.forEach(System.out::println);
		
		System.out.println("-------------------");
		
		ProdutoService ps = new ProdutoService();
		double soma = ps.somaDeFiltro(lista, p -> p.getNome().charAt(0) == 'T');
		System.out.println("A soma dos produtos iniciados com T: "+ String.format("%.2f", soma));
		soma = ps.somaDeFiltro(lista, p -> p.getNome().charAt(0) == 'M');
		System.out.println("A soma dos produtos iniciados com M: "+ String.format("%.2f", soma));
		soma = ps.somaDeFiltro(lista, p -> p.getPreco() <= 100);
		System.out.println("A soma dos produtos iniciados com M: "+ String.format("%.2f", soma));

	}

}
