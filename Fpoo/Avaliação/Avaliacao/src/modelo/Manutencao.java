package modelo;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Objects;

public class Manutencao {

	private int id;
	private java.util.Date data;
	private String equipamento;
	private Double custoHora;
	private Double tempGasto;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Manutencao(int id, String data, String equipamento, Double custoHora, Double tempGasto) {
		this.id = id;
		try {
			this.data = (Date) sdf.parse(data);
		}catch(ParseException e) {
			System.out.println(e);
		}
		this.equipamento = equipamento;
		this.custoHora = custoHora;
		this.tempGasto = tempGasto;
	}
	
	public Manutencao(String linha) {
		this.id = Integer.parseInt(linha.split(";")[0]);
	try {
		this.data = sdf.parse(linha.split(";")[1]);
	}catch(ParseException e) {
		System.out.println(e);
	}

	this.equipamento = linha.split(";")[2];
	this.custoHora = Double.parseDouble(linha.split(";")[3]);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public java.util.Date getData() {
		return data;
	}
	public String getData(String s) {
		return sdf.format(data);
	}

	public void setData(java.util.Date data) {
		this.data = data;
	}

	public String getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(String equipamento) {
		this.equipamento = equipamento;
	}

	public Double getCustoHora() {
		return custoHora;
	}

	public void setCustoHora(Double custoHora) {
		this.custoHora = custoHora;
	}

	public Double getTempGasto() {
		return tempGasto;
	}

	public void setTempGasto(Double tempGasto) {
		this.tempGasto = tempGasto;
	}
	public double getTotal() {
		return tempGasto*custoHora;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manutencao other = (Manutencao) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return  id + ";" + data + ";" + equipamento + ";" + custoHora
				+ ";" + tempGasto + getTotal();
	}

	public String toCSV() {
		return  id + ";" + sdf.format(data)  + ";" +  equipamento + ";" + custoHora
				+ ";" + tempGasto + getTotal()+"\r\n";
	}

}