import java.util.Scanner;

public class Exercice5_MoyenneSentinelle {
    public static void main(String[] args) {
        /*
        Ecrire un programme qui calcule la moyenne d'une série de nombres entiers positifs entrés par
        l'utilisateur. L'utilisateur ne sait pas à l'avance combien de nombres il compte entrer mais comme
        ces nombres sont tous positif, il est convenu que l'utilisateur indique son intention d'arrêter la
        saisie par le nombre -1. Ce dernier nombre ne fait pas partie de la série et ne doit pas être compté
        dans la moyenne. Il sert juste à indiquer la fin de la série. On l’appelle une sentinelle. Si par
        exemple l’utilisateur tape 15 9 12 4 15 -1 l’ordinateur calcule la moyenne des 5 premiers
        nombres et répond 11.
         */
        System.out.println("*** Bienvenue au programme de calcul de la moyenne d’une série d’entiers positifs terminée par une sentinelle **** ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez entrez un nombre positive puis appuez sur la touche enter : ");

        int nombresEntree = scan.nextInt();
        int moyen;
        int sommeEntree = 0;
        int fois = 0;
        while (nombresEntree != -1) {
            while (nombresEntree < 0 && nombresEntree != -1) {
                System.out.println("Vous avez entreé un nombre negative veuillez entrez un nombre positive puis appuez sur la touche enter ou  ' -1 '  pour voir le résultats/quitter : ");
                nombresEntree = scan.nextInt();
            }
            sommeEntree += nombresEntree;
            fois++;
            nombresEntree = scan.nextInt();

        }
        moyen = sommeEntree / fois;
        System.out.println("La moyenne de " + sommeEntree + " = " + moyen);

    }
}
