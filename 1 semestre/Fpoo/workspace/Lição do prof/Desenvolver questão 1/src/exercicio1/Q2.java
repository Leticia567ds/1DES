package exercicio1;

import java.util.Scanner;

public class Q2 {
	
    public static Scanner entrada;
    
    public static void main(String[] args){
	entrada = new Scanner(System.in);
	double v, d, t;
	System.out.printf("Digite a velocidade do seu carro:");
	v = entrada.nextDouble();
	System.out.printf("Digite a distancia do seu carro:");
   d = entrada.nextDouble();
	
   t = v/d;
   System.out.printf("O tempo percorrido foi:%.1f", + t);
		   

	}

}
