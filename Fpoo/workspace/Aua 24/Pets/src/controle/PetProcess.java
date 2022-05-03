package controle;

import java.text.ParseException;
import java.util.ArrayList;

import modelo.Pet;

public class PetProcess {

	public static ArrayList<Pet> pets = new ArrayList<>();
	
	public static void carregarTestes() throws ParseException {
		//Limpar a lista
		pets = new ArrayList<>();
		//Prencher com teste
		pets.add(new Pet(1,"Gato","mimy","Angorá",30,"02/01/2018","Marta","(19)9986-7543"));
		pets.add(new Pet(2,"Cachorro","Toto","Vira Lata",30,"02/01/2017","João","(19)9986-7543"));
		pets.add(new Pet(3,"Passaro","yudy","Curió",20,"02/01/2022","Susy","(19)9986-7543"));
		pets.add(new Pet(4,"Coelho","ki","American",30,"02/01/2017","ly","(19)9986-7543"));                                                           
	}
}
