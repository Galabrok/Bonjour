package domaine;

public class Groupe {
	private Personne membre[];
	public Groupe(String nom[])
	{
		membre = new Personne[nom.length];
		for(int i = 0; i < nom.length; i++)
		{
			membre[i] = new Personne(nom[i]);
		}
	}
	
	public String toString()
	{
		String txt = "( ";
		for (Personne p : membre)
		{
			txt += p + " ";
		}
		txt += ")";
		return txt;
	}
	
	public void saluer()
	{
		for (Personne p : membre)
		{
			System.out.println(p.salut());
		}
	}
}
