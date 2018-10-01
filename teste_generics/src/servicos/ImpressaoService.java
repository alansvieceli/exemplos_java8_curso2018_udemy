package servicos;

import java.util.ArrayList;
import java.util.List;

public class ImpressaoService<T> {
	
	private List<T> lista = new ArrayList<>();

	public void adicionarValor(T valor) {
		lista.add(valor);
	}

	public T primeiro() {
		if (lista.isEmpty()) {
			throw new IllegalStateException("A Lista está vazia");
		}
		return lista.get(0);
	}

	public void print() {
		System.out.print("[");
		if (!lista.isEmpty()) {
			System.out.print(lista.get(0));
		}
		for (int i = 1; i < lista.size(); i++) {
			System.out.print(", " + lista.get(i));
		}
		System.out.println("]");
	}

}
