package controle;

import java.text.ParseException;
import java.util.ArrayList;

import modelo.Pet;

public class PetProcess {

	public static ArrayList<Pet> pets = new ArrayList<>();
	
	public static void carregarTestes() throws ParseException {

		pets = new ArrayList<>();

		pets.add(new Pet(0,"Gato","mimy","Angorá",30,"02/01/2018","Marta","(19)9986-7543"));
		pets.add(new Pet(1,"Cachorro","Toto","Vira Lata",30,"02/01/2017","João","(19)9986-7543"));
		pets.add(new Pet(2,"Passaro","yudy","Curió",20,"02/01/2022","Susy","(19)9986-7543"));
		pets.add(new Pet(3,"Coelho","ki","American",30,"02/01/2017","ly","(19)9986-7543"));    
		 
	}
}
