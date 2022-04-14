package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Arquivo2 arq = new Arquivo2();
		int opcao = 0;
		do {
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar");
			System.out.println("3 - Sair");
			opcao = input.nextInt();
			input.nextLine();

			switch (opcao) {
			case 1:

				System.out.println("Informe seu nome : ");
				String nome = input.nextLine();

				System.out.println("Informe sua idade : ");
				String idade = input.next();

				System.out.println("Informe sua cidade : ");
				String cid = input.next();

				String data = nome + ";" + idade + ";" + cid;
				arq.Escrever(data, "Pessoas", true);
				break;
			case 2:
				ArrayList<String> infoFile = arq.ler("Pessoas");
				
				String busca = "Ana";

				for (String linha : infoFile) {
					String[] temp = linha.split(";");
					if (temp[0].contains(busca)) {
						System.out.println("Nome :" + temp[0]);
						System.out.println("idade :" + temp[1]);
						System.out.println("Cidade :" + temp[2]);
					}
				}
				break;
			case 3:
				System.out.println("Valows.");
				break;
			}
		} while (opcao != 0);

	}
}
