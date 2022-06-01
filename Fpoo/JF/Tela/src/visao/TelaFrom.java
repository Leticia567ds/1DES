package visao;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TelaFrom extends JFrame {

	private static final long seralVersionUID = 1L;
	private JPanel painel;
	private JComboBox<String> cbfuncao;
	private JLabel id,nome,funcao,ct,qtc,vlr;
	private JTextField tfid,tfnome, tffuncao, tfct,tfqtc,tfvlr;
	private JTextArea verResultados;
	private JScrollPane rolagem;
	private JButton cadastrar, buscar, deletar, alterar;
	
	
	TelaFrom(){
	setTitle("Prancheta do dia");
	setBounds(650, 50, 750, 500);
	painel = new JPanel();
	painel.setBackground(new Color(255,240,245));
	setContentPane(painel);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(null);
	
	id = new JLabel("Id");
	id.setBounds(25, 20, 120, 30);
	painel.add(id);
	nome = new JLabel("Nome");
	nome.setBounds(25, 55,120, 30);
	painel.add(nome);
	funcao = new JLabel("Fun�ao do funcionario");
	funcao.setBounds(25,100,125,30);
	painel.add(funcao);
	ct = new JLabel("categoria");
	ct.setBounds(25, 140, 125,30);
	painel.add(ct);
	qtc = new JLabel("Clientes atendidos");
	qtc.setBounds(25,180,125,30);
	painel.add(qtc);
	vlr = new JLabel("Valor total do dia");
	vlr.setBounds(25,220, 125, 30);
	painel.add(vlr);
	
	tfid = new JTextField("1");
	tfid.setEditable(false);
	tfid.setBounds(55,25,55,20);
	painel.add(tfid);
	
	tfnome = new JTextField();
	tfnome.setBounds(70,60,100,22);
	painel.add(tfnome);
	
	cbfuncao = new JComboBox<String>(new String[] { "Cabeleleira", "Designer/sobrancelhas", "Unhas"});
	cbfuncao.setBounds(160,107,125,25);
	painel.add(cbfuncao);
	
	tfct = new JTextField();
	tfct.setBounds(115,140,125,25);
	painel.add(tfct);
	
	tfqtc = new JTextField();
	tfqtc.setBounds(140,180,125,25);
	painel.add(tfqtc);
	
	tfvlr = new JTextField();
	tfvlr.setBounds(150,220,125,25);
	painel.add(tfvlr);
	
	verResultados = new JTextArea();
	verResultados.setEditable(false);
	verResultados.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
	
	rolagem = new JScrollPane(verResultados);
	rolagem.setBounds(40,250,600,200);
	painel.add(rolagem);
	

	cadastrar = new JButton("Cadastrar");
	buscar = new JButton("Buscar");
	alterar = new JButton("Alterar");
	deletar = new JButton("Apagar");
	cadastrar.setBounds(455, 55, 110, 30);
	buscar.setBounds(455, 100, 110, 30);
	deletar.setBounds(455, 150, 110, 30);
	alterar.setBounds(455, 200, 110, 30);
	alterar.setEnabled(true);
	deletar.setEnabled(false);
	
	painel.add(cadastrar);
	painel.add(deletar);
	painel.add(alterar);
	painel.add(buscar);
 
	
	 
	
	}	
	public static void main(String[] args) {
	new TelaFrom().setVisible(true);

	}

}