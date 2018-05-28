package application;

import domaine.Groupe;

public class Bonjour {
	public static void main(String arg[])
	{
		Groupe grp = new Groupe(arg);
		System.out.println("Salut au groupe " + grp + "...");
		grp.saluer();
	}
}
