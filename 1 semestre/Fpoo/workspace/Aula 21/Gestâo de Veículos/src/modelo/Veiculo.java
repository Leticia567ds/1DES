package modelo;

public class Veiculo {
	private String placa;
	private int anoModelo;
	private int anoFabricao;
	private String modelo;
	private String marca;
	private double valor;

	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getanoModelo() {
		return this.anoModelo;
	}

	public void setanoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}

	public int getanoFabricao() {
		return this.anoFabricao;
	}

	public void setanoFabricao(int anoFabricao) {
		this.anoFabricao = anoFabricao;
	}

	public String getmodelo() {
		return this.modelo;
	}

	public void setmodelo(String modelo) {
		this.modelo = modelo;
	}

	public String getmarca() {
		return this.marca;
	}

	public void setmarca(String marca) {
		this.marca = marca;
	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
