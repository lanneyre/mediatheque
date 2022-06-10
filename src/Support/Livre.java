package Support;

import Utils.Utils;

public class Livre extends Support {
    private int NbPage;

    public Livre() {
        super();
    }

    public Livre(boolean sc) {
        super(sc);
        if (sc) {
            NbPage = Utils.scanInteger("Combien de page ?");
        }

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
