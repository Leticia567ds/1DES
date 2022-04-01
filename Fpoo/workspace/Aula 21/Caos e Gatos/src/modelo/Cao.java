package modelo;

public class Cao extends Animal {
	 
	private int qtdMotoqueirosAtcados;

	public Cao(String especie, String nome, float peso, String raca,int qtdMotoqueirosAtcados) {
		super(especie, nome, peso, raca);
		this.qtdMotoqueirosAtcados = qtdMotoqueirosAtcados;

	}

	@Override
	public String toString() {
		return "QUANTIDADE DE MOTOQUEIROS ATACADOS:" + qtdMotoqueirosAtcados + super.toString();
	}
	
}
