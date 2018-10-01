package jogo;

public class JogoPeca {
	
	private JogoTabuleiro tabuleiro;
	protected JogoPosicao posicao;
	
	public JogoPeca(JogoTabuleiro tabuleiro) {		
		this.tabuleiro = tabuleiro;
		posicao = null;
	}

	protected JogoTabuleiro getTabuleiro() {
		return tabuleiro;
	}

}
