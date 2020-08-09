package variables;

public class VariablesDriver {

	public static void main(String[] args) {

		//declaration des variables (int, integer, double, Double)
		
		int i1 = 10;
		Integer i2 = 20;

		
		String s1 = new String("Hello");
		
		double d1  = 30.2;
		Double d2 = 30D;
		
		float f1 =14.5f;
		Float f2 =12.5F;
		
		Double d3 = i2.doubleValue();
		// les primitifs sont du type brute "c'est vraiment du brute" et les types avancés c'est en fait les primitif "avec des supper pouvoir"(avec des fction avancée)
		
		// Fonctionnalitées avancées
		
		System.out.println("i2.intValue() " + i2.intValue());
		System.out.println("i2.doubleValue() " + i2.doubleValue());
		
		
		
		//Affichage
		
		System.out.println(i1);
		System.out.println(i2);
		
		
		System.out.println(s1);
		
	    System.out.println(d1);
	    System.out.println(d2);
	    
	    System.out.println(f1);
	    System.out.println(f2);
	    
	    
	    //Remarques importantes
	    
	    //il faut commencer par le type de la variable, le nom de la variable, l'operateur d'affectation, la valeur et enfin; 
	    //type nom = valeur 10... ;
	    
	    // les private public et protected viennent après
	    
	    // l'initialisation ce fait ds les types primitifs. il n y a pas de NEW...
	    // l'instatiation ce fait sur les types avancées (String, Double) là il y a un NEW..."il peut y avoir new"
	    //les types primitifs (jamais new) commence par une miniscule et la avancées (parfois new) commence par une majuscule...
	    
	    //Type nom = new Type(valeur 10...)  ;

	    
	    
			
	}

}
