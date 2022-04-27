package modelo;

import java.text.DecimalFormat;

public class Planilha {
     private String nome;
     private double n1;
     private double n2;
     private double n3;
     
     public Planilha(String entrada) {
 		nome = (entrada.split(";")[0]);
 		n1 = Double.parseDouble(entrada.split(";")[1]);
 		n2 = Double.parseDouble(entrada.split(";")[2]);
 		n3 = Double.parseDouble(entrada.split(";")[3]);
 		}
 		public String Nota() {
 			double media = (n1 + n2 + n3)/3;
 			return nome +" " +(String.format("%.2f", media));
 		}
 		 
 	
}
