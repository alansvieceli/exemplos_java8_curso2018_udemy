package xadrez;

import jogo.JogoPeca;
import jogo.JogoTabuleiro;
import xadrez.enumerados.XadrezCores;

public class XadrezPeca extends JogoPeca {
	
	private XadrezCores cor;

	public XadrezPeca(JogoTabuleiro tabuleiro, XadrezCores cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public XadrezCores getCor() {
		return cor;
	}

}
