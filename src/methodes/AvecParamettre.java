package methodes;

public class AvecParamettre {

	public static void main(String[] args) {
		
	//ici on va appeller ici
		
		//ici je peu demander à la secretaire de m'envoyer differentes couleur
		//Secretaire envois moi bleu, Rouge, Vert
		
		//etape 2 appel de la methode "execute ici"
		
		afficherCouleur("Bleu", 1);
		afficherCouleur("Rouge",2);
		afficherCouleur("Vert", 3);
	}

	
	
	//pardon urbain il faut toujour creer ta methode en premier comme ce ci en bas et après en haut
	// on va pas voir quelque chose labas mais c'est quand on va l'appeler qu'on pourra voir
	
	//etape1 creation de la methode
	public static void afficherCouleur(String couleur, int code) {
		
		//etape3 "execute ici aussi" autant de fois
		String p = " !";
		System.out.println("La couleur est : " + couleur + p);
		
		//ici j'ai dit secretaire sans rien demander
	}
	
	
	
	
	
	
	
	
	
		
	}
