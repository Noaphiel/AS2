import java.util.ArrayList;
import java.util.Scanner;

public class MainBestellung {

    public static void main(String[] args) {

        // ArrayListen initialisieren
        ArrayList<Kunde> kunden = new ArrayList<Kunde>();
        ArrayList<Artikel> artikelL = new ArrayList<Artikel>();
        ArrayList<Bestellung> bestellungen = new ArrayList<Bestellung>();

        // Arraylisten mit Kunden und Artikeln befüllen
        kunden.add(new Kunde("Paddinson", 1));
        kunden.add(new Kunde("Pädda", 2));
        kunden.add(new Kunde("Lisa", 3));
        kunden.add(new Kunde("Chris", 4));

        artikelL.add(new Artikel("Besen", 12.99, 123));
        artikelL.add(new Artikel("Abgetretene Stiefel", 48.84, 456));
        artikelL.add(new Artikel("Schuhsohle", 9.99, 678));

        // Ausgabe der Kunden und Artikel zur Information / als Test
        System.out.println("Kunden: ");
        for (Kunde x : kunden) {
            System.out.println(x.getName());
        }

        System.out.println("Artikel im Sortiment: ");
        for (Artikel a : artikelL) {
            System.out.println(a.getBezeichnung() + " wird verkauft für " + a.getPreis() + " und hat Artikelnummer "
                    + a.getArtikelnummer());
        }

        System.out.println();

        //
        // EINGABE
        //
        Scanner sc = new Scanner(System.in);

        System.out.println("Hallo " + kunden.get(0).getName() + ", bitte teile mir mit, was du bestellen möchtest:");
        String wunschartikel;

        // Dummy-Artikel, wird mit korrektem Artikel verlinkt
        Artikel art = null;

        while (art == null) {
            wunschartikel = sc.nextLine();

            // Möglichkeit, Programm vorzeitig zu beenden
            if (wunschartikel.equals(new String("exit")))
                return;

            // In Artikeln nach gewünschtem Artikel suchen
            for (Artikel a : artikelL)
                if (a.getBezeichnung().equals(wunschartikel)) {
                    art = a;
                    break; // aus Schleife springen
                }

            if (art == null)
                System.out.println("Sorry, Artikel nicht gefunden, bitte um neue Eingabe:");

        }

        System.out.println("Wie viele davon?");
        int anz = sc.nextInt();

        // Zu Bestell-Liste hinzufügen
        bestellungen.add(new Bestellung(kunden.get(0)));
        bestellungen.get(0).hinzufuegenPosition(art, anz);

        // Ausgabe der Bestellungen
        Bestellung x = bestellungen.get(0);
        System.out.println("Bestellung vom Kunden " + x.getKunde().getName() + " wurde am " + x.getDatum().toString()
                + " aufgegeben, enthält folgende Positionen:");
        for (Bestellposition bp : x.getPositionen()) {
            System.out.println(String.valueOf(bp.getAnzahl()) + " x " + bp.getPosition().getBezeichnung());
        }

    }
}
