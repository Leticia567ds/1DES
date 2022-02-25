package atv1;

public class Atividade1 {

	public static void main(String[] args) {
		mostra();
	}
 public static void mostra() {
	int[] indice = new int[5];
	indice[0]= 0;
	indice[1] = 1;
	indice[2] = 2;
	indice[3] = 3;
	indice[4] = 4;
	//2,4,5,6 e 8
	int[] valor = new int[5];
	valor[0] = 2;
	valor[1] = 4;
	valor[2] = 5;
	valor[3] = 6;
	valor[4] = 8;
	 for(int i =0; i< 5; i++) {
		 System.out.println("indice\tvalor"+indice);
		  
	 }
 } 
 
}
