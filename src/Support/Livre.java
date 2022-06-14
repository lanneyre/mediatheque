package Support;

import Utils.Utils;

public class Livre extends Support {
    private int NbPage;

    public Livre() {
        super();
        
    }
    
    

    public Livre(String auteur, String titre, String reference, int nbPage) {
		super(auteur, titre, reference);
		this.NbPage = nbPage;
	}



	// méthode qui remplit les champs d'un objet Livre
 	public void fillSupport() {
 		super.fillSupport();
 		NbPage = Utils.scanInteger("Combien de pages ?");

 	}

    @Override
    public String toString() {
        return super.toString() + " - Livre [NbPage=" + NbPage + "]";
    }

    public int getNbPage() {
        return NbPage;
    }

    public void setNbPage(int nbPage) {
        NbPage = nbPage;
    }

}
