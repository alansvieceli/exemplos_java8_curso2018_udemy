package xadrez;

import jogo.JogoPosicao;
import xadrez.excecoes.XadrezException;

public class XadrezPosicao {
	private char coluna;
	private int linha;
	
	public XadrezPosicao(char coluna, int linha) {
		
		if ((linha < 1) || (linha > XadrezFuncoes.TOTAL_LINHAS) || (XadrezFuncoes.getIndexAlfabeto(coluna) < 0) || (XadrezFuncoes.getIndexAlfabeto(coluna) > XadrezFuncoes.TOTAL_COLUNAS)) {
			throw new XadrezException("Erro ao iniciar jogo de xadrez. Possições inválidas");
		}
		this.linha = linha;
		this.coluna = coluna;		
	}

	public char getColuna() {
		return coluna;
	}

	public int getLinha() {
		return linha;
	}
	
	protected JogoPosicao converterParaPosicao() {
		return new JogoPosicao(XadrezFuncoes.TOTAL_LINHAS - linha, XadrezFuncoes.getIndexAlfabeto(coluna) );		
	}
	
	protected static XadrezPosicao converterdePosicao(JogoPosicao posicao) {
		return new XadrezPosicao(XadrezFuncoes.alfabeto[posicao.getColuna()].charAt(0), posicao.getLinha());		
	}

	@Override
	public String toString() {
		return "" + coluna + linha;
	}
	
	
}
