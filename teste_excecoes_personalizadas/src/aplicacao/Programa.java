package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entidades.Reservar;
import model.excecoes.DominioException;

public class Programa {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static int numeroQuarto = 0;
	private static Date dataEntrada = null;
	private static Date dataSaida = null;	

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Scanner sc = new Scanner(System.in);
		try {
			try {
			
				System.out.print("Número do quarto: ");
				numeroQuarto = sc.nextInt();
				lerDados(sc);		
				
						
				Reservar reserva = new Reservar(numeroQuarto, dataEntrada, dataSaida);
				System.out.println("Dados da reserva: " + reserva);
					
				System.out.println();
				System.out.println("Entre com os dados para atualizar a estadia:");
				lerDados(sc);
					
				reserva.atualizarEstadia(dataEntrada, dataSaida);
				System.out.println("Reservation: " + reserva);
			}
			catch (ParseException e) {
				System.out.println("Formatação de data inválida");
			}
			catch (DominioException e) {
				System.out.println("Erro ao fazer reserva: " + e.getMessage());
			}
			catch (RuntimeException e) {
				System.out.println("Error inesperado");
				e.printStackTrace();
			}
			
		}
		finally {
			sc.close();
		}
	}
	
	private static void lerDados(Scanner sc) throws ParseException {		
		System.out.print("Data de entrada (dd/MM/yyyy): ");
		dataEntrada = sdf.parse(sc.next());
		System.out.print("Data de saída (dd/MM/yyyy): ");
		dataSaida = sdf.parse(sc.next());		
	}

}
