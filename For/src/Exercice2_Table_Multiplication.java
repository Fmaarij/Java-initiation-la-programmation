import java.util.Scanner;

public class Exercice2_Table_Multiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez entre le nombre dont vous voulez voir le table de mutliplcation jusq'au * 10 :");
        int tableDe = scan.nextInt();
        int sommeDeMultiplication = 0;
        for (int i = 1; i <= 10; i++) {
            sommeDeMultiplication = i * tableDe;
            System.out.println(i + " * " + tableDe + " = " + sommeDeMultiplication);
        }
    }
}
