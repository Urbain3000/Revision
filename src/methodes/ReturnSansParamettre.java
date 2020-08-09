package methodes;

public class ReturnSansParamettre {
	
	// l'entreprise nous forme chacun
	// à moi la recuperation des noms des employés et leur mise en dossier
	// à Bichirou aura été formé et aura une clé USB quand il vient,
	//il me demande la liste des employés
	// mon role sans commentaire sera de directement lui mettre la liste sur sa clé
	// il va la recuperer et les afficher
	// et a tous moment tu peu me demander à nouveau cette liste et je donne
	
	
	public static void main(String[] args) {
		
		
		String nom; //bachirou
		
		nom=retournNom(); // urbain
		
		System.out.println(nom); //bachirou
		
	}
	
	//creation
	// urbain
	public static String retournNom() {
		String s = " !";
		return "Urbain" + s;
	}
}
