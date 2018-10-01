package aplicacao;

import dispositivos.Impressora;
import dispositivos.Multifuncional;
import dispositivos.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Impressora p = new Impressora("1080");
		p.processarDocumento("Teste Alan imp");
		p.imprimir("Teste Alan imp2");
		System.out.println();
		
		
		Scanner s = new Scanner("2003");
		s.processarDocumento("Teste Alan scan");		
		System.out.println("Resultado do scanner: " + s.scanear());
		System.out.println();
		
		Multifuncional m = new Multifuncional("2244");
		m.processarDocumento("AABC");
		m.imprimir("Teste multifuncional");
		System.out.println("Resultado do multifuncional: " + m.scanear());	 

	}

}
