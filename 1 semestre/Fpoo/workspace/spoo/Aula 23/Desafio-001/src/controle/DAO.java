package controle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Planilha;

public class DAO {

	private BufferedWriter bw;
	private BufferedReader br;

	private String pessoas = "C:\\Users\\des\\Desktop\\1DES\\Fpoo\\workspace\\Aula 25\\Desafio-Aula25\\Dados\\pessoas.csv";
	private String saida = "C:\\Users\\des\\Desktop\\1DES\\Fpoo\\workspace\\Aula 25\\Desafio-Aula25\\Dados\\saida.csv";

	public ArrayList<Planilha> abrir() {
		ArrayList<Planilha> linhas = new ArrayList<>();
		Planilha p;
		try {
			br = new BufferedReader(new FileReader(pessoas));
			String li = br.readLine();
			while (li != null) {
				p = new Planilha(li);
				linhas.add(p);
				li = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return linhas;
	}
	public void salvar(ArrayList<Planilha> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			for (Planilha l : linhas) {
				bw.write(l.toString()+"\r\n");
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

}
}
