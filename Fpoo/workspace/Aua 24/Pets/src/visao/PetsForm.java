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
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controle.PetProcess;
import modelo.Pet;
 

public class PetsForm extends JFrame implements ActionListener{  

	private static final long serialVersionUID = 1L;
	
	private JPanel painel;
	private JLabel id, especie, nome, raca, peso, nas, nomeDono, telefone, rotulos,imagem;
    
	private JTextField tfid,tfnome, tfraca, tfpeso, tfnas, tfnomeDono, tftelefone;
	private JComboBox<String> Especie;
	private JTextArea Tela;
	private String[] imagens =  {  "C:\\Users\\des\\Desktop\\1DES\\Fpoo\\workspace\\Aua 24\\Pets\\Imagem\\cat.jpg",
			"C:\\Users\\des\\Desktop\\1DES\\Fpoo\\workspace\\Aua 24\\Pets\\Imagem\\22.jpg", 
			"C:\\Users\\des\\Desktop\\1DES\\Fpoo\\workspace\\Aua 24\\Pets\\Imagem\\Pássaros.jpg",
			"C:\\Users\\des\\Desktop\\1DES\\Fpoo\\workspace\\Aua 24\\Pets\\Imagem\\coelho.jpg",
			"Outros"
	};
	private ImageIcon icon;
	private JButton create, read, update, delete;
	private int autoId = PetProcess.pets.size() + 1;
	private String texto = "";
	
	
	PetsForm() throws ParseException {
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
		
		rotulos = new JLabel("Id:     Espécie:       Pet:      Raça:      Peso:       Idade:       Dono:        Telefone:");
		rotulos.setBounds(20, 270, 400, 30);
		painel.add(rotulos);
		
		tfid = new JTextField(String.format("%d", autoId));
		tfid.setEnabled(true);
		tfid.setBackground(new Color(210, 210 , 210));
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
		Tela.setEnabled(true);
		Tela.setBounds(20,300, 400, 150);
		Tela.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
		preencherAreaDeTexto();
		painel.add(Tela);
		 
		
		
		imagem = new JLabel();
		imagem.setBounds(250,150,215,120);
		alternarImagens(0);
		painel.add(imagem);
		
		imagem.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
		
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
		
		
		Especie.addActionListener(this);
		create.addActionListener(this);
		read.addActionListener(this);
		update.addActionListener(this);
		delete.addActionListener(this);
		
		
	}
	
	private void alternarImagens(int indice) {
		icon = new ImageIcon(new ImageIcon(imagens[indice]).getImage().getScaledInstance(212,180, 100));
		imagem.setIcon(icon);
	}
	
	 
	//CREATE - CRUD
	private void cadastrar() throws NumberFormatException, ParseException {
		if (tfnome.getText().length() != 0 && tfraca.getText().length() != 0 && tfpeso.getText().length() != 0
				&& tfnas.getText().length() != 0 && tfnomeDono.getText().length() != 0
				&& tftelefone.getText().length() != 0) {	
			PetProcess.pets
					.add(new Pet(autoId, Especie.getSelectedItem().toString(), tfnome.getText(), tfraca.getText(), Float.parseFloat(tfpeso.getText()),tfnas.getText(), tfnomeDono.getText(), tftelefone.getText()));
		autoId++;
			preencherAreaDeTexto();
			limparCampos();
		} else {
			JOptionPane.showMessageDialog(this, "Favor preencher todos os campos.");
		}
	}
	
	private void limparCampos(){
		tfnome.setText(null);
		tfraca.setText(null);
		tfpeso.setText(null);
		tfnas.setText(null);
		tfnomeDono.setText(null);
		tftelefone.setText(null);
	}
	
	private void preencherAreaDeTexto() {
		texto = ""; 
		for (Pet p : PetProcess.pets) {
			texto += p.toString();
		}
		Tela.setText(texto);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Especie) {
			alternarImagens(Especie.getSelectedIndex());
		}
		if (e.getSource() == create) {
			try {
				cadastrar();
			} catch (NumberFormatException | ParseException e1) {
				System.out.println("");
			}
		}
		if (e.getSource() == read) {

		}
		if (e.getSource() == update) {

		}
		if (e.getSource() == delete) {

		}
	}

	public static void main(String[] agrs) throws ParseException {
		PetProcess.carregarTestes();
		new PetsForm().setVisible(true);
	}

}
