package constructeurSetterGetter;

public class Person {

	private String nom;
	private String prenom;
	private int age;
	
	//le contructeur: sa particularités
	//1-il n'a ni return, void rien
	//2-et son nom est exactement le nom de la class (ou du fichier  .java)
	
	//le constructeur a 2 roles
	//le premier c'est pouvoir creer des objets Person 
	//et après son deuxieme role est de INITIALISER ses attributs.
	
	//on peu initialiser avant ou apres / 
	// Person P1 = new Person et doit pas le changer
	
	public Person() {
	}
	
	
	public Person(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}




	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
