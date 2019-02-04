package oui;
import java.util.Scanner;

public class UtiliseRacine
{
	public static void main(String[] argv)
	{
		Scanner scanner;
		scanner = new Scanner(System.in);
		try {
			
			
			int value;
			value = scanner.nextInt();
			
			Racine extracteur = new Racine(0.01);

			double operande= (Double.valueOf(value)).doubleValue();
			double valeurRacine;

			valeurRacine=extracteur.racine(operande);
			System.out.println(valeurRacine);
			System.out.println("precision "+extracteur.getPrecision() + " , erreur =" + (valeurRacine-Math.sqrt(operande)));

			extracteur.setPrecision(0.00001);

			valeurRacine=extracteur.racine(operande);
			System.out.println(valeurRacine);
			System.out.println("precision "+extracteur.getPrecision() + " , erreur =" + (valeurRacine-Math.sqrt(operande)));
		} catch (NegException e) {   }
		finally {
		    if(scanner!=null)
		        scanner.close();
		}
	}
}