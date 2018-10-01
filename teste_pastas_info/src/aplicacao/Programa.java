package aplicacao;

import java.io.File;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter a folder path: ");			
			String strPath = sc.nextLine();
			File path = new File(strPath);
			
			System.out.println("getPath: " + path.getPath());
			System.out.println("getParent: " + path.getParent());
			System.out.println("getName: " + path.getName());
		}

	}

}
