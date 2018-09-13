/**
 * The code is documentation enough.
 *
 * @author Sven Grothe
 */
public class Addresse {

    private String street, zip, city;

    public Addresse() {

    }

    public Addresse(String street, String zip, String city) {
        this.street = street;
        this.zip = zip;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZip(String zip) {
        if (zip.length() == 5)
            this.zip = null;
        else
            this.zip = zip;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static void main(String[] args) {
        Addresse meineAddresse = new Addresse("Höhndorfstraße 9", "12101", "Berlin");

        System.out.println(meineAddresse.getStreet());
        System.out.println(meineAddresse.getZip());
        System.out.println(meineAddresse.getCity());
    }
}
