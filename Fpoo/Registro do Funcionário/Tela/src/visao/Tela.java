package visao;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

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
	private JLabel id,nome,oq,funcao,data,qtc,vlr,rotulo, imagem;
	private JTextField tfid,tfoq, tffuncao,tfdata,tfqtc,tfvlr;
	private JTextArea verResultados;
	private JScrollPane rolagem;
	private JButton cadastrar, buscar,filtrar, deletar, alterar;
	private String imgIco = "./Funcionario/icone.png";
	private String[] imagens = {"C:\\Users\\Usuario 10\\Desktop\\1DES\\Fpoo\\JF\\Tela\\Imagem\\Katia.png",
			"C:\\Users\\Usuario 10\\Desktop\\1DES\\Fpoo\\JF\\Tela\\Imagem\\Maria.png"
			,"C:\\Users\\Usuario 10\\Desktop\\1DES\\Fpoo\\JF\\Tela\\Imagem\\Silva.png" };
	private ImageIcon icon;
	private int autoId = Process.funi.size() + 1;
	private String texto = "";
	
	private final Locale BRASIL = new Locale("pt", "BR");
	
	Tela(){
	setTitle("Registro do Funcionário");
	setBounds(650,150, 750, 650);
	painel = new JPanel();
	setIconImage(new ImageIcon(imgIco).getImage());
	painel.setBackground(new Color(255,235,245));
	setContentPane(painel);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(null);
	
	id = new JLabel("Id");
	id.setBounds(25, 20, 120, 30);
	painel.add(id);

	funcao = new JLabel("Funçao do funcionario");
	funcao.setBounds(25,70,125,30);
	painel.add(funcao);
	
	oq = new JLabel(" O que fez:");
	oq.setBounds(25,117, 125,30);
	painel.add(oq);
	
	data = new JLabel(" Data:");
	data.setBounds(25,168, 125,30);
	painel.add(data);
	
	qtc = new JLabel("Clientes atendidos:");
	qtc.setBounds(25,216,125,30);
	painel.add(qtc);
	vlr = new JLabel("Valor total do dia:");
	vlr.setBounds(25,257, 125, 30);
	painel.add(vlr);
	rotulo = new JLabel(" Id |  Nome |   Funçao  | O que fez |  Data  | Clientes/atendidos | Total do dia |");
	rotulo.setBounds(40,319,500, 30);
	painel.add(rotulo);
	
	
	tfid = new JTextField(String.format("%d", autoId));
	tfid.setEditable(false);
	tfid.setBounds(55,25,55,20);
	painel.add(tfid);
	
	cbfuncao = new JComboBox<String>(new String[] { "Cabeleleira", "D.Sobrancelhas", "Unhas"});
	cbfuncao.setBounds(160,70,120,24);
	painel.add(cbfuncao);
	
	tfoq = new JTextField();
	tfoq.setBounds(115,120,125,25);
	painel.add(tfoq);
	
	tfdata = new JTextField("Dia de hoje");
	tfdata.setEditable(false);
	tfdata.setBounds(110,170,125,25);
	painel.add(tfdata);
	
	tfqtc = new JTextField();
	tfqtc.setBounds(135,218,125,25);
	painel.add(tfqtc);
	
	tfvlr = new JTextField();
	tfvlr.setBounds(150,260,127,25);
	painel.add(tfvlr);
	
	nome = new JLabel("FUNCIONARIO: ");
	nome.setBounds(335,260, 120, 30);
	painel.add(nome);
	tfnome = new JComboBox<String>(
	new String[] { "Katia", "Maria", "Silva" });
	tfnome.setBounds(335,290, 255, 30);
	painel.add(tfnome);
	
	verResultados = new JTextArea();
	verResultados.setEditable(false);
	verResultados.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red));
	
	rolagem = new JScrollPane(verResultados);
	rolagem.setBounds(35,350,600,200);
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
	cadastrar.setBounds(600,35, 100, 24);
	buscar.setBounds(500,35,100, 24);
	alterar.setBounds(400,35,100, 24);
	deletar.setBounds(300,35,100, 24);

	alterar.setEnabled(true);
	deletar.setEnabled(false);
	
	
	cadastrar.addActionListener(this);
	buscar.addActionListener(this);
	alterar.addActionListener(this);
	
	deletar.addActionListener(this);
	tfnome.addActionListener(this);
	
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
		
		String data = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(Calendar.getInstance().getTime());
		
		if(tfoq.getText().length() !=0 &&  tfqtc.getText().length() !=0 && tfvlr.getText().length() !=0) {
			Process.funi.add(new Funcionario(autoId,tfnome.getSelectedItem().toString(),cbfuncao.getSelectedItem().toString(),tfoq.getText().toString(),data,Integer.parseInt(tfqtc.getText().toString()),Double.parseDouble(tfvlr.getText().toString())));
			  autoId++;
			  limparCampos();
				preencherAreaDeTexto();
				Process.salvar();
			  
		} else {
			JOptionPane.showMessageDialog(this, "Favor Preencher todos as informações");
		}
		
	}
	
	private void deletar() {
		int id = Integer.parseInt(tfid.getText());
		int indice = -1;
		for (Funcionario manu : Process.funi) {
			if (manu.getId() == id) {
				indice = Process.funi.indexOf(manu);
			}
		}
		 Process.funi.remove(indice);
			preencherAreaDeTexto();
			limparCampos();
			cadastrar.setEnabled(true);
			alterar.setEnabled(false);
			deletar.setEnabled(false);
			Process.salvar();
			tfid.setText(String.format("%d", Process.funi.size() + 1));
	}
	
	private void alterar() {
		String data = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(Calendar.getInstance().getTime());
		
		int id = Integer.parseInt(tfid.getText());
		int indice = -1;
		
		for(Funcionario f: Process.funi) {
			if(f.getId() == id) {
				indice = Process.funi.indexOf(f);
			}
		}
		
		if(tfoq.getText().length() !=0 && tfqtc.getText().length() != 0 && tfvlr.getText().length() != 0) {
			Process.funi.set(indice,  new Funcionario(Integer.parseInt(tfid.getText().toString()), tfnome.getSelectedItem().toString(),
					 cbfuncao.getSelectedItem().toString(),
					 tfoq.getText().toString(),data,
					Integer.parseInt(tfqtc.getText().toString()),
					Double.parseDouble(tfvlr.getText().toString())));
			preencherAreaDeTexto();
			limparCampos();
		}else {
			JOptionPane.showMessageDialog(this, "Favor preencher todos os campos.");
		}
		cadastrar.setEnabled(true);
		alterar.setEnabled(false);
		deletar.setEnabled(false);
		tfid.setText(String.format("%d", Process.funi.size() + 1));
		Process.salvar();
	}
	
	private void buscar() {
		String entrada = JOptionPane.showInputDialog( this,"Digite o id do funcionario");
	
		boolean isNumeric = true;
		if (entrada != null) {
			for (int i = 0; i < entrada.length(); i++) {
				if (!Character.isDigit(entrada.charAt(i))) {
					isNumeric = false;
				}
			}
		}else {
			isNumeric = false;
		}
		if (isNumeric) {
int       id = Integer.parseInt(entrada);
			boolean achou = false;
			
			for (Funcionario v : Process.funi) {
				if (v.getId() == id) {
					achou = true;
					int indice = Process.funi.indexOf(v);
					tfid.setText(Process.funi.get(indice).getId("s"));
					tfnome.setSelectedIndex(obterIndiceFuncionario(Process.funi.get(indice).getNome()));
					cbfuncao.setSelectedIndex(obterIndicefuncao(Process.funi.get(indice).getFuncao()));
					tfoq.setText(Process.funi.get(indice).getCategoria());
					tfdata.setText(Process.funi.get(indice).getData());
					tfqtc.setText(Process.funi.get(indice).getQtc("s"));
					tfvlr.setText(Process.funi.get(indice).getVlr("s"));
					
					Process.salvar();
					cadastrar.setEnabled(false);
					alterar.setEnabled(true);
					deletar.setEnabled(true);
					break;
					}
				}
	}
		
	}
	private void  limparCampos() {
		tfoq.setText(null);
		tfdata.setText(null);
		tfqtc.setText(null);
		tfvlr.setText(null);
		
	}
	private void preencherAreaDeTexto() {
		texto = "";
		for (Funcionario f :Process.funi) {
			texto += f.toString()+"\n";
		}
		verResultados.setText(texto);
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
		int obterIndicefuncao(String Fun) {
			switch (Fun) {
			case "Cabeleleira":
			return 0;
			case "Design sobrancelha":
				return 1;
			case "Unhas":
				return 2;
				
			default:
				return -1;
			}
			
	}
	public static void main(String[] args) {
	new Tela().setVisible(true);
	Process.abrir();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tfnome) {
			alterarImagens(tfnome.getSelectedIndex());
		}if(e.getSource() == cadastrar){
			try {
				cadastrar();
			} catch (NumberFormatException | ParseException e1) {
				e1.printStackTrace();
			}
		}
		if (e.getSource() == buscar) {
			buscar();
		}
		if (e.getSource() == alterar) {
			alterar();
		}
		if (e.getSource() == deletar) {
			deletar();
		}
		
	}

}