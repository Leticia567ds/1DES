package des3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import des3.Tela;

public class Tela extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel Painel;
	private JLabel rotulo1;
	private JTextField gerar;
	private JButton login;
	
	Tela(){
		setTitle("Tabela");
		setBounds(550,400,350,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Painel = new JPanel();
		setContentPane(Painel);
		setLayout(null);
		
		rotulo1 = new JLabel("Nome:");
		rotulo1.setBounds(20,20,100,20);
		login = new JButton("Gerar números Aleatório");
		login.setBounds(20,40,200,30);
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Random r = new Random();
				 for(int i = 0; i < 10; i++) {
					 gerar.setText(gerar.getText()+""+ r.nextInt(100));
				 }
				
			}
		});
		gerar = new JTextField();
		gerar.setBounds(20,90,200,60);
		gerar.setEditable(false);
			
			 
			
		
		
		Painel.add(rotulo1);
		Painel.add(login);
		Painel.add(gerar);
		}
	
        public void actionPerformed(ActionEvent e) {
        	Random r = new Random();
			for(int i = 0;i < 10; i++) {
				gerar.setText(gerar.getText()+ "" + r.nextInt(100));
			}
		}
	public static void main(String[] args) {
		Tela tela = new Tela();
		tela.setVisible(true);

	}

}
