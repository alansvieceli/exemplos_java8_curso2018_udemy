package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.FuncTerceirizado;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			List<Funcionario> list = new ArrayList<>();
			System.out.print("Entre com o número de funcionários: ");
			int n = sc.nextInt();
			for (int i=1; i<=n; i++) {
				System.out.println("Funcionário #" + i + " dados:");
				System.out.print("Tercerizado (s/n)? ");
				char ch = sc.next().charAt(0);
				System.out.print("Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Horas: ");
				int horas = sc.nextInt();
				System.out.print("Valor por hora: ");
				double valorPorHora = sc.nextDouble();
				if (ch == 's') {
					System.out.print("Cobrança adicional: ");
					double additionalCharge = sc.nextDouble();
					list.add(new FuncTerceirizado(nome, horas, valorPorHora, additionalCharge));
				} else {
					list.add(new Funcionario(nome, horas, valorPorHora));
				}
			}
			
			System.out.println();
			System.out.println("PAGAMENTOS:");
			for (Funcionario emp : list) {
				System.out.println(emp.getNome() + " - R$ " + String.format("%.2f", emp.pagamento()));
			}
		}
		finally {
			sc.close();
		}

	}

}
