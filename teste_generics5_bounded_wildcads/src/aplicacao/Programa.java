package aplicacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programa {
	
	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();		
		
		copy(myInts, myObjs);
		imprimirLista(myObjs);
		
		copy(myDoubles, myObjs);
		imprimirLista(myObjs);	
		
	}
	 
	//? extends Number = covariancia, trabalha com sub tipos, pode ler
	//? supoer Number = contravariancia, trabalhja com super tipos, pode add
	
	public static void copy(List<? extends Number> origem, List<? super Number> destino) {
		for(Number number : origem) {
			destino.add(number);			
		}
	}
	
	public static void imprimirLista(List<?> lista) {
		for(Object obj : lista) {
			
			System.out.println(obj + " ");
			
		}
		System.out.println();
		
	}


}
