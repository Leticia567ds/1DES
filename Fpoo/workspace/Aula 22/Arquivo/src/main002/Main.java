package main002;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import main002.Arquivo;
public class Main {
	 
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			Arquivo arq = new Arquivo();
			int opcao = 0;
			do {
				System.out.print("---O cadastramento de veículos---");
				System.out.println("\n1 - Cadastrar");
				System.out.println("2 - Listar");
				System.out.println("3 - Busca");
				System.out.println("3 - Sair");
				opcao = input.nextInt();
				input.nextLine();

				switch (opcao) {
				case 1:
                    
					System.out.println("Informe a marca : ");
					String marc = input.nextLine();

					System.out.println("Informe o modelo : ");
					String mod = input.next();

					System.out.println("Informe a placa : ");
					String plac = input.next();
					
					System.out.println("Informe a  cor : ");
					String cor = input.next();


					String veiculo = marc + ";" + mod + ";" + plac + ";"+ cor;
					arq.Escrever(veiculo, "Pessoas", true);
					break;
				case 2:
					ArrayList<String> infoFile = arq.ler("Pessoas");
					
					String busca = input.nextLine();

					for (String linha : infoFile) {
						String[] temp = linha.split(";");
						if (temp[2].toLowerCase().contains(busca)) {
							System.out.println("Marca :" + temp[0]);
							System.out.println("Modelo :" + temp[1]);
							System.out.println("Placa :" + temp[2]);
							System.out.println("Cor :" + temp[3]);
						}
					}
					break;
				case 3:
					int op = 0;
					do { 
						System.out.println("\n1 - Buscar por Marca ");
						System.out.println("2 - Busca por Modelo  ");
						System.out.println("3 - Busca por Placa ");
						System.out.println("4 - Busca por cor ");
						op = input.nextInt();
						input.nextLine();

						switch (op) {
						case 1:
							ArrayList<String> infoName = arq.ler("cion");
							
							String bu = input.nextLine();

							for (String linha : infoName) {
								String[] temp = linha.split(";");
								if (temp[0].toLowerCase().contains(bu)) {
									System.out.println("Marca :" + temp[0]);
									System.out.println("Modelo :" + temp[1]);
									System.out.println("Placa :" + temp[2]);
									System.out.println("Cor :" + temp[3]);
								}
							}
						
							break;
						case 2:
							break;
						case 3:
							break;
						case 4:
							break;		
				}
			} while (opcao != 0);

			}	
				
		
