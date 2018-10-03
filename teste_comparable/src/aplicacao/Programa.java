package aplicacao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entidades.Produto;

public class Programa {

	public static int compareProducts(Produto p1, Produto p2) {
		return p1.getPreco().compareTo(p2.getPreco());
	}

	public static void main(String[] args0) {

		// • Comparator objeto de classe separada

		List<Produto> lista = new ArrayList<>();

		lista.add(new Produto("TV", 900.00));
		lista.add(new Produto("Notebok", 1200.00));
		lista.add(new Produto("Tablet", 450.00));
		lista.add(new Produto("Celular", 1950.00));

		lista.sort(new Comparador());

		for (Produto produto : lista) {
			System.out.println(produto);
		}

		System.out.println("--------------------");

		// • Comparator objeto de classe anônima
		List<Produto> lista2 = new ArrayList<>();

		lista2.add(new Produto("TV", 900.00));
		lista2.add(new Produto("Notebok", 1200.00));
		lista2.add(new Produto("Tablet", 450.00));
		lista2.add(new Produto("Celular", 1950.00));

		Comparator<Produto> comp = new Comparator<Produto>() {

			@Override
			public int compare(Produto p1, Produto p2) { //
				return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
			}
		};

		lista2.sort(comp);

		for (Produto produto : lista2) {
			System.out.println(produto);
		}

		System.out.println("--------------------");

		// usando expressao lambda
		List<Produto> lista3 = new ArrayList<>();

		lista3.add(new Produto("TV", 900.00));
		lista3.add(new Produto("Notebok", 1200.00));
		lista3.add(new Produto("Tablet", 450.00));
		lista3.add(new Produto("Celular", 1950.00));

		// • Comparator objeto de expressão lambda com chaves
		// Comparator<Produto> comp2 = (p1, p2) -> {
		// return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
		// };

		// • Comparator objeto de expressão lambda sem chaves
		// Comparator<Produto> comp2 = (p1, p2) ->
		// p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());

		// lista3.sort(comp2);

		// • Comparator expressão lambda "direto no argumento"

		lista3.sort((p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));

		for (Produto produto : lista3) {
			System.out.println(produto);
		}
		
		System.out.println("--------------------");
		
		//-----OBJETOS DE PRIMEIRA ORDEM
		// usando expressao lambda
		List<Produto> lista4 = new ArrayList<>();

		lista4.add(new Produto("TV", 900.00));
		lista4.add(new Produto("Notebok", 1200.00));
		lista4.add(new Produto("Tablet", 450.00));
		lista4.add(new Produto("Celular", 1950.00));
		
		lista4.sort(Programa::compareProducts);

		for (Produto produto : lista4) {
			System.out.println(produto);
		}
	}
}
