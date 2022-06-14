package Support;

import Utils.Utils;

public class Support {
	protected String Auteur;
	protected String Titre;
	protected String Reference;

	//le constructeur par défaut appelle ici la méthode de remplissage
	public Support() {

	}

	// constructeur paramétré de l'objet Support
	public Support(String auteur, String titre, String reference) {
		super();
		Auteur = auteur;
		Titre = titre;
		Reference = reference;
	}

	// méthode qui remplit les champs d'un objet Support
	public void fillSupport() {
            Auteur = Utils.scanString("Quelle est l'auteur ?");
            Titre = Utils.scanString("Quelle est le titre ?");
            Reference = Utils.scanString("Quelle est la référence ?");

    }

	@Override
	public String toString() {
		return "Support [Auteur=" + Auteur + ", Reference=" + Reference + ", Titre=" + Titre + "]";
	}

	public String getAuteur() {
		return Auteur;
	}

	public void setAuteur(String auteur) {
		Auteur = auteur;
	}

	public String getTitre() {
		return Titre;
	}

	public void setTitre(String titre) {
		Titre = titre;
	}

	public String getReference() {
		return Reference;
	}

	public void setReference(String reference) {
		Reference = reference;
	}

}
