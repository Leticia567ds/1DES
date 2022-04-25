package ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Arquivo {
	public void Escrever(
			String ler, String fileName, boolean append) {
		try {
			FileWriter fw = new FileWriter(fileName + ".csv", append);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(ler + "\r\n");

			bw.close();
			fw.close();
		} catch (Exception e) {
			System.out.println();
		}

	}
	public ArrayList<String> ler(String fileName) {
		ArrayList<String> entrada = new ArrayList<>();
		try {
			FileReader fr = new FileReader(fileName + ".csv");
			BufferedReader br = new BufferedReader(fr);
			String linha = ";";
			while ((linha = br.readLine()) != null) {
				entrada.add(linha);
			}

			br.close();
			fr.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		return entrada;
	}

}

