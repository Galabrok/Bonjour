package application;

import domaine.Personne;

public class Bonjour {
	public static void main(String arg[])
	{
		Personne personne[];
		personne = new Personne[arg.length];
		for (int i = 0; i < arg.length; i++)
		{
			personne[i] = new Personne(arg[i]);
		}
		
		for (Personne p : personne)
		{
			System.out.println(p.salut());
		}
	}
}
