class Kunde implements Comparable<Kunde> {

    // Anfang Attribute
    private String name;
    private static int letzteNummer = 0;
    private int nummer;
    // Ende Attribute

    public Kunde(String name) {
        this.name = name;
        incrementLetzteNummer();
        nummer = Kunde.getLetzteNummer();
    }

    // Anfang Methoden
    public String getName() {
        return name;
    }

    public void setName(String nameNeu) {
        name = nameNeu;
    }

    public int getNummer() {
        return nummer;
    }

    public static int getLetzteNummer() {
        return letzteNummer;
    }

    public static void incrementLetzteNummer() {
        letzteNummer++;
    }

    @Override
    public int compareTo(Kunde b) {
        return this.getName().compareTo(b.getName());
    }

    @Override
    public String toString() {
        return this.getName();
    }
}