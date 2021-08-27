import java.lang.*;

public class Oppgaver {
    /*Oppgave 1.1.10*/

    public static int kostnader(int[] a)  // legges i class Program
    {
        int m = 0;
        for (int i = 1; i < a.length; i++) {}  // en tom blokk
        return m;
    }

public static void main (String[] args){

    // main-metoden i class Program skal nå inneholde:
    int n = 200_000, antall = 3_000; // tabellstørrelse og gjentagelser
    long tid = 0;                    // for tidsmåling
    int a[] = randPerm(n);           // en permutasjon av 1, . .  n

    tid = System.currentTimeMillis();    // leser av klokken
  for (int i = 0; i < antall; i++) kostnader(a);
    tid = java.lang.System.currentTimeMillis() - tid;    // medgått tid
  System.out.println("Faste kostnader: " + tid + " millisek");

    tid = System.currentTimeMillis();    // leser av klokken
  for (int i = 0; i < antall; i++) maks1(a);  // Programkode 1.1.2
    tid = System.currentTimeMillis() - tid;     // medgått tid
  System.out.println("Maks1-metoden: " + tid + " millisek");

    tid = System.currentTimeMillis();    // leser av klokken
  for (int i = 0; i < antall; i++) maks2(a);  // Programkode 1.1.4
    tid = System.currentTimeMillis() - tid;     // medgått tid
  System.out.println("Maks2-metoden: " + tid + " millisek");

    tid = System.currentTimeMillis();    // leser av klokken
  for (int i = 0; i < antall; i++) maks3(a);  // Programkode 1.1.5
    tid = System.currentTimeMillis() - tid;     // medgått tid
  System.out.println("Maks3-metoden: " + tid + " millisek");
}

}

