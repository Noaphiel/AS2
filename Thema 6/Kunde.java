/**
 * Übung zu Interfaces
 *
 * @version 1.0 vom 02.10.2018
 * @author Sven Grothe
 */

public class Kunde implements Comparable<Kunde> {

    private String name;
    private static int letzteNummer = 0;
    private int nummer;

    public Kunde(String name) {
        this.name = name;
        this.nummer = getLetzteNummer();
        inkrementiereLetzteNummer();
    }

    public String getName() {
        return name;
    }

    public void setName(String nameNeu) {
        name = nameNeu;
    }

    public int getNummer() {
        return nummer;
    }

    private static int getLetzteNummer() {
        return letzteNummer;
    }

    private static void inkrementiereLetzteNummer() {
        letzteNummer++;
    }

    @Override
    public int compareTo(Kunde a) {
        return this.name.compareTo(a.name);
    }
}