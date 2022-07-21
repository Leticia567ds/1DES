package visao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import modelo.Cliente;
import modelo.Funcionario;

import modelo.Vendas;

public class Main {
	private static ArrayList<Funcionario> funci = new ArrayList<>();
	private static ArrayList<Cliente> cliente = new ArrayList<>();
	private static ArrayList<Vendas> venda = new ArrayList<>();

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws ParseException {
		int menu = 0;
		while (menu != 7) {
			System.out.println(" \n___Escolha uma opção:___ \n");
			System.out.println("[1].Cadastrar Funcionario\t[2].Listar Funcionario");
			System.out.println("------------------------------------------");
			System.out.println("[3].Cadastrar Cliente\t[4].Listar Cliente");
			System.out.print("------------------------------------------");
			System.out.println("\n[5].Cadastrar Vendas\t[6].Listar Vendas\n[7].Sair");
			System.out.print("------------------------------------------");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				cadaFunc();
				break;
			case 2:
				listFunci();
				break;
			case 3:
				cadasClient();
				break;
			case 4:
				listaClien();
				break;
			case 5:
				cadastrarVend();
				break;
			case 6:
				listaVenda();
				break;
			case 7:
				System.out.println("Obrigada por usar o nosso programa:)");
				break;
			default:
				System.out.println("inválido");
				break;
			}
		}
	}

	private static void listaVenda() {
		if(venda.size()>1) {
			System.out.println("Não encontrada:");
		}
		for (Vendas v : venda) {
			System.out.println(v.toString());
		}
		
	}

	private static void cadastrarVend() {
       int cod = venda.size() + 1;
       int codClient;
       int mat;
       boolean rep = true;
		System.out.println("****Cadastrar Vendas******");
   
		 do { System.out.println("Insira o Id do cliente");
		  codClient = scan.nextInt();
		  for(Cliente c: cliente) {
			  if(codClient == c.getId()) {
				  rep = false;
			  }else {
				  System.out.println(" o Id do cliente não encontrado");
			  }
		  }
			 
	}while(rep);
		 boolean repe = true;
		 do {
			 System.out.println("Digite o código da matrícula do funcionário:");
			 mat = scan.nextInt();
			for(Funcionario f : funci) {
				if(mat == f.getMatricula()) {
					repe = false;
				}else {
					System.out.println("Não encontarado:");
				}
			}
		 }while(repe);
		 System.out.println("Digite o valor da venda:");
		 double valor = scan.nextDouble();

			venda.add(new Vendas(codClient,mat, valor));
		
		for (Funcionario funcionario : funci) {
			if (funcionario.getMatricula() == mat) {
				System.out.println("Comissão: " + funcionario.calcComissao(valor));
			}
		}	
		
		
	System.out.println("---------Venda cadastrada---------");
	 
			 
 }

	private static void listaClien() {
		for (Cliente c : cliente) {
			System.out.println(c.toString());
		}
	}

	private static void cadasClient() throws ParseException {
		int id = cliente.size() + 1;
		System.out.println("\n-----Cadastro do Cliente-------\n");

		System.out.println("Digite sou nome:");
		String nome = scan.next();

		System.out.println("Digite o  seu telefone:");
		String telefone = scan.next();

		System.out.println("Digite Data de Nascimento");
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(scan.next());

		System.out.println("Insira seu limite de credito:");
		double creditoLimite = scan.nextDouble();

		cliente.add(new Cliente(id, creditoLimite, nome, telefone, date));
		System.out.println("\n----- Cliente Cadastrado-------\n");

	}

	private static void listFunci() {
		for (Funcionario f : funci) {
			System.out.println(f.toString());
		}

	}

	private static void cadaFunc() throws ParseException {

		int matricula = funci.size() + 1;

		System.out.println("-----Cadastro do Funcionário-------");

		System.out.println("Digite o nome:");
		String nome = scan.next();

		System.out.println("Digite o  seu telefone:");
		String telefone = scan.next();

		System.out.println("Digite Data de Nascimento");
		Date data = new SimpleDateFormat("dd/MM/yyyy").parse(scan.next());

		System.out.println("Digite a comição que o funcionario receberá");
		double comissao = scan.nextDouble();

		funci.add(new Funcionario(matricula, comissao, nome, telefone, data));
		System.out.println(",,,,,Funcionário Cadastrado,,,,,");
	}

}
