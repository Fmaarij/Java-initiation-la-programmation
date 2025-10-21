import java.util.Scanner;

public class Exercice3_Moyenne {
    public static void main(String[] args) {
        /*
        Réécrire un programme qui calcule la moyenne d’une série de n nombres entrés par l’utilisateur.
        La valeur de n est fournie en préambule par l’utilisateur (cf. boucle while).
        */
        Scanner scan1 = new Scanner(System.in);
        double moyennne;
        System.out.println("Combien des nombres voulez vous entrez pour connaitre leur moyenne? ");
        int userMax = scan1.nextInt();
        int userNombres = 0;
        for (int i = 1; i <= userMax; i++) {
            System.out.println("Veuillez entrez mnt les nombre " + i + " :");
            userNombres = userNombres + scan1.nextInt();
        }
        moyennne = userNombres / userMax;
        System.out.println("Voila la moyenne des " + userMax + " nombres entrée = " + moyennne);
    }
}
