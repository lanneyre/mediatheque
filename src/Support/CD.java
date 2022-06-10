package Support;

import Utils.Utils;

public class CD extends Multimedia {
    private int NbPlage;

    public CD() {
        super();
        NbPlage = Utils.scanInteger("Combien de plage ?");
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
