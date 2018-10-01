package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entidades.Funcionario;

public class Programa {
	
	public static void main(String[] args) {
		List<Funcionario> list = new ArrayList<>();
		String path = "C:\\Java\\projetos\\ws-eclipse\\teste_interface_comparable\\bin\\aplication\\in.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String linha = br.readLine();
			while (linha != null) {
				String[] campos = linha.split(",");
				list.add(new Funcionario(campos[0], Double.parseDouble(campos[1])));
				linha = br.readLine();
			}
			
			Collections.sort(list);
			for (Funcionario s : list) {
				System.out.println(s.toString());
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
