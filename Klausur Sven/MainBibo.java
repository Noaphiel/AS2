import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main-Klasse, in der die Buchausleihe simuliert wird.
 *
 * @author Sven Grothe
 *
 */
public class MainBibo {

    public static void main(String[] args) {

        ArrayList<Nutzer> nutzerListe = new ArrayList<Nutzer>();
        ArrayList<Buch1> buchListe = new ArrayList<Buch1>();

        Nutzer n = new Nutzer(); // Nutzer-Nummern starten bei 1
        n.setName("Horst Seehofer");

        Buch1 b = new Buch1(); // Buch-Nummern starten bei 1
        b.setAutor("J.R.R. Tolkien");
        b.setTitel("Der Herr der Ringe");
        b.setLeihdauer(2);

        nutzerListe.add(n);
        buchListe.add(b);

        Scanner sc = new Scanner(System.in);
        System.out.print("Geben Sie die Nutzernummer ein: ");
        int nutzerNummer = sc.nextInt();
        System.out.print("Geben Sie die Buchnummer ein: ");
        int buchNummer = sc.nextInt();

        int j = -1;
        for (int i = 0; i < nutzerListe.size(); i++) {
            if (nutzerListe.get(i).getNummer() == nutzerNummer) {
                j = i;
            }
        }

        if (j == -1) {
            System.err.println("Kein Nutzer mit ID " + nutzerNummer + " gefunden");
        }

        int k = -1;
        for (int l = 0; l < buchListe.size(); l++) {
            if (buchListe.get(l).getNummer() == buchNummer) {
                k = l;
            }
        }

        if (k == -1) {
            System.err.println("Kein Buch mit ID " + buchNummer + " gefunden");
        }

        if (j != -1 && k != -1) {
            buchListe.get(k).ausleihen(nutzerListe.get(j));
            System.out.println("Folgendes Buch wurde ausgeliehen: " + buchListe.get(k).getAutor() + " "
                    + buchListe.get(k).getTitel());
            System.out.println("Ausleihender Nutzer: " + nutzerListe.get(j).getName());
            System.out.println("Rueckgabedatum: " + buchListe.get(k).getRueckgabeDatum());
        }
    }

}
