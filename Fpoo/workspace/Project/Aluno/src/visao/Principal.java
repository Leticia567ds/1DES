package visao;

import modelo.Aluno;
import java.util.Scanner;

public class Principal {
	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int menu = 0;
		while (menu != 7) {
			System.out.print("\n1.Cadstrar Aluno");
			System.out.print("\n2.Cadstrar Notas");
			System.out.print("\n3.Listar todos alunos ");
			System.out.print("\n4.Listar todos notas ");
			System.out.println("\n5.Obter os dados de um aluno específico");
			System.out.print("6.Listar alunos aprovados ");
			System.out.print("\n7.Listar alunos reprovados ");
			System.out.print("\n8.Sair");
			menu = entrada.nextInt();
			switch (menu) {
			case 1:
				cadastrarAluno();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				System.out.println("Obrigado por confiar em nosso trabalho");
				break;
			default:
				System.out.println("Inválida...");
				break;
			}
		}

	}

	public static void cadastrarAluno() {
		int Ra,Name, dtNas;
	 int[] number = new int[10];
     for(int i = 0; i <= 10; i++) {
    	System.out.println("Ra"); 
    	Ra = entrada.nextInt();
    	System.out.println("Nome"); 
    	Name = entrada.nextInt();
    	System.out.println("Data de nascimento"); 
    	 dtNas = entrada.nextInt();
    	
     }
	}
	
}