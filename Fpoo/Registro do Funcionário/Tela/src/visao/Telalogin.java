package visao;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controle.Process;
import controle.UsuarioProcess;
import controle.UsuarioProcess;
import controle.Process;


public class Telalogin extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JPanel painel;
	private JLabel email, senha, image;
	private JTextField tfemail;
	private JPasswordField tfsenha;
	private JButton login;
	private String imgIco = "";
	private ImageIcon icon;

	Telalogin() {
		
		setTitle("Login");
		setBounds(400, 100, 600, 400);
		
		painel = new JPanel();
		painel.setBackground(new Color(255,182,193));
		setContentPane(painel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);

		image = new JLabel("");
		image.setBounds(215, 25, 370, 400);
		imagem(0);
		//
		email = new JLabel("E-mail:");
		email.setBounds(180, 70, 120, 40);
		tfemail = new JTextField();
		tfemail.setBounds(180, 100, 233, 35);
		//
		senha = new JLabel("Senha:");
		senha.setBounds(180, 170, 120, 40);
		tfsenha = new JPasswordField();
		tfsenha.setEchoChar('*');
		tfsenha.setBounds(180,199, 233, 35);
		//
		login = new JButton("Login");
		login.setBounds(250, 300, 110, 30);
		
		login.addActionListener(this);

		painel.add(tfemail);
		painel.add(email);
		painel.add(tfsenha);
		painel.add(senha);
		painel.add(login);
		painel.add(image);
	}
	
	
	private void imagem(int indice) {
		icon = new ImageIcon(new ImageIcon(imgIco).getImage().getScaledInstance(370, 400, 100));
		image.setIcon(icon);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == login) {
			if(tfemail.getText().length() > 0 && new String(tfsenha.getPassword()).length() > 0) {
			int indice = UsuarioProcess.checarEmail(tfemail.getText());
			String adm = "admin@admin.com";
			if (tfemail.getText().equals(adm)) {
				if (UsuarioProcess.checarSenha(indice, new String(tfsenha.getPassword()))) {
					this.dispose();
				} else {
					JOptionPane.showMessageDialog(this, "Acesso negado");
				}
			} else {
				if (indice != -1) {
					if (UsuarioProcess.checarSenha(indice, new String(tfsenha.getPassword()))) {
						this.dispose();
						Tela tr = new Tela();
						tr.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(this, "Acesso negado");
					}
				} else {
					JOptionPane.showMessageDialog(this, "Usuário não encontrado");
				}
			}
			}else {
				JOptionPane.showMessageDialog(this, "Preencha o email e a senha");
			}
		}
	}

	public static void main(String[] args) {
		UsuarioProcess.carregar();
		Process.salvar();
		Telalogin login = new Telalogin();
		login.setVisible(true);
	}
}