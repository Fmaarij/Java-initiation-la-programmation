import java.util.Scanner;

public class Exercise6_Carrez {
    public static void main(String[] args) {
        //6) Écrire un programme qui affiche tous les nombres entiers strictement positifs dont le carré
        // est inférieur à un nombre entier n entré par l'utilisateur. Si l’utilisateur entre 20, l’ordinateur
        // affiche 1 2 3 4
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez une valeur max");

        int nombrMmax = sc.nextInt();
        int value = 1;
        while (value * value < nombrMmax) {
            System.out.println(" " + value + " ");
            value++;
        }
    }
}
