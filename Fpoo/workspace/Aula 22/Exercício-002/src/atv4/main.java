package atv4;
 import java.util.Scanner;
public class main {
		public static void main(String[] args) {
		
			Arquivo arq = new Arquivo();
			Scanner scan = new Scanner(System.in);
			
			int menu = 0;
			
			do {
				
				System.out.println("1-Cadastrar usuaio\t2-Fazer login\t0-Sair");
				menu = scan.nextInt();
				
			} while (menu !=0);
			
		}
	}
