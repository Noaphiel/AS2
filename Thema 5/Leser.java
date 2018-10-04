import java.util.ArrayList;

public class Leser {

    private String name;
    private Ausweis leserausweis;
    private ArrayList<Buchexemplar> ausgeliehen;

    public Leser(String name) {
        ausgeliehen = new ArrayList<Buchexemplar>();
        this.name = name;
        erstelleAusweis();
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

    public ArrayList<Buchexemplar> getAusgeliehen() {
        return ausgeliehen;
    }
}
