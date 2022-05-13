package controle;
import java.text.ParseException;
import java.util.ArrayList;

import modelo.Despesas;
public class DespesaProcess {

	public static ArrayList<Cadastro> des = new ArrayList<>();
	
	public static void carregarDespesa() throws ParseException {
	des = new ArrayList<>();
	
	des.add(new Despesas("André","12/03/2022","Expoflora","transporte",16));
	des.add(new Despesas("André","12/03/2022","Expoflora","Almoço",30));
	des.add(new Despesas("André","12/03/2022","Expoflora","entrada",50));
	des.add(new Despesas("André","12/03/2022","Expoflora","Lembrancinhas",15));
	des.add(new Despesas("Ciro","15/04/2022","CCXP","Entrada",100));
	des.add(new Despesas("Ciro","15/04/2022","CCXP","trasporte",140));
	des.add(new Despesas("Ciro","15/04/2022","CCXP","Almoço",20));
	des.add(new Despesas("Ciro","15/04/2022","CCXP","jantar",35));
	des.add(new Despesas("Rodrigo","01/05/2022","BGS","Entrada",90));
	des.add(new Despesas("Rodrigo","01/05/2022","BGS","trasporte",40));
	des.add(new Despesas("Rodrigo","01/05/2022","BGS","hospedagem",150));
	des.add(new Despesas("Rodrigo","01/05/2022","BGS","Almoço",35));
	des.add(new Despesas("Rodrigo","01/05/2022","BGS","jantar",65));
}
}
