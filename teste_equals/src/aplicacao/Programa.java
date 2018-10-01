package aplicacao;

import entidades.Cliente;

public class Programa {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Alan Silva", "alansvieceli@gmail.com");
		Cliente c2 = new Cliente("Alan Vieceli", "alan.vieceli@gmail.com");
		Cliente c3 = new Cliente("Alan Vieceli", "alan.vieceli@gmail.com");
		Cliente c4 = new Cliente("Alan Silva", "alan.vieceli@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c4.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c3.equals(c2));
		System.out.println(c1.equals(c4));		
	}

}
