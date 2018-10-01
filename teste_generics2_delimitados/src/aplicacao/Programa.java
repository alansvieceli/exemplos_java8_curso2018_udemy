package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entidades.Produto;
import servicos.CalculoService;

public class Programa {

	public static void main(String[] args) {
			
		List<Produto> list = new ArrayList<>();

		String path = "C:\\Java\\projetos\\ws-eclipse\\teste_generics2_delimitados\\bin\\aplicacao\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Produto(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			Produto x = CalculoService.max(list);
			System.out.println("Maior Valor:");
			System.out.println(x);

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		} 

	}

}
