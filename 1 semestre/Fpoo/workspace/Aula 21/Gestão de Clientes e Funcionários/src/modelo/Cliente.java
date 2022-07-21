package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente extends Pessoas {
	private int id;
	private double creditoLimite;

	public Cliente() {

	}

	public Cliente(int id, double creditoLimite, String nome, String telefone, Date nascimento) {

		this.id = id;
		this.creditoLimite = creditoLimite;
		this.setNome(nome);
		this.settelefone(telefone);
		this.setNas(nascimento);

	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCreditoLimite() {
		return this.creditoLimite;
	}

	public void setCreditoLimite(double creditoLimite) {
		this.creditoLimite = creditoLimite;
	}

	@Override
	public String toString() {
		return "Cliente: \nid = " + id + ", \nCredito de Limite = " + creditoLimite + " \nNome = " + getNome()
				+ " \nTelefone= " + gettelefone() + "\nNascimento = " +new SimpleDateFormat("dd/MM/yyyy").format(getNas());
	}

}
