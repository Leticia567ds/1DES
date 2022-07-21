package modelo;

public class Vendas extends Pessoas {
	private int codCliente;
	private int codFuncionario;
	private double valor;

	public Vendas() {

	}

	public Vendas(int codCliente, int codFuncionario, double valor) {
		this.codCliente = codCliente;
		this.codFuncionario = codFuncionario;
		this.valor = valor;
	}

	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	public int getCodFuncionario() {
		return codFuncionario;
	}

	public void setCodFuncionario(int codFuncionario) {
		this.codFuncionario = codFuncionario;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Vendas [codCliente=" + codCliente + ", codFuncionario=" + codFuncionario + ", valor=" + valor + "]";
	}

}
