//Escreva um arquivo de texto com números aleatórios, depois o leia e exiba
//os números em ordem crescente.

package atv3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import atv3.Arquivo;

public class Main {
      private static Arquivo arq = new Arquivo();
      private static Scanner input = new Scanner(System.in);
      private static Random r = new Random();
	public static void main(String[] args) {
		int menu = 0;
		while(menu != 3) {
			System.out.println("1.Gerar\n2.Listar em ordem Crescente\n3.Sair");
			menu= input.nextInt();
			input.nextLine();
			switch(menu) {
			case 1:
				gerarArquivo();
				break;
			case 2:
				listarNumeros()
;				break;
			case 3:
				System.out.println("Bye!*-*");
				break;
				default:
					System.out.println("erro, opção invalida");
					break;
			}
		}
	}
	private static void gerarArquivo() {
		 
		ArrayList<Integer> numb = new ArrayList<Integer>(); 
		for (int i = 0; i < 10; i++) {
			numb.add(r.nextInt(100)); 
		}
		
		arq.escrever(numb, "Numeros", false);
		System.out.println("Arquivo gerado com sucesso");
	}
	
	private static void listarNumeros() {
		ArrayList<Integer> dads = arq.ler("Numeros");
		
		dads.sort(null);
		
		for (Integer num : dads) {
			System.out.println(num);
		}
}
}