import java.util.Scanner;

public class Exercice4_Minimum {
    public static void main(String[] args) {
        /*
        Ecrire un programme qui détermine le minimum d'une série de n nombres entiers entrés par l'utilisateur.
        Par exemple si l’utilisateur entre :
        8
        5 9 -1 0 12 -7 -4 3’ ordinateur affiche : -7
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Combien des nombres voulez vous entrez pour connaitre le minimum? ");
        int userMax = scan.nextInt();

        System.out.println("Veuillez entrez mnt les nombre " + 0 + " :");
        int minimum = scan.nextInt();
        for (int i = 1; i < userMax; i++) {
            System.out.println("Veuillez entrez mnt les nombre " + i + " :");
            int userNombres = scan.nextInt();
            if (userNombres < minimum) {
                minimum = userNombres;
            }
        }
        System.out.println("minimum = " + minimum);

    }
}
