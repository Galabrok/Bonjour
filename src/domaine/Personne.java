package domaine;

public class Personne {
	private String nom;

	public Personne(String nm) {
		System.out.println("Instanciation de " + nm);
		nom = nm;
	}
	
	public String toString()
	{
		return nom;
	}
	
	public String salut()
	{
		return "Bonjour " + nom + ".";
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
