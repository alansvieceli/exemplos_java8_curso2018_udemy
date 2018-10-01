package xadrez;

public class XadrezFuncoes {
	
	public static final String alfabeto[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
	public static final Integer TOTAL_LINHAS = 8;
	public static final Integer TOTAL_COLUNAS = 8;
	
	public static final Integer getIndexAlfabeto(char coluna) {
		for (int i = 0; i < alfabeto.length; i++) {
			if (alfabeto[i].equals(Character.toString(coluna))) {
				return i;
			}
		}
		return -1;
		
	}

}
