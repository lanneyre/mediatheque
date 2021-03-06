package Support;

import Utils.Utils;

public class Dvd extends Multimedia {
    private String Bonus;

    public Dvd(boolean sc) {
        super(sc);
        if (sc) {
            Bonus = Utils.scanString("Quel est le bonus ?");
        }
    }

    public Dvd() {
        super();
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
