package xadrez;

import jogo.JogoPeca;
import jogo.JogoPosicao;
import jogo.JogoTabuleiro;
import xadrez.enumerados.XadrezCores;
import xadrez.excecoes.XadrezException;
import xadrez.pecas.Bispo;
import xadrez.pecas.Cavalo;
import xadrez.pecas.Peao;
import xadrez.pecas.Rainha;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class XadrezPartida {
	
	private JogoTabuleiro tabuleiro;
	
	public XadrezPartida() {
		tabuleiro = new JogoTabuleiro(XadrezFuncoes.TOTAL_LINHAS, XadrezFuncoes.TOTAL_COLUNAS);
		IniciarJogo();
	}
	
	public XadrezPeca[][] getPecas(){
		XadrezPeca[][] mat = new XadrezPeca[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		
		for (int x=0; x < tabuleiro.getColunas(); x++) {
			for (int y=0; y < tabuleiro.getLinhas(); y++) {
				mat[x][y] = (XadrezPeca) tabuleiro.getPeca(x, y);
			}			
		}
		
		return mat;
	}
	
	private void IniciarPretas() {
		colocarPeca('a', 8, new Torre(tabuleiro, XadrezCores.PRETO));
		colocarPeca('b', 8, new Cavalo(tabuleiro, XadrezCores.PRETO));
		colocarPeca('c', 8, new Bispo(tabuleiro, XadrezCores.PRETO));
		colocarPeca('d', 8, new Rainha(tabuleiro, XadrezCores.PRETO));
		colocarPeca('e', 8, new Rei(tabuleiro, XadrezCores.PRETO));
		colocarPeca('f', 8, new Bispo(tabuleiro, XadrezCores.PRETO));
		colocarPeca('g', 8, new Cavalo(tabuleiro, XadrezCores.PRETO));
		colocarPeca('h', 8, new Torre(tabuleiro, XadrezCores.PRETO));
		
		colocarPeca('a', 7, new Peao(tabuleiro, XadrezCores.PRETO));
		colocarPeca('b', 7, new Peao(tabuleiro, XadrezCores.PRETO));
		colocarPeca('c', 7, new Peao(tabuleiro, XadrezCores.PRETO));
		colocarPeca('d', 7, new Peao(tabuleiro, XadrezCores.PRETO));
		colocarPeca('e', 7, new Peao(tabuleiro, XadrezCores.PRETO));
		colocarPeca('f', 7, new Peao(tabuleiro, XadrezCores.PRETO));
		colocarPeca('g', 7, new Peao(tabuleiro, XadrezCores.PRETO));
		colocarPeca('h', 7, new Peao(tabuleiro, XadrezCores.PRETO));
	}
	
	private void IniciarBrancas() {		
		colocarPeca('a', 1, new Torre(tabuleiro, XadrezCores.BRANCO));
		colocarPeca('b', 1, new Cavalo(tabuleiro, XadrezCores.BRANCO));
		colocarPeca('c', 1, new Bispo(tabuleiro, XadrezCores.BRANCO));
		colocarPeca('d', 1, new Rainha(tabuleiro, XadrezCores.BRANCO));
		colocarPeca('e', 1, new Rei(tabuleiro, XadrezCores.BRANCO));
		colocarPeca('f', 1, new Bispo(tabuleiro, XadrezCores.BRANCO));
		colocarPeca('g', 1, new Cavalo(tabuleiro, XadrezCores.BRANCO));
		colocarPeca('h', 1, new Torre(tabuleiro, XadrezCores.BRANCO));
		
		colocarPeca('a', 2, new Peao(tabuleiro, XadrezCores.BRANCO));
		colocarPeca('b', 2, new Peao(tabuleiro, XadrezCores.BRANCO));
		colocarPeca('c', 2, new Peao(tabuleiro, XadrezCores.BRANCO));
		colocarPeca('d', 2, new Peao(tabuleiro, XadrezCores.BRANCO));
		colocarPeca('e', 2, new Peao(tabuleiro, XadrezCores.BRANCO));
		colocarPeca('f', 2, new Peao(tabuleiro, XadrezCores.BRANCO));
		colocarPeca('g', 2, new Peao(tabuleiro, XadrezCores.BRANCO));
		colocarPeca('h', 2, new Peao(tabuleiro, XadrezCores.BRANCO));
	}
	
	public XadrezPeca moverPeca(XadrezPosicao origem, XadrezPosicao destino) {
		JogoPosicao orig = origem.converterParaPosicao();
		JogoPosicao dest = destino.converterParaPosicao();
		
		validarPosicaoOrigem(orig);
		
		JogoPeca pecaCapturada = realizarMovimentoPeca(orig, dest); 
		return (XadrezPeca)pecaCapturada;
	}
	
	private void validarPosicaoOrigem(JogoPosicao origem) {
		if (!tabuleiro.temPecaNessaPosicao(origem)) {
			throw new XadrezException("Não existe peça nessa posição");
		}
	}
	
	private JogoPeca realizarMovimentoPeca(JogoPosicao origem, JogoPosicao destino) {
		JogoPeca p = tabuleiro.removePeca(origem);
		JogoPeca pecaCapturada = tabuleiro.removePeca(destino);
		tabuleiro.colocarPeca(p, destino);
		return pecaCapturada;
	}
	
	private void colocarPeca(char coluna, int linha, XadrezPeca peca) {
		tabuleiro.colocarPeca(peca, new XadrezPosicao(coluna, linha).converterParaPosicao());
	}
	
	private void IniciarJogo() {
		IniciarPretas();
		IniciarBrancas();	
		
	}
	
	

}
