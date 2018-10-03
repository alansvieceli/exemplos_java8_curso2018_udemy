package util;

import java.util.function.Function;

import entidades.Produto;

public class UppercaseNome implements Function<Produto, String>{

	@Override
	public String apply(Produto p) {		
		return p.getNome().toUpperCase();
	}

}
