import java.util.Scanner;

public class Exercice4_Somme_n_Max {
    public static void main(String[] args) {
        /*
        Ecrire un programme qui détermine la plus grande valeur de n telle que la somme des n premiers
        entiers positifs soit inférieure à un nombre max (entier positif) entré par l'utilisateur. Par exemple
        si l'utilisateur entre la valeur 20, la réponse est 5 car 1 + 2 + 3 + 4 + 5 = 15 alors que 1 + 2 + 3 +
        4 + 5 + 6 = 21.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("******************************************");
        System.out.println("Entrez une valeur maximale (entier positif): ");

        int nombreEntree = scan.nextInt();
        int n = 0;
        int somme = 0;

        while (somme + (n + 1) < nombreEntree) {
            n++;
            somme += n;
        }

        System.out.println("******************************************");
        System.out.println("La plus grande valeur de n est : " + n);
        System.out.println("******************************************");
        System.out.println("Car la somme 1 + 2 + ... + " + n + " = " + somme + " < " + nombreEntree + ".");


    }
}
