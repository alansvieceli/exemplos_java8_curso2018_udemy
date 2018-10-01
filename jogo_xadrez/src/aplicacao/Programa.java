package aplicacao;

import java.util.Scanner;

import xadrez.XadrezPartida;
import xadrez.XadrezPeca;
import xadrez.XadrezPosicao;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		try
		{
		
			XadrezPartida jogo = new XadrezPartida();
			while (true) {
				UI.imprimirTabuleiro(jogo.getPecas());
				System.out.println();
				System.out.print("Origem: ");
				XadrezPosicao origem = UI.lerXadrezPosition(sc);
				
				System.out.println();
				System.out.print("Destino: ");
				XadrezPosicao destino = UI.lerXadrezPosition(sc);
				
				XadrezPeca pecaCapturada = jogo.moverPeca(origem, destino);
			}
		
		}
		finally {
			sc.close();
		}

	}

}
