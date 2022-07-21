package atv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Arquivo {

	public void escrever(ArrayList<Integer> info, String fileName, boolean append) {
		try {
			FileWriter fw = new FileWriter("Numeros.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);

			for (Integer in : info) {
				bw.write( in+"\r\n");
			}

			bw.close();
			fw.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public ArrayList<Integer> ler(String FileName) {
		ArrayList<Integer> list = new ArrayList<>();
		try {
			FileReader fr = new FileReader("Numeros.txt");
			BufferedReader br = new BufferedReader(fr);

			
			String linh = "";
			while ((linh = br.readLine()) != null) {
				 list.add(Integer.parseInt(linh));
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return list;
	}

}
