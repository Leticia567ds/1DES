package visao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Telalogin extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel Painel;
	private JLabel rotulo1,rotulo2;
	private JTextField nome, nota1, nota2, nota3;
	private JButton login;
	 
	Telalogin(){
		setTitle("Tabela");
		setBounds(600,400,350,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Painel = new JPanel();
		setContentPane(Painel);
		setLayout(null);
		
		rotulo1 = new JLabel("Nome:");
		rotulo1.setBounds(20,20,100,20);
		nome = new JTextField();
		nome.setBounds(120,20,200,30);
		rotulo2 = new JLabel("Nota:");
		rotulo2.setBounds(20,60,58,30);
		nota1 = new JTextField();
		nota1.setBounds(120,60,58,30); 
		nota2 = new JTextField();
		nota2.setBounds(190,60,58,30); 
		nota3 = new JTextField();
		nota3.setBounds(260,60,58,30);
		login = new JButton("Verificar média");
		login.setBounds(120, 100, 200, 30);
		
		
		Painel.add(rotulo1);
		Painel.add(nome);
		Painel.add(rotulo2);
		Painel.add(nota1); 
		Painel.add(nota2);
		Painel.add(nota3);
		Painel.add(login);
	}
	
	
	
	public static void main(String[] args) {
		Telalogin tela = new Telalogin();
		tela.setVisible(true);

	}

}
