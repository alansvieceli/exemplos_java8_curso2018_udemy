package aplicacao;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Set<String> set = new HashSet<>(); // mais r�pido (opera��es O(1) em tabela
		// hash) e n�o ordenado
		// Set<String> set = new TreeSet<>(); // mais lento (opera��es O(log(n)) em
		// �rvore rubro-negra) e ordenado pelo compareTo do objeto (ou Comparator)
		Set<String> set = new LinkedHashSet<>(); // velocidade intermedi�ria e elementos na ordem em que s�o adicionados
		set.add("Televisao");
		set.add("Tablet");
		set.add("Notebook");

		System.out.println(set.contains("Notebook"));

		for (String p : set) {
			System.out.println(p);
		}

		System.out.println("----------------------------------------------");

		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(1, 3, 5, 7, 8, 9, 10));
		
		// uni�o
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		// intersec��o
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		
		// diferen�a
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);

	}

}
