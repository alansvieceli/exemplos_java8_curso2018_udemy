package xadrez.pecas;

import jogo.JogoTabuleiro;
import xadrez.XadrezPeca;
import xadrez.enumerados.XadrezCores;

public class Torre extends XadrezPeca {

	public Torre(JogoTabuleiro tabuleiro, XadrezCores cor) {
		super(tabuleiro, cor);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "T";
	}

}
