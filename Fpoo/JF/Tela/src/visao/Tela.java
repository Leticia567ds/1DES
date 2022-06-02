package visao;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import modelo.Funcionario;
import controle.Process;

public class Tela extends JFrame  implements ActionListener{

	private static final long seralVersionUID = 1L;
	private JPanel painel;
	private JComboBox<String> cbfuncao, tfnome;
	private JLabel id,nome,funcao,ct,qtc,vlr, imagem;
	private JTextField tfid, tffuncao, tfct,tfqtc,tfvlr;
	private JTextArea verResultados;
	private JScrollPane rolagem;
	private JButton cadastrar, buscar, deletar, alterar;
	private String imgIco = "./Funcionario/icone.png";
	private String[] imagens = {"C:\\Users\\Usuario 10\\Desktop\\1DES\\Fpoo\\JF\\Tela\\Imagem\\Katia.png",
			"C:\\Users\\Usuario 10\\Desktop\\1DES\\Fpoo\\JF\\Tela\\Imagem\\Maria.png"
			,"C:\\Users\\Usuario 10\\Desktop\\1DES\\Fpoo\\JF\\Tela\\Imagem\\Silva.png" };
	private ImageIcon icon;
	private int autoId = Process.funi.size() + 1;
	private String texto = "";
	
	Tela(){
	setTitle("Prancheta do dia");
	setBounds(650,150, 750, 650);
	painel = new JPanel();
	setIconImage(new ImageIcon(imgIco).getImage());
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
	
	tfid = new JTextField(String.format("%d", autoId));
	tfid.setEditable(false);
	tfid.setBounds(55,25,55,20);
	painel.add(tfid);
	
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
	
	nome = new JLabel("FUNCIONARIO: ");
	nome.setBounds(340,260, 120, 30);
	painel.add(nome);
	tfnome = new JComboBox<String>(
	new String[] { "Katia", "Maria", "Silva" });
	tfnome.setBounds(335,290, 255, 30);
	painel.add(tfnome);
	
	verResultados = new JTextArea();
	verResultados.setEditable(false);
	verResultados.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
	
	rolagem = new JScrollPane(verResultados);
	rolagem.setBounds(40,350,600,200);
	painel.add(rolagem);
	
	imagem = new JLabel();
	imagem.setBounds(330,115, 250, 150);
	imagem.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
	alterarImagens(0);
	painel.add(imagem);
	

	cadastrar = new JButton("Cadastrar");
	buscar = new JButton("Buscar");
	alterar = new JButton("Alterar");
	deletar = new JButton("Apagar");
	cadastrar.setBounds(600,50, 100, 25);
	buscar.setBounds(450,50,100, 25);
	alterar.setBounds(290,50,100, 25);

	alterar.setEnabled(true);
	deletar.setEnabled(false);
	
	cadastrar.addActionListener(this);
	buscar.addActionListener(this);
	alterar.addActionListener(this);
	deletar.addActionListener(this);
	
	painel.add(cadastrar);
	painel.add(deletar);
	painel.add(alterar);
	painel.add(buscar);
 
	}
		
	private void alterarImagens(int indice) {
		icon = new ImageIcon(new ImageIcon(imagens[indice]).getImage().getScaledInstance(250,180, 100));
		imagem.setIcon(icon);
	}
	private void cadastrar()throws NumberFormatException, ParseException{
		if(tfct.getText().length() !=0 && tfqtc.getText().length() != 0 && tfvlr.getText().length() != 0) {
			Process.funi.add(new Funcionario(autoId,tfnome.getSelectedItem().toString(),tffuncao.getSelectedText().toString(),tfct.getText().toString(),Integer.parseInt(tfqtc.getText().toString(),Double.parseDouble(tfvlr.getText().toString()))));
			  autoId++;
			  
		} else {
			JOptionPane.showMessageDialog(this, "Favor Preencher todos as informações");
		}
		
	}
	
	
	
	
	int obterIndiceFuncionario(String Funcionario) {
		switch (Funcionario) {
		case "Katia":
			return 0;
		case "Maria":
			return 1;
		case "Silva":
			return 2;
		default:
			return -1;
		}
	}
	public static void main(String[] args) {
	new Tela().setVisible(true);

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tfnome) {
			alterarImagens(tfnome.getSelectedIndex());
		}
		
	}

}