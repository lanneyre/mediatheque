
import Support.*;
import Utils.Menu;

public class App {
    public static void main(String[] args) /*throws Exception*/ {//throws Exception renvoie le problème au niveau au-dessus : autant que possible, JAMAIS sur un main !
        Menu menu = new Menu();
        menu.start();
    	
    	//
        // menu.load();
        // System.out.println(menu.supports);

        // menu.supports.add(new Livre(true));
        // menu.save();
        // // menu.create();
        // System.out.println(menu.supports);
        
    	
//    	//exemple de gestion d'erreurs sur un cast d'objets
//        Livre livre1 = new Livre();
//        Support support1 = livre1;
//        if(support1 instanceof Livre) { //on n'essaye de faire le cast que si on a le bon type d'objet
//        	Livre copieLivre1 = (Livre) support1;
//        	System.out.println(copieLivre1);
//        }
//        
//        
//        Livre livre2 = new Livre();
//        Support support2 = livre2;
//        if(support2 instanceof CD) {
//        	CD cd1 = (CD) support2;
//        	System.out.println(cd1);
//        }
        
        //menu.supports.add(livre1);
    }
}
