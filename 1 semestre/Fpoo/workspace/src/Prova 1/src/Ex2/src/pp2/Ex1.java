package pp2;

import java.io.IOException;
import java.util.Scanner;

public class Ex1 {
	




  public static Scanner scan;
  public static String nome;
  public static Scanner salario;

 public static void main(String[] args) throws IOException {
	scan = new Scanner(System.in);
	double inssPorcento, inssDesconto, salMenosINSS;
	double irrfPorcento, irrfDeduzir, irrfDesconto;
	double fgtsPorcento = 8, fgtsDepositar;

	System.out.println("-------------------------------------------------");
	System.out.println("       Cálculos de encargos sobre salário        ");
	System.out.println("-------------------------------------------------");
	System.out.print("Digite o nome completo do funcionário: ");
	nome = scan.nextLine();
	System.out.print("Digite o salário base para cálculo: ");
	salario = scan.nextDouble();
	int menu = 0;
	while (menu != 4) {
		System.out.println("\n-----------------");
		System.out.print("1 INSS\n2 IRRF\n3 FGTS\n4Sair\nDigite sua opção:");
		menu = scan.nextInt();
		switch (menu) {
		case 1:
			if (salario > 7087.22) {
				inssPorcento = 0f; //Teto
			} else if (salario > 3641.03) {
				inssPorcento = 14f;
			} else if (salario > 2427.35) {
				inssPorcento = 12f;
			} else if (salario > 1212.01) {
				inssPorcento = 9f;
			} else {
				inssPorcento = 7.5f;
			}
			
			if (inssPorcento == 0f)
				inssDesconto = 992.21;
			else
				inssDesconto = salario * inssPorcento / 100;
			System.out.println("\n-----------------");
			System.out.println("Funcionário: " + nome);
			System.out.printf("Alíquita de INSS: %.2f%%\n", inssPorcento);
			System.out.printf("Desconto de INSS: R$%.2f\n", inssDesconto);
			System.out.println("-----------------\n");
			break;
 
			
}		