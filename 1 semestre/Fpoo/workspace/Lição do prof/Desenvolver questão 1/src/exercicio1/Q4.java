package exercicio1;

import java.util.Scanner;

public class Q4 {
    public static Scanner entrada;
    
	public static void main(String[] args) {
	entrada = new Scanner(System.in);
	double d, v = 900, t;
	
	System.out.printf("Digite uma distancia:");
	d = entrada.nextDouble();
	t = d/v;
	
	System.out.printf("O tempo percorrido pelo avião é:%.1f",t,v,d);
	

	}

}
