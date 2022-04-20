package atv4;


	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.util.ArrayList;

	
	    public class Arquivo {
		private String nome;
		   
		private int senha;
		   
		private String login;
		   
		    
		   
		public Arquivo(){
		   
		}
		   
		public String getNome(){
		return nome;
		}
		   
		public void setNome(String name){
		nome = name;
		}
		   
		public String getLogin(){
		return login;
		}
		   
		public void setLogin(String log ){
		login = log;
		}
		   
		   
		public void agrupar(String info, String fileArq, boolean append) {
				
			try {
				FileWriter fw = new FileWriter(fileArq + ".txt", append);
				BufferedWriter bw = new BufferedWriter(fw);
					
				bw.write(info + "\r\n");
					
				bw.close();
				fw.close();
					
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
			
		public ArrayList<String> ler (String fileName){
			ArrayList<String> dt = new ArrayList<>();
				
			try {
				FileReader fr = new FileReader(fileName + ".txt");
				BufferedReader br = new BufferedReader(fr);
					
				String li = "";
					
				while((li = br.readLine()) != null) {
					dt.add(li);
				}
					
				br.close();
				fr.close();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
				
			return dt;
		}
		   
	}

