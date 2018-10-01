package modelo.services;

//public class ImpostoBrasilService {
public class ImpostoBrasilService implements IImpostoService{
	
	public double imposto (double valor) {
		
		if (valor <= 100) {
			return valor * 0.2 ;
		} else {
			return valor * 0.15;
		}		
	}

}
