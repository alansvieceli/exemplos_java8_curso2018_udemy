package aplicacao;

import java.util.ArrayList;
import java.util.List;

import entidades.Circulo;
import entidades.IFigura;
import entidades.Retangulo;

public class Programa {
	
	public static void main(String[] args) {
		
		List<IFigura> minhasFiguras = new ArrayList<>();
		minhasFiguras.add(new Retangulo(3.0, 2.0));
		minhasFiguras.add(new Circulo(2.0));
		
		List<Circulo> meusCirculos = new ArrayList<>();
		meusCirculos.add(new Circulo(2.0));
		meusCirculos.add(new Circulo(3.0));
		
		System.out.println("Total lista minhasFiguras: " + minhasFiguras.size());
		System.out.println("Total lista meusCirculos: " + meusCirculos.size());
		System.out.println("Area total: " + totalArea(minhasFiguras));
		System.out.println();
		
		copy(meusCirculos, minhasFiguras);
		System.out.println("Total lista minhasFiguras: " + minhasFiguras.size());
		System.out.println("Total lista meusCirculos: " + meusCirculos.size());
		System.out.println("Area total: " + totalArea(minhasFiguras));
	}
	
	public static double totalArea(List<? extends IFigura> lista) {
		double soma = 0.0;
		for (IFigura s : lista) {
			soma += s.area();
		}
		return soma;
	}
	
	public static void copy(List<? extends IFigura> origem, List<? super IFigura> destino) {
		for(IFigura number : origem) {
			destino.add(number);			
		}
	}

}
