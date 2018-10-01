package dispositivos;

public class Impressora extends Dispositivo  implements IImpressora {

	public Impressora(String numeroSerial) {
		super(numeroSerial);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processarDocumento(String doc) {
		System.out.println("Procesando impressão: " + doc);		
	}	
	
	@Override
	public void imprimir(String doc) {
		System.out.println("Imprimindo: " + doc);
	}

}
