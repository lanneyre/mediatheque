package Support;

import Utils.Utils;

public class CD extends Multimedia {
    private int NbPlage;

    public CD(boolean sc) {
        super(sc);
        if (sc) {
            NbPlage = Utils.scanInteger("Combien de plage ?");
        }

    }

    public CD() {
        super();
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
