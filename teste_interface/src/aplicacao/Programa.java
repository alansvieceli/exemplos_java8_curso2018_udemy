package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import modelo.entidades.AluguelDeCarro;
import modelo.entidades.Veiculo;
import modelo.services.AlguelService;
import modelo.services.ImpostoBrasilService;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		
		try (Scanner sc = new Scanner(System.in)) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

			System.out.println("Entre com os dados do alguel do carro");
			System.out.print("Modelo do carro: ");
			String carModel = sc.nextLine();
			System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
			Date start = sdf.parse(sc.nextLine());
			System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
			Date finish = sdf.parse(sc.nextLine());

			AluguelDeCarro cr = new AluguelDeCarro(start, finish, new Veiculo(carModel));

			System.out.print("Preço por hora: ");
			double pricePerHour = sc.nextDouble();
			System.out.print("Peço por dia: ");
			double pricePerDay = sc.nextDouble();

			//AlguelService rentalService = new AlguelService(pricePerDay, pricePerHour, new ImpostoBrasilService());
			AlguelService rentalService = new AlguelService(pricePerDay, pricePerHour, new ImpostoBrasilService());

			rentalService.processarFatura(cr);

			System.out.println("Fatura:");
			System.out.println("Valor sem imposto: " + String.format("%.2f", cr.getFatura().getPagamentoBasico()));
			System.out.println("Imposto: " + String.format("%.2f", cr.getFatura().getImposto()));
			System.out.println("Valor do pagamento: " + String.format("%.2f", cr.getFatura().getPagamentoTotal()));
		
		}

	}

}
