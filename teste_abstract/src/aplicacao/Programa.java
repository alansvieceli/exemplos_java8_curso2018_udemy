package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.enumerados.Cores;
import entidades.Forma;
import entidades.Circulo;
import entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		try {			
			List<Forma> list = new ArrayList<>();
			System.out.print("Entre com o número de formas: ");
			int n = sc.nextInt();
			
			for (int i=1; i<=n; i++) {
				System.out.println("Forma #" + i + " dados:");
				System.out.print("Retângulo or Círculo (r/c)? ");
				char ch = sc.next().charAt(0);
				System.out.print("Color (PRETO/AZUL/VERMELHO): ");
				Cores cor = Cores.valueOf(sc.next().toUpperCase());
				if (ch == 'r') {
					System.out.print("Largura: ");
					double largura = sc.nextDouble();
					System.out.print("Altura: ");
					double altura = sc.nextDouble();
					list.add(new Retangulo(cor, largura, altura));
				}
				else {
					System.out.print("Raio: ");
					double radius = sc.nextDouble();
					list.add(new Circulo(cor, radius));
				}
			}
			
			System.out.println();
			System.out.println("ÁREAS DAS FORMAS:");
			for (Forma forma : list) {
				System.out.println(String.format("%.2f", forma.area()));
			}
			
		}
		finally {
			sc.close();
		}

	}

}
