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

    }
}
