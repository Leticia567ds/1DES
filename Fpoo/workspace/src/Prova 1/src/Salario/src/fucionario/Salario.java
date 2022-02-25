package fucionario;

import java.util.Scanner;

public class Salario {
	//Compilou o que ele ia usar em todas
	public static Scanner scan;
	public static String nome;
	public static float salario;
	

	public static void main(String[] args) {
		//colocou o que ia usar na 1,2,3.
		float inssPor, inssDes, salmenosINSS;
		float irrfPorcento, irrfDeduzir, irrfDesconto;
		float fgtsPorcento = 8, fgtsDepositar;
		//entrada
		scan = new Scanner(System.in);
		 
		System.out.println("-----------------------------------");
		System.out.println("Cálculo de encargos sobre salário" );
        System.out.println("------------------------------------");
        System.out.print("Digite seu nome e sobrenome");
      nome = scan.nextLine();
       System.out.print("Digite seu sálario");
      nome = scan.nextLine();
	//processamento
      int menu = 0;
      while (menu != 4)  { 
    	System.out.println("\n----------------");  
    	System.out.println("1-INSS,2-IRRF,3-FGTS,4-Sair o resultado de tudo,Digite sua opção");
    	menu = scan.nextInt();
    	switch (menu) {
    	case 1:
    		if (salario > 7087.22) {
				inssPor = 0f; //Teto
			} else if (salario > 3641.03) {
				inssPor = 14f;
			} else if (salario > 2427.35) {
				inssPor = 12f;
			} else if (salario > 1212.01) {
				inssPor = 9f;
			} else {
				inssPor = 7.5f;
			}
    		if (inssPor == 0f) 
		      inssDes =(float)992.27;
    		else
			inssDes = salario * inssPor / 100;
			
			System.out.println("\n-----------------");
			System.out.println("Funcionário: " + nome);
			System.out.printf("Alíquita de INSS: %.2f%%\n",inssPor);
			
			System.out.printf("Desconto de INSS: R$%.2f\n",inssDes);
			System.out.println("-----------------\n");				
			break;
    	
      }
      
      
      
      
      
	}

}
	
}
