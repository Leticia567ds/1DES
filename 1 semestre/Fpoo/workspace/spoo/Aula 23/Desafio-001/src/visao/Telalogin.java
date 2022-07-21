package visao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Telalogin extends JFrame {


	private static final long serialVersionUID = 1L;

	private JPanel painel;
	private JLabel rotulo1, rotulo2;
	private JTextField nome, nas;
	private JButton login;
	 
	
	Telalogin(){
		setTitle("Tabela");
		setBounds(600,450,360,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel();
		setContentPane(painel);
		setLayout(null);
		
		//Conteúdos da tela
		rotulo1 = new JLabel("Nome:");
		rotulo1.setBounds(20,20,100,20);
		nome = new JTextField();
		nome.setBounds(120,20,200,30);
		rotulo2 = new JLabel("Ano de nascimento:");
		rotulo2.setBounds(20,60,200,20);
		nas = new JTextField();
		nas.setBounds(140,60,160,30);
		login = new JButton("Cadastrar");
		login.setBounds(120,100,200,30);
		
		
		
		painel.add(rotulo1);
		painel.add(nome);
		painel.add(rotulo2);
		painel.add(nas);
		painel.add(login);
	}
	public static void main(String[] args) {
		Telalogin tela = new Telalogin();
		tela.setVisible(true);

	}

}
