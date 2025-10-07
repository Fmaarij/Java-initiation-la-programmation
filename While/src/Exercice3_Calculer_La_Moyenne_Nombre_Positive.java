import java.util.Scanner;

public class Exercice3_Calculer_La_Moyenne_Nombre_Positive {
    public static void main(String[] args) {
        /*
        Réécrivez le même programme que pour l’exercice précédent, mais cette fois vous devez assurer
        que l’utilisateur entre un nombre (strictement) positif pour n. Vous devez l’obliger à recommencer
        si ce nombre n’est pas positif.
        (Voir l'eenoncé de l'exercice 2!)
         */
        int fois = 0;
        int cmpt = 0;
        double nombre = 0;
        int foisTemporaire = 0;

        Scanner inputTimes = new Scanner(System.in);
        Scanner inputNumbers = new Scanner(System.in);

        System.out.println("Vous voulez calculer la moyenne de combien des nombre ? ");

        while ((fois = inputTimes.nextInt()) <= 0) {

            System.out.println("Le nombre entrée est négative, veuillez entrez un nombre positive!");

        }

        System.out.println("Super, vous voulez avoir la moyenne de " + fois + ".");

        while (cmpt != fois) {
            cmpt++;
            nombre = nombre + inputNumbers.nextInt();
        }

        System.out.println("La moyenne des nombres entrés = " + nombre / fois);

    }
}
