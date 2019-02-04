package oui;

public class NegException extends Exception {
    public NegException() {
        System.out.println("Erreur : Vous essayez de calculer la racine d'un nombre négatif !");
    }
}
