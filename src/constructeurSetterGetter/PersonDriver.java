package constructeurSetterGetter;

public class PersonDriver {

	public static void main(String[] args) {

		Person p1 = new Person();
		// le Constructeur avec parametre sert à initialiser les attribut au moment de la création de la class (Person)
		Person p2 = new Person("Kouamé", "Urbain", 30);
		
		System.out.println(p1.getNom());
		System.out.println(p1.getPrenom());
		System.out.println(p1.getAge());
		
		System.out.println(p2.getNom());
		System.out.println(p2.getPrenom());
		System.out.println(p2.getAge());
		
		//comment DEFINIR LES VALEUR DES ATTRIBUTS DE P1
		//POUR CELA ON VA UTILISER LES SETTER QUI VONT DEFINIR LES ATTRIBUTS
		
		// les setteurs servent à initialiser les attribut après la création de la class (Person)
		p1.setNom("Koné");
		p1.setPrenom("Bachirou");
		p1.setAge(30);
		
		System.out.println(p1.getNom());
		System.out.println(p1.getPrenom());
		System.out.println(p1.getAge());
		
	}

}
