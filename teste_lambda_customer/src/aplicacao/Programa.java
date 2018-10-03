package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entidades.Produto;

//https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Produto> lista = new ArrayList<>();
		lista.add(new Produto("Tv", 900.00));
		lista.add(new Produto("Mouse", 50.00));
		lista.add(new Produto("Tablet", 350.50));
		lista.add(new Produto("HD Case", 80.90));
		
		for (Produto produto : lista) {
			System.out.println(produto);
		}
		
		System.out.println("---------------------");
		
		//Implementação da interface
		//lista.forEach(new AtualizarPreco());
		
		//Reference method com método estático
		//lista.forEach(Produto::staticAtualizarPreco);
		
		//Reference method com método não estático
		//lista.forEach(Produto::notstaticAtualizarPreco);
		
		//Expressão lambda declarada
		/*
		Consumer<Produto> cons = p ->{
			p.setPreco(p.getPreco() * 1.1);
		};
		lista.forEach(cons);
		*/
		
		//Expressão lambda inline
		lista.forEach(p -> p.setPreco(p.getPreco() * 1.1));
		
		lista.forEach(System.out::println);

	}

}
