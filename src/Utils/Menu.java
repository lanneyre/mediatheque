package Utils;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import Support.*;

public class Menu {
    public ArrayList<Support> supports;

    public Menu() {
        // supports = new ArrayList<Support>();
        try {
            this.load();
        }catch(FileNotFoundException e) {
        	//si le fichier n'existe pas encore, on est sans doute sur le premier lancement
        	System.out.println("Bienvenue dans votre première utilisation de l'appli Mediatheque !");
        	//si on ne trouve pas de fichier bdd.xml on crée une liste vide pour travailler avec
            supports = new ArrayList<Support>();
        }catch (Exception e) {
            // si on a une exception autre qu'un fichier non trouvé
            System.out.println("Une erreur est survenue");
            System.out.println(e.getMessage());
            
        }

    }

    public void start() {
        String question = "Que voulez faire ?\n1- Afficher les supports\n2- Créer un support\n3- Sauvegarder";
        Integer userChoice = Utils.scanInteger(question);
        while (userChoice != 0) {
            switch (userChoice) {
                case 1:
                    listing();
                    break;
                case 2:
                    create();
                    break;
                default:
                    try {
                        save();
                    } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println("Une erreur est survenue");
                    }
                    break;
            }
            userChoice = Utils.scanInteger(question);
        }
    }

    public void listing() {
        for (Support support : supports) {
            System.out.println(support);
        }
    }

    public void create() {
        String question = "Que voulez créer ?\n1- Livre\n2- DVD\n3- CD\n0- STOP";
        Integer userChoice = Utils.scanInteger(question);
        while (userChoice != 0) {
        	Support s = null;
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
//                    supports.add(new Multimedia());
                    break;
            }
            if(s instanceof Support) {
            	s.fillSupport();
                supports.add(s);
            }
            
            userChoice = Utils.scanInteger(question);
        }
    }

    //l'objet que je lis dans mon fichier XML est forcément une ArrayList<Support>
    @SuppressWarnings("unchecked")
	public void load() throws IOException {
    	//crée un flux de lecture depuis un fichier nommé bdd.xml s'il existe
        FileInputStream fis = new FileInputStream("bdd.xml");
        XMLDecoder decoder = new XMLDecoder(fis);
        supports = (ArrayList<Support>) decoder.readObject();
        decoder.close();
        fis.close();

    }

    public void save() throws IOException {
        FileOutputStream fos = new FileOutputStream("bdd.xml");
        XMLEncoder encoder = new XMLEncoder(fos);
        encoder.writeObject(supports);
        encoder.close();
        fos.close();
        System.out.println("it's ok");
    }
}
