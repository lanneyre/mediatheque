package Utils;

import java.util.Scanner;

public class Utils {

	/**
	 * fonction qui demande l'entrée d'une chaîne de caractères à l'utilisateur
	 * puis, à l'aide d'un Scanner, récupère la chaîne entrée
	 * 
	 * @return la chaîne obtenue
	 * @param la question posée à l'utilisateur
	 */
	public static String scanString(String question) {
		System.out.println(question);
		Scanner scan = new Scanner(System.in);
		String ret = scan.nextLine();
		// scan.close();
		return ret;
	}

	/**
	 * fonction qui demande l'entrée d'une chaîne de caractères à l'utilisateur
	 * puis, à l'aide d'un Scanner, récupère le nombre entrée
	 * 
	 * @return le chiffre obtenue
	 * @param la question posée à l'utilisateur
	 */
	public static Integer scanInteger(String question) {
		System.out.println(question);
		Integer ret;
		try {
			Scanner scan = new Scanner(System.in);
			ret = scan.nextInt();
		} catch (Exception exception) {
			return 0;
		}

		// scan.close();
		return ret;
	}
}
