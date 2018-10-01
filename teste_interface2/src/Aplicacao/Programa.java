package Aplicacao;

import modelo.entidades.Circulo;
import modelo.entidades.Figura;
import modelo.entidades.Retangulo;
import modelo.enumerados.Cor;

public class Programa {
	
	public static void main(String[] args) {

		Figura s1 = new Circulo(Cor.PRETO, 2.0);
		Figura s2 = new Retangulo(Cor.BRANCO, 3.0, 4.0);
		
		System.out.println("Circle color: " + s1.getCor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		System.out.println("Rectangle color: " + s2.getCor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
	}

}
