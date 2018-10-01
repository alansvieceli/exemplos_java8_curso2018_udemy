package aplicacao;

import java.util.ArrayList;
import java.util.List;

import entidades.Produto;

public class Programa {

	public static void main(String[] args0) {
		
		List<Produto> lista = new ArrayList<>();
		
		lista.add(new Produto("TV", 900.00));
		lista.add(new Produto("Notebok", 1200.00));
		lista.add(new Produto("Tablet", 450.00));
		lista.add(new Produto("Celular", 1950.00));
		
		lista.sort(new Comparador());
		
		for (Produto produto : lista) {
			System.out.println(produto);
		}
		
	}
}
