package visao;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import modelo.Funcionario;

public class TelaFrom extends JFrame {

	private static final long seralVersionUID = 1L;
	private JPanel painel;
	private JComboBox<String> cbfuncao, tfnome;
	private JLabel id,nome,funcao,ct,qtc,vlr, imagem;
	private JTextField tfid, tffuncao, tfct,tfqtc,tfvlr;
	private JTextArea verResultados;
	private JScrollPane rolagem;
	private JButton cadastrar, buscar, deletar, alterar;
	private String imgIco = "./Funcionario/icone.png";
	private String[] imagens = {"./Funcionario/Katia.png","./Funcionario/Maria.png" ,"./Funcionario/Silva.png" };
	private ImageIcon icon;
	private String texto = "";
	
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
	funcao = new JLabel("Funçao do funcionario");
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
	
	tfnome = new JComboBox<String>(new String[]{"Julia"});
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
	
	imagem = new JLabel();
	imagem.setBounds(330,115, 250, 120);
	imagem.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
	alternarImagens(0);
	painel.add(imagem);
	

	cadastrar = new JButton("Cadastrar");
	buscar = new JButton("Buscar");
	alterar = new JButton("Alterar");
	deletar = new JButton("Apagar");
	cadastrar.setBounds(510,60, 100, 25);
	buscar.setBounds(420,60,100, 25);
	alterar.setBounds(320,60,100, 25);

	alterar.setEnabled(true);
	deletar.setEnabled(false);
	
	painel.add(cadastrar);
	painel.add(deletar);
	painel.add(alterar);
	painel.add(buscar);
 
	}
	 
		
	private void alternarImagens(int indice) {
		imagem.setIcon(icon);
	}
	
	private void preencherAreaDeTexto() {
		texto = "";
		for (Funcionario p : Process.fun) {
			texto += p.toString()+"\n";
		}
		verResultado.setText(texto);
	}
	
	
	int obterIndice(String item) {
		switch (item) {
		case "Id":
			return 0;
		case "nome":
			return 1;
		case "funcao":
			return 2;
		case "categoria":
			return 3;
		case "qtc":
			return 4;	
		case "vlr":;
		return 5;
		default:
			return -1;
		}
	
	public static void main(String[] args) {
	new TelaFrom().setVisible(true);

	}

}
