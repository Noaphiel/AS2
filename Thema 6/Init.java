import java.util.ArrayList;
import java.util.Collections;

public class Init {

    public static void main(String[] args) {

        ArrayList<Kunde> list = new ArrayList<Kunde>();

        list.add(new Kunde("Paddinson"));
        list.add(new Kunde("Pädda"));
        list.add(new Kunde("Lisa"));
        list.add(new Kunde("Chris"));

        System.out.println("Vor Sortierung: ");

        for (Kunde x : list) {
            System.out.println(x.getName());
        }

        Collections.sort(list);

        System.out.println("\nNach Sortierung:");

        for (Kunde x : list) {
            System.out.println(x.getName());
        }

        ArrayList<Konto> konten = new ArrayList<Konto>();

        konten.add(new Girokonto("DE2359", list.get(1)));
        konten.add(new Sparkonto("DE1543", list.get(0)));

        for (Konto x : konten) {
            System.out.println("Konto mit Nummer: " + x.getIban() + " gehört dem Kunden " + x.getInhaber());
        }

        System.out.println("");
        ArrayList<Artikel> bestand = new ArrayList<Artikel>();

        bestand.add(new Artikel("Besen", 12.99));
        bestand.add(new Lebensmittel("Krautsalat", 2.49));

        for (Artikel a : bestand) {
            System.out.println(a.getBezeichnung() + " wird verkauft für " + a.getPreis() + " und hat Artikelnummer "
                    + a.getArtikelnummer());
        }
    }
}
