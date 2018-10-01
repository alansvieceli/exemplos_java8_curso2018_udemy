package xadrez.pecas;

import jogo.JogoTabuleiro;
import xadrez.XadrezPeca;
import xadrez.enumerados.XadrezCores;

public class Cavalo extends XadrezPeca{

	public Cavalo(JogoTabuleiro tabuleiro, XadrezCores cor) {
		super(tabuleiro, cor);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "C";
	}

}
