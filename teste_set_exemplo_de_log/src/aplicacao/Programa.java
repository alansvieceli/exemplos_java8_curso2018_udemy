package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entidades.EntradaDeLog;

public class Programa {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			//C:\Java\projetos\ws-eclipse-testes\teste_set_exemplo_de_log\bin\aplicacao\in.txt
			System.out.print("Caminho completo do arquivo: ");
			String path = sc.nextLine();

			try (BufferedReader br = new BufferedReader(new FileReader(path))) {

				Set<EntradaDeLog> set = new HashSet<>(); //mais rápido, nao importa a ordem, nao vai incluir repetido

				String line = br.readLine();
				while (line != null) {

					String[] fields = line.split(" ");
					String usuario = fields[0];
					Date dataentrada = Date.from(Instant.parse(fields[1]));

					set.add(new EntradaDeLog(usuario, dataentrada));

					line = br.readLine();
				}
				System.out.println("Total de usuários: " + set.size());

			} catch (IOException e) {
				System.out.println("Erro: " + e.getMessage());
			}
		}

	}

}
