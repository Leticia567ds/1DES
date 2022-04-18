//Escreva um arquivo de texto com números aleatórios, depois o leia e exiba
//os números em ordem crescente.

package atv3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import atv2.Arquivo;

public class Main {

	public static void main(String[] args) {
		 int[]numeros = new int[10];
		Scanner input = new Scanner(System.in);
		Arquivo arq = new Arquivo();
		int opcao = 0;
		do {
			System.out.println("1 - Gerar N.Aleatórios");
			System.out.println("2 - Listar");
			System.out.println("3 - Sair");
			opcao = input.nextInt();
			input.nextLine();
			switch (opcao) {
			case 1:
				Random rand = new Random();
            
				for (int i = 0; i < 10; i++) {
					numeros[i] = rand.nextInt(100);
				
				
				 
				arq.Escrever(String.valueOf(numeros[i]), "aleatorios", true);
				}
				break;
			case 2:
				
				
				
				break;
			}
		} while (opcao != 0);
	}

}
