package Support;

import Utils.Utils;

public class CD extends Multimedia {
    private int NbPlage;

    public CD() {
        super();
    }
    
    
    
	public CD(String auteur, String titre, String reference, String duree, int nbPlage) {
		super(auteur, titre, reference, duree);
		this.NbPlage = nbPlage;
	}



	// méthode qui remplit les champs d'un objet CD
	public void fillSupport() {
		super.fillSupport();
		NbPlage = Utils.scanInteger("Combien de plages ?");

	}

    @Override
    public String toString() {
        return super.toString() + " - CD [NbPlage=" + NbPlage + "]";
    }

    public int getNbPlage() {
        return NbPlage;
    }

    public void setNbPlage(int nbPlage) {
        NbPlage = nbPlage;
    }

}
