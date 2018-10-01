package dispositivos;

public class Multifuncional extends Dispositivo implements IScanner, IImpressora{

	public Multifuncional(String numeroSerial) {
		super(numeroSerial);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimir(String doc) {
		System.out.println("Multifuncional imprimir");
		
		
	}

	@Override
	public String scanear() {
		// TODO Auto-generated method stub
		return "Multifuncional resultado";
	}

	@Override
	public void processarDocumento(String doc) {
		// TODO Auto-generated method stub
		System.out.println("Multifuncional processarDocumento");
		
	}

}

