package xadrez.excecoes;

import jogo.excecoes.JogoException;

public class XadrezException extends JogoException{

	private static final long serialVersionUID = 1L;
	
	public XadrezException(String msg) {
		super(msg);
	}

}
