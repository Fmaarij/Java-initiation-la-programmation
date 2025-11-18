import java.util.Scanner;

public class DessinerFormes {
    public static void main(String[] args) {
        /*
        Ecrire un programme qui reçoit de l’utilisateur une hauteur h et qui dessine les formes suivantes.
        Utilisez des boucles for imbriquées :
      a)carré

       Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();

        for (int l = 0; l < h; l++) {
            for (int c = 0; c < h; c++) {
                System.out.print("X");
            }
            System.out.println();
        }

         */
        /* le contour d'un carré
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();

        for (int l = 0; l < h; l++) {

            for (int c = 0; c < h; c++) {
                if(l==0 || c == 0 || l==h-1 || c==h-1){
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

         */
        /*
        //c)les diagonal d'un carré
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();

        for (int l = 0; l < h; l++) {

            for (int c = 0; c < h; c++) {
                if(l==c || c==(h-1-l)){
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        */
        /*
        //d)un carrée sans les diagonales
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();

        for (int l = 0; l < h; l++) {

            for (int c = 0; c < h; c++) {
                if (l == c || c == (h - 1 - l)) {
                    System.out.print(" ");
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();

        }
        */
        /*
        //e)un triangle
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();

        for (int l = 0; l < h; l++) {

            for (int c = 0; c < h; c++) {
                if (c<=l) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        */
        //h)un triangle
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();

        for (int l = 0; l < h; l++) {

            for (int c = 0; c < h; c++) {
                if (c>=l) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }
}
