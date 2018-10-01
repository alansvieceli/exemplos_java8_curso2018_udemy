package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

import xadrez.XadrezFuncoes;
import xadrez.XadrezPeca;
import xadrez.XadrezPosicao;
import xadrez.enumerados.XadrezCores;

public class UI {
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
 	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
	
	public static XadrezPosicao lerXadrezPosition(Scanner sc) {
		try {
			String s = sc.nextLine();
			char coluna = s.charAt(0);
			int linha = Integer.parseInt(s.substring(1));
			return new XadrezPosicao(coluna, linha);		
		}
		catch(RuntimeException e) {
			throw new InputMismatchException("Erro ler as posições do Xadrez..valor inválido");			
		}
	}
	
	public static void imprimirTabuleiro(XadrezPeca[][] pecas) {
		
		for (int x=0; x < pecas.length; x++) {
			System.out.print(XadrezFuncoes.TOTAL_LINHAS - x + " ");
			for (int y=0; y < pecas.length; y++) {
				imprimirPeca(pecas[x][y]);
			}
			System.out.println();
		}
		
		System.out.print("  ");
		for (int x=0; x < pecas.length; x++) {
			System.out.print(XadrezFuncoes.alfabeto[x]+" ");
		}
		
	}
	
	private static void imprimirPeca(XadrezPeca peca) {
		if (peca == null) {
			System.out.print("-");
		} else {
			if (peca.getCor() == XadrezCores.BRANCO) {
				System.out.print(ANSI_WHITE + peca + ANSI_RESET);				
			} else {
				System.out.print(ANSI_YELLOW + peca + ANSI_RESET);
			}
		}
		
		System.out.print(" ");
	}

}
