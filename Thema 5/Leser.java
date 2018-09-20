public class Leser {

    private String name;
    private Ausweis leserausweis;

    public Leser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Ausweis getLeserausweis() {
        return leserausweis;
    }

    public void erstelleAusweis() {
        leserausweis = new Ausweis();
    }
}
