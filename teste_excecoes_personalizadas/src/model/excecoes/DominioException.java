package model.excecoes;

public class DominioException extends Exception {
	//Exception: compilador obrigha a tratar
	//RuntimeException: compilador nao obriga a tratar
	
	private static final long serialVersionUID = 1L;
	
	public DominioException(String msg) {
		super(msg);
	}

}
