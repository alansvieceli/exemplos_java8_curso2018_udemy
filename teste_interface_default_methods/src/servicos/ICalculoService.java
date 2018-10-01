package servicos;

import java.security.InvalidParameterException;

public interface ICalculoService {
	
	double getTaxaDeJuros();
	
	default double pagamento(double qtde, int meses) {
		if (meses < 1) {
			throw new InvalidParameterException("Meses não pode ser menores que 1");
		}
		
		return qtde * Math.pow(1.0 + getTaxaDeJuros() / 100.0, meses);
	}

}
