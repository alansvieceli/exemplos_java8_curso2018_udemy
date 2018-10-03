package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entidades.Produto;

//https://docs.oracle.com/javase/10/docs/api/java/util/function/Function.html

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Produto> lista = new ArrayList<>();
		lista.add(new Produto("Tv", 900.00));
		lista.add(new Produto("Mouse", 50.00));
		lista.add(new Produto("Tablet", 350.50));
		lista.add(new Produto("HD Case", 80.90));
		
		
		/*
		 *
		• A função "map" (não confunda com a estrutura de dados Map) é uma
		função que aplica uma função a todos elementos de uma stream.
		• Conversões:
		• List para stream: .stream()
		• Stream para List: .collect(Collectors.toList())
		*/
		
		//Implementação da interface
		//List<String> nomes = lista.stream().map(new UppercaseNome()).collect(Collectors.toList());		
		
		//Reference method com método estático
		//List<String> nomes = lista.stream().map(Produto::staticUppercaseNome).collect(Collectors.toList());
		
		//Reference method com método não estático
		//List<String> nomes = lista.stream().map(Produto::nostaticUppercaseNome).collect(Collectors.toList());
		
		//Expressão lambda declarada
		//Function<Produto, String> func = p -> p.getNome().toString().toUpperCase();
		//List<String> nomes = lista.stream().map(func).collect(Collectors.toList());
				
		//Expressão lambda inline
		List<String> nomes = lista.stream().map(p -> p.getNome().toString().toUpperCase()).collect(Collectors.toList());
		
		
	
		nomes.forEach(System.out::println);

	}

}
