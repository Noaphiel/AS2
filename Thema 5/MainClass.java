import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {

        ArrayList<Leser> a = new ArrayList<Leser>();
        a.add(new Leser("ich"));
        a.add(new Leser("du"));

        ArrayList<Buch> b = new ArrayList<Buch>();
        b.add(new Buch("Kafka", "Moep"));

    }
}