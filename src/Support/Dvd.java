package Support;

import Utils.Utils;

public class Dvd extends Multimedia {
    private String Bonus;

//    public Dvd(boolean sc) {
//        super(sc);
//        if (sc) {
//            Bonus = Utils.scanString("Quel est le bonus ?");
//        }
//    }

    public Dvd() {
        super();
    }
    
    
	public Dvd(String auteur, String titre, String reference, String duree, String Bonus) {
		super(auteur, titre, reference, duree);
		this.Bonus = Bonus;
	}



	// méthode qui remplit les champs d'un objet Dvd
	public void fillSupport() {
		super.fillSupport();
		Bonus = Utils.scanString("Quel est le bonus ?");

	}

    @Override
    public String toString() {
        return super.toString() + " - Dvd [Bonus=" + Bonus + "]";
    }

    public String getBonus() {
        return Bonus;
    }

    public void setBonus(String bonus) {
        Bonus = bonus;
    }

}
