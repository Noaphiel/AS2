class Kunde {

    private String name;
    private int nummer;

    public Kunde(String name, int num) {
        this.name = name;
        this.nummer = num;
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

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

}