package visao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.Moto;
import modelo.Carro;
import modelo.Veiculo;
 

public class Principal {
	public static Scanner scan = new Scanner(System.in);
	
		private static ArrayList<Moto> motos = new ArrayList<>();
		private static ArrayList<Carro> carros = new ArrayList<>();
		 
		public static void main(String[] args) {
		
			int menu = 0;
			while (menu != 5) {
				System.out.println(" \n___Escolha uma opção:___ \n");
				System.out.println("1.Cadastrar Moto\n2.Listar Moto");
				System.out.println("------------------------------------------");
				System.out.println("3.Cadastrar Carro\n4.Listar Carro\n5.Sair");
				System.out.print("------------------------------------------");
				menu = scan.nextInt();
				switch (menu) {
				case 1:
					cadastrarMoto();
					break;
				case 2:
					listarMoto();
					break;
				case 3:
					cadastrarCarro();
					break;
				case 4:
					listarCarro();
					break;
				case 5:
					System.out.println("Obrigada por usar o nosso programa:)");
					break;
				default:
					System.out.println("inválido");
					break;
				}
			}
		}

		private static void listarCarro() {
			for (Carro c : carros) {
		         System.out.println(c.toString());
				}
			
		}

		private static void cadastrarCarro() {
	System.out.println("Tipo\tPassageiro\tPlaca\tAno do Modelo\tAno de Frabi\tModelo\tMarca\tValor");
		Carro carro = new Carro(scan.next(), scan.nextInt(), scan.next(), scan.nextInt(), scan.nextInt(),scan.next(),scan.next(),scan.nextDouble())	;
		carros.add(carro);
		}

		private static void listarMoto() {
			for (Moto m : motos) {
		         System.out.println(m.toString());
				}
			
		}

		private static void cadastrarMoto() {
			System.out.println("cilindradas\tPlaca \t anoModelo\tanoFabricao \tmodelo\tmarca\tvalor");
			Moto moto = new Moto(scan.nextInt(), scan.next(), scan.nextInt(), scan.nextInt(), scan.next(),scan.next(),scan.nextDouble());
			 motos.add(moto);
		}

	}


