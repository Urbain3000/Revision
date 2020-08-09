package methodes;

public class ReturnAvecParamettre {

	public static void main(String[] args) {
		
String couleur;
couleur = retourneCouleur("Orange");
System.out.println(couleur);

	}
	
	public static String retourneCouleur(String couleur) {
		String entete ="Ma couleur est:";
		
		return entete + couleur;
		
	}
}
// Cette fois ci Bachirou doit me donner un paramettre de plus "une agence"
// cette foi ci c'est Bachirou va me specifier le livre d'informatique dont il a beson
//Bachirou va me demander qu'il veut la liste des employers de Lille
//et c'est cette information obligateur que je doit lui ramener en bon eduforme'