package exercicio1;

import java.util.Scanner;

  public class Q5 {
	  
   public static Scanner leia;
      
	public static void main(String[] args) { 
	   leia = new Scanner(System.in);
        int r= leia.nextInt();
		switch(r){  
		case 1:
		double c,a;
			System.out.println("Quantos caminhões tem sua fazenda?");
			c = leia.nextDouble();
			System.out.println("Quantos arqueiros tem sua fazenda?");
			a =  leia.nextDouble();
			System.out.println("Quantas toneladas cada caminhão consegue trasportar por viagem");
			 int q = leia.nextInt();
			 System.out.println("Quantos arqueiros precisa para produz?:");
			 int q2 = leia.nextInt();
			 c *=q;
			 a *=q2;
			 
			 int v = (int) Math.round(a/c);
			 
			 System.out.println("A quantidade de viagens sera +/- de: " + v);
	         break;
			 
				}
	}
	}

