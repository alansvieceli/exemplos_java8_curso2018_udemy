package jogo;

import jogo.excecoes.JogoException;

public class JogoTabuleiro {
	
	private int linhas;
	private int colunas;
	private JogoPeca[][] pecas;
	
	public JogoTabuleiro(int linhas, int colunas) {
		
		if ((linhas < 1) || (colunas < 1)) {
			throw new JogoException("Erro ao criar tabuleiro: É necessário que tenha pelo menos uma linha e uma coluna.");  
		}
		
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new JogoPeca[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}
	
	public JogoPeca getPeca(int linha, int coluna) {
		if (!posicaoExiste(linha, coluna)) {
			throw new JogoException("Posição não encontrada no tabuleiro");
		}
		return pecas[linha][coluna];		
	}
	
	public JogoPeca getPeca(JogoPosicao posicao) {
		if (!posicaoExiste(posicao)) {
			throw new JogoException("Posição não encontrada no tabuleiro");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];		
	}
	
	public void colocarPeca(JogoPeca peca, JogoPosicao posicao) {
		if (temPecaNessaPosicao(posicao)) {
			throw new JogoException("Já existe uma peça nessa posição - " + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;	
		peca.posicao = posicao;
	}
	
	public JogoPeca removePeca(JogoPosicao posicao) {
		if (!posicaoExiste(posicao)) {
			throw new JogoException("Posição não encontrada no tabuleiro");
		}
		
		if (getPeca(posicao) == null) {
			return null;
		}
		
		JogoPeca aux = getPeca(posicao);
		aux.posicao = null;
		
		pecas[posicao.getLinha()][posicao.getColuna()] = null;
		return aux;		
	}
	
	private boolean posicaoExiste(int linha, int coluna) {
		return (linha >= 0) && (linha < linhas) && (coluna >= 0) && (coluna < colunas);		
	}
	
	public boolean posicaoExiste(JogoPosicao posicao) {
		return posicaoExiste(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean temPecaNessaPosicao(JogoPosicao posicao) {
		if (!posicaoExiste(posicao)) {
			throw new JogoException("Posição não encontrada no tabuleiro");
		}
		return getPeca(posicao) != null;		
	}

}
