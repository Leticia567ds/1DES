package modelo;

public class Gato extends Animal {
	private int qtdVidasUtilizadas = 7;

	public Gato(String especie, String nome, float peso, String raca, int qtdVidasUtilizadas) {
		super(especie, nome, peso, raca);
		this.qtdVidasUtilizadas = qtdVidasUtilizadas;
	}

	@Override
	public String toString() {
		return "QUANTIDADE DE VIDA UTILIZADAS:" + qtdVidasUtilizadas+super.toString();
	}

}
