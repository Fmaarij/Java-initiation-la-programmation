import java.util.Scanner;

public class Exercice7_Affichage_De_La_Dernier_Chiffre {
    static void main() {
        /*
        7) On suppose que l'utilisateur entre une suite d’entiers positifs, terminée par la valeur sentinelle -1.
        Votre programme doit afficher le dernier nombre (hormis le -1) entré par l'utilisateur. Si
        l'utilisateur tape 5 3 4 1 6 3 -1, l'ordinateur affiche : "Le dernier est : 3". Que fait votre programme
        si l'utilisateur tape uniquement -1 ?
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez la suite de votre valeurs, pour terminé appuez sur '-1' ");
        int userInput = 0;
        int dernierChifre = 0;

        while (userInput != -1) {
            if (userInput >= 0) {
                dernierChifre = userInput;
                userInput = scan.nextInt();
            } else {
                System.out.println("Vous avez introduit des nombre negatif veuillez entrez des nombres positive.");

                userInput = scan.nextInt();
                // dernierChifre = userInput;
            }

        }
        if (userInput == -1 && dernierChifre == 0) {
            System.out.printf("Vous avez appué sur la touche -1, veullez relancez le programme.");

        } else {
            System.out.printf("dernier chifre = " + dernierChifre);
        }

    }
}
