import java.util.Scanner;

public class Exercice2_Calculer_La_Moyenne {
    public static void main(String[] args) {
        /*
        Ecrire un programme qui calcule la moyenne d’une série de n nombres entrés par l’utilisateur. La
        valeur de n est fournie en préambule par l’utilisateur. Par exemple si l’utilisateur veut calculer la
        moyenne de 8 nombres, il entre d’abord 8 et ensuite, les 8 nombres :
        8
        5 9 -1 0 12 -7 -4 3
        l’ordinateur affiche : 2.125
         */
        int fois = 0;
        int cmpt = 0;
        double nombre = 0;

        Scanner inputTimes = new Scanner(System.in);
        Scanner inputNumbers = new Scanner(System.in);

        System.out.println("Vous voulez calculer la moyenne de combien des nombre ? ");
        if (fois <= 0) {
            fois = inputTimes.nextInt();
            while (cmpt != fois) {
                cmpt++;
                nombre = nombre + inputNumbers.nextInt();
            }
            System.out.println("La moyenne des nombres entrés = " + nombre / fois);
        }

    }
}
