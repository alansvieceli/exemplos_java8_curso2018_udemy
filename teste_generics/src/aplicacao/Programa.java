package aplicacao;

import java.util.Scanner;

import servicos.ImpressaoService;

public class Programa {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {

			ImpressaoService<Integer> ps = new ImpressaoService<>();
			
			System.out.print("Quantos valores existem na lista? ");
			int n = sc.nextInt();
			
			for (int i = 0; i < n; i++) {
				Integer value = sc.nextInt();
				ps.adicionarValor(value);
			}
			
			ps.print();
			Integer x = ps.primeiro();
			System.out.println("Primeiro: " + x);
		}

	}

}
