package aplicacao;

import java.util.Comparator;

import entidades.Produto;

public class Comparador implements Comparator<Produto> {

	@Override
	public int compare(Produto p1, Produto p2) {
		// TODO Auto-generated method stub
		return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
	}

}
