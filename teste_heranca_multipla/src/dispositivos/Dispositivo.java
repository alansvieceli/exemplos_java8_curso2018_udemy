package dispositivos;

public abstract class Dispositivo {

	private String numeroSerial;

	public String getNumeroSerial() {
		return numeroSerial;
	}

	public void setNumeroSerial(String numeroSerial) {
		this.numeroSerial = numeroSerial;
	}

	public Dispositivo(String numeroSerial) {
		super();
		this.numeroSerial = numeroSerial;
	}

	public abstract void processarDocumento(String doc);
	
}
