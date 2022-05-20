package visao;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controle.ProcesssMnutencoes;

public class FormManutencoes extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel painel;
	private JLabel id, data, equipamento , custoHora, tempGasto; 
	private JTextField tfId,tfdata, tfequi, tfcustoHora, tftempGasto;
	private int autoId = ProcesssMnutencoes.manutencoes.size() + 1;
	
	FormManutencoes(){
		setTitle("Formulario de Manutenção");
		setBounds(100, 100, 800, 600);
		painel = new JPanel();
		painel.setBackground(new Color(255,242,166));
		setContentPane(painel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);

		id = new JLabel("Id:");
		id.setBounds(10, 11, 64, 14);
		painel.add(id);
		data = new JLabel("Data:");
	    data.setBounds(10, 36, 46, 14);
	    painel.add(data);
	    equipamento = new JLabel("Equipmentos:");
	    equipamento.setBounds(10, 61, 46, 14);
	    painel.add(equipamento);
	    custoHora = new JLabel("Custo de hora:");
	    custoHora.setBounds(10, 86, 46, 14);
	    painel.add(custoHora);
	    tempGasto = new JLabel("Tempo Gasto:");
	    tempGasto.setBounds(10, 111, 64, 14);
	    painel.add(tempGasto);
	    
	    tfId = new JTextField(String.format("%d", autoId));
		tfId.setEditable(false);
		tfId.setBounds(74, 8, 86, 20);
		painel.add(tfId);
		tfdata = new JTextField();
		tfdata.setBounds(74, 36, 86, 20);
		painel.add(tfdata);
		tfequi = new JTextField();
		tfdata.setBounds(74, 36, 86, 20);
		painel.add(tfdata);
		 

	}
	public static void main(String[] args) {
		new 
		FormManutencoes().setVisible(true); 

	}

}
