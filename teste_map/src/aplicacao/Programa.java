package aplicacao;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {

		/**
		 * 
		 * • Não admite repetições do objeto chave • Os elementos são indexados pelo
		 * objeto chave (não possuem posição) • Acesso, inserção e remoção de elementos
		 * são rápidos
		 * 
		 * • HashMap - mais rápido (operações O(1) em tabela hash) e não ordenado •
		 * TreeMap - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado
		 * pelo compareTo do objeto (ou Comparator) • LinkedHashMap - velocidade
		 * intermediária e elementos na ordem em que são adicionados
		 *
		 */

		Map<String, String> cookies = new TreeMap<>();
		cookies.put("username", "maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99771122");
		cookies.remove("email");
		cookies.put("phone", "99771133");

		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		System.out.println("ALL COOKIES:");

		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}

		System.out.println("--------------------");

		Map<Produto, Double> stock = new HashMap<>();
		
		stock.put(new Produto("Tv", 900.0), 10000.0);
		stock.put(new Produto("Notebook", 1200.0), 20000.0);
		stock.put(new Produto("Tablet", 400.0), 15000.0);
		
		Produto ps = new Produto("Tv", 900.0);
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

	}

}
