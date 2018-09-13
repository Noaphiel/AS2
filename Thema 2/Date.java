/**
 * The code is documentation enough.
 *
 * @author Sven Grothe
 */
public class Date {

    private int day, month, year;

    /**
     * Default constructor
     */
    public Date() {

    }

    /**
     * Constructor with following parameters:
     *
     * @param day
     * @param month
     * @param year
     */
    public Date(int day, int month, int year) {
        this.setYear(year);
        this.setMonth(month);
        this.setDay(day);
    }

    /**
     * multiple get- and set-methods
     *
     * @return
     */
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        switch (this.getMonth()) {
        case 0:
            this.day = 0;
        case 2:
            if (day >= 1 && day <= 28)
                this.day = day;
            else
                this.day = 0;
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            if (day >= 1 && day <= 30)
                this.day = day;
            else
                this.day = 0;
            break;
        default:
            if (day >= 1 && day <= 31)
                this.day = day;
            else
                this.day = 0;
            break;
        }
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12)
            this.month = month;
        else
            this.month = 0;
    }

    public void setYear(int year) {
        this.year = year;
    }

    /**
     * method, that checks for validity of a date
     *
     * @return validity as boolean
     */
    public boolean valid() {
        if (this.getDay() == 0 || this.getMonth() == 0)
            return false;
        return true;
    }

    /**
     * method that calculates the next day.
     *
     * @return next day as Date. Returns null if input is invalid
     */
    public Date nextDay() {
        if (this.valid()) {
            Date nextDay = new Date(this.getDay() + 1, this.getMonth(), this.getYear());
            if (nextDay.getDay() == 0) {
                nextDay.setDay(1);
                nextDay.setMonth(nextDay.getMonth() + 1);
            }
            if (nextDay.getMonth() == 0) {
                nextDay.setYear(nextDay.getYear() + 1);
                nextDay.setMonth(1);
            }
            return nextDay;
        } else {
            System.err.println("Exception in Date.nextDay(): invalid input date!");
            return new Date(0, 0, 0);
        }
    }

    /**
     * main method
     *
     * @param args
     */
    public static void main(String[] args) {

        Date heute = new Date(31, 12, 1987);

        Date morgen = heute.nextDay();

        System.out.println(morgen.getDay());
        System.out.println(morgen.getMonth());
        System.out.println(morgen.getYear());
    }
}