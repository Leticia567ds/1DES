package main002;

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
		Arquivo arq = new Arquivo();
		int opcao = 0;
		do {
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Busca pela placa");
			System.out.println("3 - Listar");
			System.out.println("4 - Sair");
			opcao = input.nextInt();
			input.nextLine();

			switch (opcao) {
			case 1:

				System.out.println("Informe a Marca: ");
				String nome = input.nextLine();

				System.out.println("Informe o Modelo: ");
				String mod = input.next();

				System.out.println("Informe a Placa: ");
				String pl = input.next();

				System.out.println("Informe a Cor: ");
				String color = input.next();

				
				String veic = nome + ";" + mod + ";" + pl+";" + color;
				arq.Escrever(veic, "Veiculos", true);
				break;
			case 2:
				ArrayList<String> infoFile = arq.ler("Veiculos");
				System.out.println("Escreva o que deseja buscar:");
				String busca = input.nextLine();

				for (String linha : infoFile) {
					String[] temp = linha.split(";");
					if (temp[2].toLowerCase().contains(busca.toLowerCase())){
						System.out.println("Marca :" + temp[0]);
						System.out.println("Modelo :" + temp[1]);
						System.out.println("Placa :" + temp[2]);
						System.out.println("Cor :" + temp[3]);
					}
				}
				break;
			case 3:
				ArrayList<String> infoFile2 = arq.ler("Veiculos");
				for (String linha : infoFile2) {
					String[] temp = linha.split(";");
					System.out.println("Marca : " + temp[0]);
					System.out.println("Modelo : " + temp[1]);
					System.out.println("Placa : " + temp[2]);
					System.out.println("Cor : " + temp[3]);
					System.out.println("= = = = = = = = = =");
					}
				break;
				
				case 4:
					System.out.println("Bye!!");
					break;
			}
		} while (opcao != 0);

	}
}
