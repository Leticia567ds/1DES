package modelo;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Aleatorios {

	public static Scanner scan;
	
	public static void main(String[] args) throws IOException {
		scan = new Scanner(System.in);
		int menu = 0;
		
		while(menu != 4) {
			System.out.println("1- Numeros Inteiros\n" + "2 - Numeros reals\n3 - Nomes\n4 = Sair");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				GerarInteiro();
				break;
			case 2:
				GeradorReal();
				break;
			case 3:
				GerarNome();
				break;
			case 4:
				System.out.print("---Obrigado :)---");
				break;
				default:
					System.out.println("*Opção invalida(*_*) ");
					break;
			}
			
		}
			

	}
	public static void GerarInteiro() {
		scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Digite quantos números deseja gerar ");
		int qntd = scan.nextInt();
		
		int[] numeros = new int[qntd];
		 for(int i = 0; i < qntd; i++) {
			 numeros[i] = rand.nextInt(100);
			 System.out.println(numeros[i]);
		 }
		   }
//2
	public static void GeradorReal() {
		scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Digite quantos números deseja gerar ");
		int qntd = scan.nextInt();
		
		double[] numeros = new double[qntd];
		
		 for(int i = 0; i < qntd; i++) {
			numeros[i] = rand.nextDouble() *100;  
			System.out.printf("%.2f\n ", numeros[1]);
}
	}
	//3
	public static void GerarNome() {
		scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Digite quantos Nomes deseja gerar até 10 (*-*): ");
		int qntd = scan.nextInt();
		
		String[] nomes = {"Ana", "Leticia", "Paulo", "João", "Caleb", "Gi", "JUlia", "Kaky", "Rafel", "Dez"};
		for(int i = 0; i < qntd; i++) {
			int ale = rand.nextInt(nomes.length);
			System.out.println(nomes[ale]);
			
			
			
		}
	}
}
