package modelo;

public class Moto extends Veiculo {
	private int cilindradas;

	public Moto() {

	}

	public Moto(int cilindradas, String placa, int anoModelo, int anoFabricao, String modelo, String marca,
			double valor) {
		this.cilindradas = cilindradas;
		this.setPlaca(placa);
		this.setanoModelo(anoModelo);
		this.setanoFabricao(anoFabricao);
		this.setmodelo(modelo);
		this.setmarca(marca);
		this.setValor(valor);
	}
    
	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		return "Moto \nCilindradas = " + cilindradas + ", Placa()=" + getPlaca() + "Ano do Modelo()=" + getanoModelo()
				+ "Ano de Fabricao()=" + getanoFabricao() + ", Modelo()= " + getmodelo() + "Marca()= "
				+ getmarca() + "Valor()= " + getValor();
	}

	 

} 
