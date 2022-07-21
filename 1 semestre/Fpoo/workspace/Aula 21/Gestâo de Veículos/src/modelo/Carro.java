package modelo;

public class Carro extends Veiculo {

	private String tipo;
	private int passageiro;

	public Carro() {

	}

	public Carro(String tipo, int passageiro, String placa, int anoModelo, int anoFabricao, String modelo, String marca,
			double valor) {

		this.tipo = tipo;
		this.passageiro = passageiro;
		this.setPlaca(placa);
		this.setanoModelo(anoModelo);
		this.setanoFabricao(anoFabricao);
		this.setmodelo(modelo);
		this.setmarca(marca);
		this.setValor(valor);
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPass() {
		return this.passageiro;
	}

	public void setPass(int passageiro) {
		this.passageiro = passageiro;
	}

	@Override
	public String toString() {
		return "Carro: \nTipo = " + tipo + " \nPassageiro = " + passageiro + " \nPlaca()= " + getPlaca() + " \nAno do Modelo()= "
				+ getanoModelo() + " \nAno de Fabrição()= " + getanoFabricao() + "\nModelo()= " + getmodelo()
				+ "\nMarca()= " + getmarca() + "\nValor() = " + getValor();
	}

}
