import seqint.SeqInt;
import seqint.SeqIntIterator;


public class LongeurEtPositionDeLaSequence {

    //Fonction qui calcule le longuer d'une séquence
    public static int longuer(SeqInt s) {
        SeqIntIterator it = s.iterator();
        int lg = 0;
        while (it.hasNext()) {
            it.next();
            lg++;
        }
        return lg;
    }

    //Fonction qui calcule le position d'une séquence
    public static int position(SeqInt s, int val) {
        SeqIntIterator it = s.iterator();
        int pos = 0;

        while (it.hasNext()) {
            if (val == it.next()) {

                return pos;
            }
            pos++;

        }
        return pos;
    }


    public static void main(String[] args) {
        SeqInt s = new SeqInt(1, 5, 9, 7, 3, 2);
        SeqIntIterator tab = s.iterator();
        System.out.println("-------------------Longeur de la séquence-------------");
        System.out.println(longuer(s) + " ");
        System.out.println("-------------------La position-------------");
        System.out.println(position(s, 2) + " ");

    }
}
