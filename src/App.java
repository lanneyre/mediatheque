import Support.*;

import Utils.Utils;

public class App {
    public static void main(String[] args) throws Exception {
        String question = "Que voulez créer ?\n1- Livre\n2- DVD\n3- CD\n0- STOP";
        Integer userChoice = Utils.scanInteger(question);
        while (userChoice != 0) {
            Support s;
            switch (userChoice) {
                case 1:
                    s = new Livre();
                    break;
                case 2:
                    s = new Dvd();
                    break;
                case 3:
                    s = new CD();
                    break;
                default:
                    s = new Multimedia();
                    break;
            }
            System.out.println(s);
            userChoice = Utils.scanInteger(question);
        }
    }
}
