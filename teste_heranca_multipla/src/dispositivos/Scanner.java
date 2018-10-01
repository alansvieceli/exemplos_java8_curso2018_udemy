package dispositivos;

public class Scanner extends Dispositivo implements IScanner{
	
	public Scanner(String numeroSerial) {
		super(numeroSerial);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void processarDocumento(String doc) {
		System.out.println("Procesando scaneamento: " + doc);		
	}
	
	@Override
	public String scanear() {
		return "Conteudo Scaneado";
	}

}
