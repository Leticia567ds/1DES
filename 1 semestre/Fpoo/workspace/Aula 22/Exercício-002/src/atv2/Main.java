package atv2;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{

		Scanner input = new Scanner(System.in);
		Arquivo arq = new Arquivo();
		int opcao = 0;
		do {
			System.out.println("1 - Nome e idade");
			System.out.println("2 - Listar");
			System.out.println("3 - Sair");
			opcao = input.nextInt();
			input.nextLine();
			switch (opcao) {
			case 1:
				System.out.println("Informe seu nome: ");
				String nome = input.nextLine();

				System.out.println("Informe sua data de  nascimento: ");
				String year = input.next();
				
				String arqu = nome + ";" + year;
				arq.Escrever(arqu, "arquivos", true);
				break;
			case 2:
		ArrayList<String> infoFile = arq.ler("arquivos");   
		for(String linha : infoFile) {
			String[] temp = linha.split(";");
			System.out.println("Nome : " + temp[0]);
			System.out.println("Idade :"+calcIdade(new SimpleDateFormat("dd/MM/yyyy").parse(temp[1])));
		}
				break;
			case 3 :
				System.out.println("Bye...");
				break;
			}
		} while (opcao != 0);
	}

	public static int calcIdade(Date nasc) {
		java.util.Date agora = new java.util.Date();

		if (agora.getMonth() == nasc.getMonth()) {
			if (agora.getDay() >= nasc.getDay()) {
				return agora.getYear() - nasc.getYear() - 1;
			} else {
				return agora.getYear() - nasc.getYear() - 1;
			}
		} else if (agora.getMonth() > nasc.getMonth()) {
			return agora.getYear() - nasc.getYear();
		} else {
			return agora.getYear() - nasc.getYear() - 1;
		}
	}
}
