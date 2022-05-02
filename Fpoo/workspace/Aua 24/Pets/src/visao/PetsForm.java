package visao;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
 

public class PetsForm extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel painel;
	private JLabel id, especie, nome, raca, peso, nas, nomeDono, telefone, rotulos,imagem;
    
	private JTextField tfid,tfnome, tfraca, tfpeso, tfnas, tfnomeDono, tftelefone;
	private JComboBox<String> Especie;
	private JTextArea Tela;
	private JButton create, read, update, delete;
	
	
	PetsForm() {
		setTitle("Formulário de Pets");
		setBounds(200, 300, 500, 500);
		painel = new JPanel();
		painel.setBackground(new Color(255, 190 , 203 ));
		setContentPane(painel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		id = new JLabel("Id:");
		id.setBounds(20, 20, 120, 30);
		painel.add(id);
		
		especie = new JLabel("especie:");
		especie.setBounds(20, 50, 120, 30);
		painel.add(especie);
		
		nome = new JLabel("Nome:");
		nome.setBounds(20,80, 120, 30);
		painel.add(nome);
		
		raca = new JLabel("Raça:");
		raca.setBounds(20, 110, 120, 30);
		painel.add(raca);
		
		peso = new JLabel("Peso:");
		peso.setBounds(20,137, 120, 30);
		painel.add(peso);
		
		nas = new JLabel("Nascimento:");
		nas.setBounds(20,166, 120, 30);
		painel.add(nas);
		
		nomeDono = new JLabel("Dono:");
		nomeDono.setBounds(20, 200, 120, 30);
		painel.add(nomeDono);
		
		telefone = new JLabel("Telefone:");
		telefone.setBounds(20,230, 120, 30);
		painel.add(telefone);
		
		rotulos = new JLabel("Id:     Espécie:       Pet:        Peso:       Idade:       Dono:        Telefone:");
		rotulos.setBounds(20, 270, 400, 30);
		painel.add(rotulos);
		
		tfid = new JTextField();
		tfid.setEnabled(false);
		tfid.setBounds(100, 20, 120, 30);
	    painel.add(tfid);
	    
	    Especie = new JComboBox(new String[] { "Gato", "Cachorro", "passaro", "Coelho", "Outro" });
		Especie.setBounds(100, 50, 120, 30);
		painel.add(Especie);
		
	    tfnome = new JTextField();
		tfnome.setBounds(100, 80, 120, 30);
	    painel.add(tfnome);
	    
	    tfraca = new JTextField();
		tfraca.setBounds(100, 110, 120, 30);
	    painel.add(tfraca);
	    
	    tfpeso = new JTextField();
		tfpeso.setBounds(100, 140, 120, 30);
	    painel.add(tfpeso);
	    
	    tfnas = new JTextField();
		tfnas.setBounds(100, 170, 120, 30);
	    painel.add(tfnas);
	    
	    tfnomeDono = new JTextField();
		tfnomeDono.setBounds(100,200, 120, 30);
	    painel.add(tfnomeDono);
	    
	    tftelefone = new JTextField();
		tftelefone.setBounds(100,230, 120, 30);
	    painel.add(tftelefone);
	    
	    Tela = new JTextArea();
		Tela.setEnabled(false);
		Tela.setBounds(20,300, 400, 150);
		Tela.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
		painel.add(Tela);
		
		imagem = new JLabel("              Imagem aqui    ");
		imagem.setBounds(250,150,215,120);
		imagem.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
		painel.add(imagem);
		
		create = new JButton("Cadastrar");
		read = new JButton("Buscar");
		update = new JButton("Atualizar");
		delete = new JButton("Excluir");
		create.setBounds(280, 20, 150, 30);
		read.setBounds(280, 50, 150, 30);
		update.setBounds(280, 80, 150, 30);
		delete.setBounds(280, 110, 150, 30);
		update.setEnabled(false);
		delete.setEnabled(false);
		painel.add(create);
		painel.add(read);
		painel.add(update);
		painel.add(delete);
	}
	
	public static void main(String[] args) {
		new PetsForm().setVisible(true);

	}

}
