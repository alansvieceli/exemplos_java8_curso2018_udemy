package aplicacao;

import java.util.Scanner;

import servicos.CalculoBrasilServico;
import servicos.CalculoEUAServico;
import servicos.ICalculoService;

public class Programa {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)){		
			System.out.println("Quantidade: ");
			double qtde = sc.nextDouble();
			
			System.out.println("Meses: ");
			int meses = sc.nextInt();
			
			ICalculoService cbs = new CalculoBrasilServico(2.0);
			double pagamentoB = cbs.pagamento(qtde, meses);
			
			System.out.println("Pagamento depois de " + meses + " meses: ");
			System.out.println(String.format("%.2f", pagamentoB));
			
			System.out.println("--------");
			
			ICalculoService cus = new CalculoEUAServico(1.0);
			double pagamentoU = cus.pagamento(qtde, meses);
			
			System.out.println("Pagamento depois de " + meses + " meses: ");
			System.out.println(String.format("%.2f", pagamentoU));
		}

	}

}
