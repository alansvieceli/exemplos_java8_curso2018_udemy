package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			//System.out.print("Enter full file path: ");
			//String path = sc.nextLine();
			String path = "C:\\Java\\projetos\\ws-eclipse-testes\\teste_stream2\\in.txt";

			try (BufferedReader br = new BufferedReader(new FileReader(path))) {

				List<Produto> lista = new ArrayList<>();

				String linha = br.readLine();
				while (linha != null) {
					String[] fields = linha.split(",");
					lista.add(new Produto(fields[0], Double.parseDouble(fields[1])));
					linha = br.readLine();
				}

				double media = lista.stream().map(p -> p.getPreco()).reduce(0.0, (x, y) -> x + y) / lista.size();

				System.out.println("Media de preço: " + String.format("%.2f", media));

				//ordem alfabética inversa
				Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

				//lista de produtos q tem o preço abaixo da média e ordenado pela ordem alfabérica inversa
				List<String> names = lista.stream().filter(p -> p.getPreco() < media).map(p -> p.getNome())
						.sorted(comp.reversed()).collect(Collectors.toList());

				names.forEach(System.out::println);

			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}

	}

}
