//Escreva um programa que leia o número de um funcionário,
//seu número de horas trabalhadas, 
//o valor que recebe por hora e calcula o salário desse funcionário.


package t.t;

import java.util.Scanner;

public class Tentativaserespostas {
       public static Scanner entrada;
	public static void main(String[] args) {
		prosal();
	}
	//entrada contém 2 números inteiros e 1 número com duas casas decimais,
	//representando o número, quantidade de horas trabalhadas e 
	//o valor que o funcionário recebe por hora trabalhada,
	
  public static void prosal() {
	entrada = new Scanner(System.in);
	double qtht, valorporh, Salary;
	 int Number; 
	 System.out.println("Qual é o seu número na empresa");
	 Number = entrada.nextInt();
	System.out.println("Quantas horas você trabalhou?");
	 qtht = entrada.nextDouble();
	 System.out.println("Quanto você recebe por hora?");
	 valorporh = entrada.nextDouble();
	 
	 //processamento
	 Salary = qtht * valorporh;
	 //Saida
	 System.out.println("Number = "+Number);
	 System.out.printf("Salary = $%.2f",Salary);
	 
	 
  }
}
