package visao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import modelo.Aluno;
import modelo.Nota;

public class Principal {
	static Scanner entrada = new Scanner(System.in);
	static Aluno[] alunos = new Aluno[10];
	static Nota[] notas = new Nota[4];
	static int qtdCadastrada = 0;

	public static void main(String[] args) throws ParseException {
		int menu = 0;
		while (menu != 8) {
			System.out.println("Digite uma opção");
			System.out.println("------------------");
			System.out.print("1.Cadastrar Aluno");
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
				listarTodasNotas();
				break;
			case 5:

				int num = 0;
				
				Aluno aluno = null;

				while (num != 1 && num!= 2) {
					System.out.println("Deseja buscar por\n Obs:(apertar 1 e 2)\n 1.Ra\n 2.Nome ");
					num = entrada.nextInt();
					
					

					switch (num) {
					case 1:

						System.out.println("Digite o RA do aluno:");
						int ra = entrada.nextInt();
						aluno = obterDadosAluno(ra);

						break;
					case 2:
						System.out.println("Digite o nome do aluno:");
						String nome = entrada.next();
						aluno = obterDadosAluno(nome);
						break;
					default:
						System.out.println("Opção inválida---");
						break;

					}
				}
				
				if(alunos  != null) {
					 
				} else {
					System.out.println("Aluno não encontrado");
				}
				
			case 6:
				 aprovados();
				break;
			case 7:
				reprovados();
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
				System.out.println("\n");
				
				qtdCadastrada++;
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
		int qtd = 0;

		System.out.println("Digite o RA do aluno para as notas serem cadastradas:");
		int ra = entrada.nextInt();

		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] != null) {
				if (alunos[i].ra == ra) {
					Nota[] notas = alunos[i].notas;
					System.out.println("ALUNO: " + alunos[i].nome);
					do {
						System.out.println("Quantas matérias  deseja cadastrar as notas? (max: 4)");
						qtd = entrada.nextInt();
						if (qtd > 4) {
							System.out.println("O máximo é até 4");
						} else if (qtd <= 4) {
							for (int il = 0; il < qtd; il++) {
								for (int j = 0; j < 4; j++) {
									if (notas[j] == null) {
										System.out.println("Digite á matéria ");
										System.out.println("Digite a Nota 1");
										System.out.println("Digite a Nota 2");
										System.out.println("Digite a Nota 3");
										String componente = entrada.next();

										float[] nota = new float[3];

										for (int k = 0; k < nota.length; k++) {
											nota[k] = entrada.nextFloat();
										}
										alunos[i].notas[j] = new Nota(componente, nota);

										break;
									}
								}
							}
						}

					} while (qtd > 4);

				} else if (i == 9) {
					System.out.println("RA não encontrado");

					break;
				}
			}
		}
	}

	private static void listarTodosAlunos() {
		System.out.println("Nome" + "\t" + "Ra" + "\t" + "Data de nascimento" + "\t" + "Idade" + "\t");
		for (int i = 0; i < qtdCadastrada; i++) {
			
			System.out.println(alunos[i].tabulaString());
			System.out.println("------------------------");
		}
	}

	private static void listarTodasNotas() {
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] != null) {

				System.out.println(alunos[i].nome);

				System.out.println("\tComp.\tNota 1\tNota 2\tNota 3\tMédia\n");
				for (int l = 0; l < alunos[i].notas.length; l++) {
					if (alunos[i].notas[l] != null) {
						System.out.print("\t" + alunos[i].notas[l].componente);
						for (int j2 = 0; j2 < alunos[i].notas[l].notas.length; j2++) {
							System.out.print("\t" + alunos[i].notas[l].notas[j2]);
						}
						if (alunos[i].notas[l].obterMedia() <= 50) {
							System.out.printf("\t|%.2f|", alunos[i].notas[l].obterMedia());
							System.out.println("\n");
						} else {
							System.out.printf("\t%.2f", alunos[i].notas[l].obterMedia());
							System.out.println("\n");
						}
					}

				}
				System.out.println(alunos[i].obterConceito());
				System.out.println("\n");
			}
		}

	}

	public static Aluno obterDadosAluno(int ra) throws ParseException {

		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i].nome != null && alunos[i].ra == ra) {
				 return alunos[i];
			}  
			
		}
		
		return null;

	}

	public static Aluno obterDadosAluno(String nome) {
		 
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] != null && alunos[i].nome.equals(nome)) {
				 return alunos[i];
			}
			
		}
		 
		return null;
	}

	public static void aprovados() {
		 
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] != null) {
				if(alunos[i].obterConceito().equals("Aluno(a) " + alunos[i].nome + " foi APROVADO!")) {
					System.out.println("Ra " +alunos[i].ra);
					System.out.println("Aluno " + alunos[i].nome);
					System.out.println("Idade: " + alunos[i].calcIdade());
					System.out.println(alunos[i].obterConceito());
				}
			
			
		}
			 
		}	 
	}
	public static void reprovados() {
		 
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] != null) {
				if(alunos[i].obterConceito().equals("Aluno(a) " + alunos[i].nome + " foi REPROVADO!")) {
					System.out.println("Ra " +alunos[i].ra);
					System.out.println("Aluno " + alunos[i].nome);
					System.out.println("Idade: " + alunos[i].calcIdade());
					System.out.println(alunos[i].obterConceito());
				}
			
			}
			else if(i == 9) {
				System.out.println("Não Há alunos Reprovados");
			}
		}
		 
	}

}