package aplicacao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Programa {

	public static void main(String[] args) {

		List<Integer> lista = Arrays.asList(3, 4 , 5, 10, 7);
		Stream<Integer> listaS1 = lista.stream();;		
		System.out.println(Arrays.toString(listaS1.toArray()));
		
		Stream<Integer> listaS2 = lista.stream().map(x -> x * 10);;		
		System.out.println(Arrays.toString(listaS2.toArray()));
		
		Stream<String> listaS3 = Stream.of("Alan", "Jaque", "Rosa", "Mana");		
		System.out.println(Arrays.toString(listaS3.toArray()));
		
		Stream<Integer> str = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(str.limit(10).toArray()));
		
		Stream<Long> fibonacci = Stream.iterate(new Long[] {0L, 1L}, x -> new Long[] {x[1], x[0]+ x[1]}).map(p -> p[0]);
		System.out.println(Arrays.toString(fibonacci.limit(10).toArray()));
	}
}
