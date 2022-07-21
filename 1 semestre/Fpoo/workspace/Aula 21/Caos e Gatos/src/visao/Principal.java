package visao;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Cao;

import modelo.Gato;

public class Principal {
	public static Scanner scan = new Scanner(System.in);

	private static ArrayList<Cao> caes = new ArrayList<>();
	private static ArrayList<Gato> gatos = new ArrayList<>();

	public static void main(String[] args) {
		int menu = 0;
		while (menu != 5) {
			System.out.println(" ___Escolha uma opção:___ \n");
			System.out.println("1.Cadastrar cachorro\n2.Listar cachorro");
			System.out.println("------------------------------------------");
			System.out.println("3.Cadastrar gato\n4.Listar gato\n5.Sair");
			System.out.print("------------------------------------------");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				cadastrarcachorro();
				break;
			case 2:
				listarcachorro();
				break;
			case 3:
				cadastrargato();
				break;
			case 4:
				listargato();
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

	private static void listargato() {
		for (Gato g : gatos) {
	         System.out.println(g.toString());
			}
	}

	private static void cadastrargato() {
		System.out.println("especie\t nome\t peso\t raça\t qtdVidasUtilizadas");
		Gato gato = new Gato(scan.next(), scan.next(), scan.nextFloat(), scan.next(), scan.nextInt());
		gatos.add(gato);
	}

	private static void listarcachorro() {
		for (Cao c : caes) {
         System.out.println(c.toString());
		}
	}

	private static void cadastrarcachorro() {

		System.out.println("especie\t nome\t peso\t raça\t qtdMotoqueirosAtacados");
		Cao cao = new Cao(scan.next(), scan.next(), scan.nextFloat(), scan.next(), scan.nextInt());
		// adicionar na lista.
		caes.add(cao);
	}
}
