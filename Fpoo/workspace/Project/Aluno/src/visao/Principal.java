package visao;

import modelo.Aluno;
import modelo.Nota;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Scanner;

public class Principal {
	static Scanner entrada = new Scanner(System.in);
	static Aluno[] alunos = new Aluno[10];
	static int qtdCadastrada = 0;
	static int qtd = 0;
	public static void main(String[] args) throws ParseException {
		int menu = 0;
		while (menu != 7) {
			System.out.println("Digite uma opção");
			System.out.print("\n1.Cadastrar Aluno");
			System.out.print("\n2.Cadastrar Notas");
			System.out.print("\n3.Listar todos alunos ");
			System.out.print("\n4.Listar todos notas ");
			System.out.println("\n5.Obter os dados de um aluno específico");
			System.out.print("6.Listar alunos aprovados ");
			System.out.print("\n7.Listar alunos reprovados ");
			System.out.print("\n8.Sair");
			menu = entrada.nextInt();
			switch (menu) {
			case 1:

				cadastrarAluno();

				break;
			case 2:
				cadastrarNotas();
				break;
			case 3:
				listarTodosAlunos();
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				System.out.println("Obrigado por confiar em nosso trabalho");
				break;
			default:
				System.out.println("Inválida...");
				break;
			}
		}
	}

	public static void cadastrarAluno() throws ParseException {
		if (qtdCadastrada < 10) {
			boolean sucesso = cadastrarAl();
			if (sucesso) {
				System.out.println("Aluno  cadastrado com sucesso ");
				qtdCadastrada++;
			} else {
				System.out.println("Erro ao cadastrar o aluno.");
			}
		} else {
			System.out.println("Limite máximo de alunos atingido");
		}
	}

	private static boolean cadastrarAl() throws ParseException {
		System.out.println("Nome\t RA\tData de Nascimento");
		alunos[qtdCadastrada] = new Aluno();
		alunos[qtdCadastrada].nome = entrada.next();
		alunos[qtdCadastrada].ra = entrada.nextInt();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		alunos[qtdCadastrada].Nascimento = df.parse(entrada.next());
		return true;
	}

	public static void cadastrarNotas() {
		System.out.println("Digite o RA do aluno para as notas serem cadastradas:");
		int ra = entrada.nextInt();
		float[] nota = new float[3];
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] != null) {
				if (alunos[i].ra == ra) {
					Nota[] notas = alunos[i].notas;

					for (int j = 0; j < 4; j++) {
						// quando não encontrar
						if (notas[j] == null) {
							 
							System.out.println("Digite o nome da matéria para inserir as notas");
							String componente = entrada.next();
							
							for (int l = 0; l < 3; l++) {
								System.out.println("Digite a " + (l + 1) + "ª Nota:");
								nota[l] = entrada.nextFloat();
							}
							notas[j] = new Nota(componente, nota);

							alunos[i].notas = notas;
							break;
						}
						if (j == 3) {
							System.out.println("Limite de componentes atingido para " + alunos[i].nome + ". (4/4)");
						}
					}
				}
			}
		}
	}

	private static void listarTodosAlunos() {
		for (int i = 0; i < qtdCadastrada; i++) {
			System.out.println(alunos[i].tabulaString());
		}
	}
}
