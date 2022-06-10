package Support;

import Utils.Utils;

public class Multimedia extends Support {
    private String Duree;

    public Multimedia() {
        super();
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
