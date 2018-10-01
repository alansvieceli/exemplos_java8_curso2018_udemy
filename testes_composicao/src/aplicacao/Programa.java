package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.ContratoDeHoras;
import entidades.Departamento;
import entidades.Trabalhador;
import entidades.enumerados.NivelDeTrabalho;

public class Programa {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub		

		Scanner sc = new Scanner(System.in);
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			System.out.print("Entre com o departamento: ");
			String nomedepartamento = sc.nextLine();
			System.out.println("Entre com os dados do trabalhador:");
			System.out.print("Nome: ");
			String nometrabalhador = sc.nextLine();
			System.out.print("Nível: ");
			String niveltrabalhador = sc.nextLine();
			System.out.print("Salário base: ");
			double salariobase = sc.nextDouble();
			Trabalhador trabalhador = new Trabalhador(nometrabalhador, NivelDeTrabalho.valueOf(niveltrabalhador), salariobase, new Departamento(nomedepartamento));

			System.out.print("Quantos contratos para esse trabalhador? ");
			int n = sc.nextInt();		

			for (int i=1; i<=n; i++) {
				System.out.println("Entre com contrato #" + i + " dados:");
				System.out.print("Data (DD/MM/YYYY): ");
				Date datadocontrato = sdf.parse(sc.next());
				System.out.print("Valor por hora: ");
				double valorporhora = sc.nextDouble();
				System.out.print("Duração (horas): ");
				int horasduracao = sc.nextInt();
				ContratoDeHoras contrato = new ContratoDeHoras(datadocontrato, valorporhora, horasduracao);
				trabalhador.AdicionarContrato(contrato);
			}


			//System.out.println(trabalhador.toString());		

			System.out.println();
			System.out.print("Entre com o mes e o ano para calcular o valor total (MM/YYYY): ");
			String monthAndYear = sc.next();
			int month = Integer.parseInt(monthAndYear.substring(0, 2));
			int year = Integer.parseInt(monthAndYear.substring(3));
			System.out.println("Nome: " + trabalhador.getNome());
			System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
			System.out.println("Valor Recebido " + monthAndYear + ": " + String.format("%.2f", trabalhador.CalcularHoras(year, month)));

		}
		finally {
			sc.close();
		}

	}

}
