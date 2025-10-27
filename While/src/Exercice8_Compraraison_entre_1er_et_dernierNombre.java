import java.util.Scanner;

public class Exercice8_Compraraison_entre_1er_et_dernierNombre {
    static void main() {
        /*
        8) On suppose que l'utilisateur entre une suite d’entiers positifs, terminée par la valeur sentinelle -1.
        Votre programme doit comparer le premier et le dernier élément de la suite et afficher l'un des
        messages suivants :
            • Le premier est inférieur au dernier
            • Le premier est égal au dernier
            • Le premier est supérieur au dernier
            • La suite est vide
         */
        int premiereNombre = 0;
        int dernierNombre = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez entrez la suite de nombre positive et/ou '-1' pour quitter le programme: ");
        int userInput = 0;
        while (userInput != -1) {
            userInput = scan.nextInt();
            if (premiereNombre <= 0 && premiereNombre < userInput) {
                premiereNombre = userInput;
            } else if (userInput >= 0) {
                dernierNombre = userInput;
            } else if (userInput != -1 && userInput < 0) {
                System.out.println("vous avez introduit des nombre negative veuilllez entrez un nombre positive ou écrivez '-1' pour quitter :");
            }
        }

        if (premiereNombre <= 0 && dernierNombre <= 0) {
            System.out.println("La suite est vide");
        } else {
            System.out.println("*** Premiere nombre = " + premiereNombre + " Derniere nombre = " + dernierNombre + " ***");
            if (premiereNombre < dernierNombre) {
                System.out.println("Le premier nombre " + premiereNombre + " est inférieur au dernier nombre " + dernierNombre + " .");
            }
            if (premiereNombre == dernierNombre) {
                System.out.println("Le premier nombre " + premiereNombre + " est égal au derniere nombre  " + dernierNombre + " .");
            }
            if (premiereNombre > dernierNombre) {
                System.out.println("Le premier nombre " + premiereNombre + " est supérieur au derniere nombre " + dernierNombre + " .");
            }

        }


    }
}
