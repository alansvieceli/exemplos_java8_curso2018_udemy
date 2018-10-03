package servicos;

import java.util.List;
import java.util.function.Predicate;

import entidades.Produto;

public class ProdutoService {
	
	public double somaDeFiltro(List<Produto> lista, Predicate<Produto> criterio) {
		double soma = 0.0;
		for (Produto p: lista) {
			if (criterio.test(p)) {
				soma += p.getPreco();
			}
		}		
		return soma;
	}

}
