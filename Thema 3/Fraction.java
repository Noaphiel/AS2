public class Fraction { // Bruch

    private int nomi, denomi; // Zähler, Nenner

    public Fraction(int nomi, int denomi) {

        this.nomi = nomi;
        if (denomi == 0) { // 0 für Nenner verboten, Bruch auf 0 setzen.
            this.denomi = 1;
            this.nomi = 0;
        } else {
            this.denomi = denomi;
        }

    }

    public int getNominator() {
        return nomi;
    }

    public int getDenominator() {
        return denomi;
    }

    public Fraction add(Fraction frac) {
        Fraction tmp = new Fraction(this.nomi * frac.denomi + frac.nomi * this.denomi, this.denomi * frac.denomi);
        return tmp.shorten();
    }

    public Fraction sub(Fraction frac) {
        Fraction tmp = new Fraction(this.nomi * frac.denomi - frac.nomi * this.denomi, this.denomi * frac.denomi);
        return tmp.shorten();
    }

    public Fraction mul(Fraction frac) {
        Fraction tmp = new Fraction(this.nomi * frac.nomi, this.denomi * frac.denomi);
        return tmp.shorten();
    }

    public Fraction div(Fraction frac) {
        Fraction tmp = new Fraction(this.nomi * frac.denomi, this.denomi * frac.nomi);
        return tmp.shorten();
    }

    private Fraction shorten() {
        int n1 = this.nomi;
        int n2 = this.denomi;
        while (n2 != 0) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        return new Fraction(this.nomi / n1, this.denomi / n1);
    }

    @Override
    public String toString() {
        return Integer.toString(this.nomi) + "/" + Integer.toString(this.denomi);
    }
}