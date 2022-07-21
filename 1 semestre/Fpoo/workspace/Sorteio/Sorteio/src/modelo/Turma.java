package modelo;

import java.util.Iterator;
import java.util.Scanner;
import modelo.Sorteio;
import java.util.Random;
public class Turma {
	
	private static Random ale = new Random(); 
	private static Scanner scan = new Scanner(System.in);
	private String[] alunos;
	
	public void preencherVetor(int qtdade) {
		String[] alunos = new String[qtdade];
		for (int i = 0; i < alunos.length; i++) {
			alunos[i] = scan.nextLine();
		}
	}
	
	public void listarTodos() {
		for (String a : alunos) {
			System.out.println(a);
		}
	}
	public static void embaNome() {
		 
		System.out.print("Digite quantos alunos a turma possui:");
		int qtd = scan.nextInt();
		qtd+=1;
		String[] alunos = new String[qtd];
		
		for (int i = 0; i < alunos.length; i++) {
			alunos[i] = scan.nextLine();
		}
		int indice[] = new int[qtd];
		
		for (int i = 0; i < indice.length; i++) {
			indice[i] = -1;
		}
		
		boolean repetido = false;
		for (int i = 0; i < indice.length; i++) {
			do {
				indice[i] = ale.nextInt(qtd);
				repetido = false;
				for (int j = 0; j < indice.length; j++) {
					if(indice[i] == indice[j] && i != j) {
						repetido = true;
					}
				}
			}while(repetido);
			
			
		}
		for (int i = 0; i < alunos.length; i++) {
			System.out.println(alunos[indice[i]]);
		}
	
	}
  
	}

