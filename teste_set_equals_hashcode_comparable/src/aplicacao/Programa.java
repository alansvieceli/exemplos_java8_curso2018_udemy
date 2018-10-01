package aplicacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {

		Set<Produto> set = new HashSet<>();
		set.add(new Produto("TV", 900.0));
		set.add(new Produto("Notebook", 1200.0));
		set.add(new Produto("Tablet", 400.0));

		Produto prod = new Produto("Notebook", 1200.0);

		// Se hashCode e equals NÃO estiverem implementados, na class product ele vai
		// comparar as referencias dos objetos
		System.out.println(set.contains(prod));

		System.out.println("----------------------------------");
		
		//Se nao implementar o compareTo implementar Comparable<Produto> , ele vai dar erro quando tentar ordenar
		Set<Produto> set2 = new TreeSet<>();
		set2.add(new Produto("TV", 900.0));
		set2.add(new Produto("Notebook", 1200.0));
		set2.add(new Produto("Tablet", 400.0));
		for (Produto p : set2) {
			System.out.println(p);
		}

	}

}
