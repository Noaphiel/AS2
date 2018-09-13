
public class Time {

    private int h;
    private int m;
    private int s;

    public Time() {

    }

    public Time(int h, int m, int s) {
        this.setHour(h);
        this.setMinute(m);
        this.setSecond(s);
    }

    public int getHour() {
        return this.h;
    }

    public int getMinute() {
        return this.m;
    }

    public int getSecond() {
        return this.s;
    }

    public void setHour(int h) {
        if (h >= 0 && h <= 23)
            this.h = h;
        else
            this.h = -1;
    }

    public void setMinute(int m) {
        if (m >= 0 && m <= 59)
            this.m = m;
        else
            this.m = -1;
    }

    public void setSecond(int s) {
        if (s >= 0 && s <= 59)
            this.s = s;
        else
            this.s = -1;
    }

    public boolean isValid() {
        if (this.getHour() == -1 || this.getMinute() == -1 || this.getSecond() == -1)
            return false;
        return true;
    }

    @Override
    public String toString() {
        String Time = "";
        if (!this.isValid())
            Time = "-1";
        else {
            if (this.getHour() < 10)
                Time = Time + "0";
            Time = Time + Integer.toString(this.getHour()) + ":";
            if (this.getMinute() < 10)
                Time = Time + "0";
            Time = Time + Integer.toString(this.getMinute()) + ":";
            if (this.getSecond() < 10)
                Time = Time + "0";
            Time = Time + Integer.toString(this.getSecond());
        }
        return Time;
    }

    public Time duration(Time a) {

        int t1 = this.getHour() * 3600 + this.getMinute() * 60 + this.getSecond();
        int t2 = a.getHour() * 3600 + a.getMinute() * 60 + a.getSecond();
        int difference = Math.abs(t1 - t2);

        Time diff = new Time();

        diff.setHour(difference / 3600);
        difference = difference % 3600;
        diff.setMinute(difference / 60);
        difference = difference % 60;
        diff.setSecond(difference);

        return diff;
    }

    public void tick() {
        if (this.isValid()) {
            this.setSecond(this.getSecond() + 1);
            if (this.getSecond() == -1) {
                this.setSecond(0);
                this.setMinute(this.getMinute() + 1);
            }
            if (this.getMinute() == -1) {
                this.setMinute(0);
                this.setHour(this.getHour() + 1);
            }
            if (this.getHour() == -1)
                this.setHour(0);
        }
    }
}