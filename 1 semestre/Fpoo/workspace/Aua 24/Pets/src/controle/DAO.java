package controle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Pet;

public class DAO {

	private BufferedReader br;
	private BufferedWriter bw;
	
	private String path = "C:\\Users\\des\\Desktop\\1DES\\Fpoo\\workspace\\Aua 24\\Pets\\Dados\\Pets.csv";
	
	public ArrayList<Pet> ler() {
		Pet p;
		ArrayList<Pet> linhas = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader(path));
			String linha =  br.readLine();
			while(linha != null) {
				p = new Pet(linha);
				linhas.add(p);
				linha = br.readline();
			}
			br.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		return null;
		
	}
	
	public void escrever(ArrayList<Pet> linhas) {
		
	}
	
}
