package visao;
import java.util.Scanner;
import modelo.Prato;
public class Menu {
	
private static Prato pratos[] = new Prato[10];
private static Scanner scan =  new Scanner(System.in);;
private static String itens[] = { "Cadastrar Prato", "Listar Pratos", "Sair" };
private static int menu = 0; 
private static int indice = 0; 
	// Método Main
	
	public static void main(String[] args) {
			while (menu != 3) {
				menu = printMenu(itens);
				switch (menu) {
				case 1:
					cadastrarPrato();
					break;
				case 2:
					listarPratos();
					break;
				case 3:
					System.out.println("Obrigada, bye");
					break;
				default:
					System.out.println("Opção inválida");
					break;
				}
			}
			
	} 
	//tela de mostar
		private static int printMenu(String[] itens) {
			System.out.print("Escolha uma opção:\n");
			for (int i = 0; i < itens.length; i++)
				System.out.println((i + 1) + "." + itens[i]);
			
			return scan.nextInt();
		}
		//cadastrarPrato = chamar constru
		private static void cadastrarPrato() {
			System.out.println("codigoPrato\t tipo\t nome\t descriçao\t preço\t");
			pratos[indice] = new Prato(scan.nextInt(),scan.next(), scan.next(), scan.next(), scan.nextFloat());
			indice++;
		}
		//Chamei para String
		private static void listarPratos() {
			for (int i = 0; i < indice; i++) {
				System.out.println(pratos[i].toString());
			}
       }
}


