package Support;

import Utils.Utils;

public class Multimedia extends Support {
	protected String Duree;

	public Multimedia() {
		super();

	}

	public Multimedia(String auteur, String titre, String reference, String duree) {
		super(auteur, titre, reference);
		this.Duree = duree;
	}

	// méthode qui remplit les champs d'un objet Multimedia
	//on a surchargé la méthode de Support
	public void fillSupport() {
		//on appelle le fillSupport de Support
		super.fillSupport();
		Duree = Utils.scanString("Quelle est la durée ?");

	}

	public String getDuree() {
		return Duree;
	}

	public void setDuree(String duree) {
		Duree = duree;
	}

	@Override
	public String toString() {
		return super.toString() + " - Multimedia [Duree=" + Duree + "]";
	}

}
