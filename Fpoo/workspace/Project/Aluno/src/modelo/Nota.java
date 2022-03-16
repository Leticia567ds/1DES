package modelo;

public class Nota {

	public String componente;
	public float notas[] = new float[3];
	 
public Nota() {
	
}
	public Nota(String componente, float[] notas) {
		this.componente = componente;
		this.notas = notas;
	}

	public float obterMedia() {
		float soma = 0;
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}

		return soma / notas.length;
	}
	public String paraString() {
		return componente+" "+"   "+notas+"   "+"  "+obterMedia();
	}
}
