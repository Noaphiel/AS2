import java.util.ArrayList;
import java.util.Scanner;

public class MainBestellung {

    public static void main(String[] args) {

        ArrayList<Kunde> kunden = new ArrayList<Kunde>();
        ArrayList<Artikel> artikelL = new ArrayList<Artikel>();
        ArrayList<Bestellung> bestellungen = new ArrayList<Bestellung>();

        kunden.add(new Kunde("Paddinson", 1));
        kunden.add(new Kunde("Pädda", 2));
        kunden.add(new Kunde("Lisa", 3));
        kunden.add(new Kunde("Chris", 4));

        System.out.println("Kunden: ");
        for (Kunde x : kunden) {
            System.out.println(x.getName());
        }

        artikelL.add(new Artikel("Besen", 12.99, 123));
        artikelL.add(new Artikel("Abgetretene Stiefel", 48.84, 456));
        artikelL.add(new Artikel("Schuhsohle", 9.99, 678));

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
        String wunschartikel = sc.nextLine();

        System.out.println("Wie viele davon?");
        Artikel art = new Artikel(wunschartikel, 0.0, 0);
        boolean found = false;
        for (Artikel a : artikelL)
            if (a.getBezeichnung().equals(wunschartikel)) {
                art = a;
                found = true;
                break;
            }

        if (!found) {
            System.out.println("Sorry, Artikel nicht gefunden");
        }
        int anz = sc.nextInt();

        bestellungen.add(new Bestellung(kunden.get(0)));
        bestellungen.get(0).hinzufuegenPosition(new Bestellposition(art, anz));

        Bestellung x = bestellungen.get(0);
        System.out.println("Bestellung vom Kunden " + x.getKunde().getName() + " wurde am " + x.getDatum().toString()
                + " aufgegeben, enthält folgende Positionen:");
        for (Bestellposition bp : x.getPositionen()) {
            System.out.println(String.valueOf(bp.getAnzahl()) + " x " + bp.getPosition().getBezeichnung());
        }

    }
}
