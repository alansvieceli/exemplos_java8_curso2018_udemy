package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entidades.Produto;

//� https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html

public class Programa {
	
	public static void main(String[] main) {
		
		List<Produto> lista = new ArrayList<>();
		lista.add(new Produto("Tv", 900.00));
		lista.add(new Produto("Mouse", 50.00));
		lista.add(new Produto("Tablet", 350.50));
		lista.add(new Produto("HD Case", 80.90));
		
		//implementando a interface
		//lista.removeIf(new ProdutoPredicate());
		
		//Reference method com m�todo est�tico
		//lista.removeIf(Produto::ProdutoPredicate);
		
		//Reference method com m�todo n�o est�tico
		//lista.removeIf(Produto::ProdutoPredicate);
		
		//Express�o lambda declarada
		//Predicate<Produto> pred = p -> p.getPreco() > 100;
		//lista.removeIf(pred);
		
		//Express�o lambda inline
		//lista.removeIf(p -> p.getPreco() >= 100);
		
		for (Produto produto : lista) {
			System.out.println(produto);
		}
		
	}

}
