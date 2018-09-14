import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TimeTest {

    @Test
    public void initEmpty() {
        Time zeit = new Time();
        assertThat(zeit.toString(), is(equalTo("00:00:00")));
    }

    @Test
    public void initFull() {
        Time zeit = new Time(23, 12, 1);
        assertThat(zeit.toString(), is(equalTo("23:12:01")));
    }

    @Test
    public void getH() {
        Time zeit = new Time();
        assertThat(zeit.getHour(), is(equalTo(0)));
    }

    @Test
    public void getM() {
        Time zeit = new Time();
        assertThat(zeit.getMinute(), is(equalTo(0)));
    }

    @Test
    public void getS() {
        Time zeit = new Time();
        assertThat(zeit.getSecond(), is(equalTo(0)));
    }

    @Test
    public void setzeH() {
        Time zeit = new Time();
        zeit.setHour(5);
        assertThat(zeit.getHour(), is(equalTo(5)));
    }

    @Test
    public void setzeM() {
        Time zeit = new Time();
        zeit.setMinute(5);
        assertThat(zeit.getMinute(), is(equalTo(5)));
    }

    @Test
    public void setzeS() {
        Time zeit = new Time();
        zeit.setSecond(5);
        assertThat(zeit.getSecond(), is(equalTo(5)));
    }

    @Theory
    public void SetzeHnotValid(@TestedOn(ints = { -1, 24, 25 }) int input) {
        Time zeit = new Time();
        zeit.setHour(input);
        assertThat(zeit.getHour(), is(equalTo(-1)));
    }

    @Theory
    public void SetzeMnotValid(@TestedOn(ints = { -1, 60, 61 }) int input) {
        Time zeit = new Time();
        zeit.setMinute(input);
        assertThat(zeit.getMinute(), is(equalTo(-1)));
    }

    @Theory
    public void SetzeSnotValid(@TestedOn(ints = { -1, 60, 61 }) int input) {
        Time zeit = new Time();
        zeit.setSecond(input);
        assertThat(zeit.getSecond(), is(equalTo(-1)));
    }

    @Test
    public void ToString() {
        Time zeit = new Time(1, 1, 1);
        assertThat(zeit.toString(), is(equalTo("01:01:01")));
    }

    @Theory
    public void ValidString(@TestedOn(ints = { -1, 24, 60 }) int input) {
        Time zeit = new Time(input, 0, 0);
        assertThat(zeit.toString(), is(equalTo("-1")));
    }

    @Theory
    public void ValidSingleTrue(@TestedOn(ints = { 0, 5, 23 }) int stunden) {
        Time zeit = new Time(stunden, 0, 0);
        assertThat(zeit.isValid(), is(true));
    }

    @Theory
    public void ValidSingleFalse(@TestedOn(ints = { -1, 24, 60 }) int stunden) {
        Time zeit = new Time(stunden, 0, 0);
        assertThat(zeit.isValid(), is(false));
    }

    @Test
    public void duration() {
        Time testzeit1 = new Time(1, 1, 1);
        Time testzeit2 = new Time(2, 2, 2);

        Time differenz = testzeit2.duration(testzeit1);
        assertThat(differenz.toString(), is(equalTo("01:01:01")));
    }

    @Test
    public void tickSekunde() {
        Time zeit = new Time(1, 1, 1);
        zeit.tick();
        assertThat(zeit.toString(), is(equalTo("01:01:02")));
    }

    @Test
    public void tickMinute() {
        Time zeit = new Time(1, 1, 59);
        zeit.tick();
        assertThat(zeit.toString(), is(equalTo("01:02:00")));
    }

    @Test
    public void tickStunde() {
        Time zeit = new Time(1, 59, 59);
        zeit.tick();
        assertThat(zeit.toString(), is(equalTo("02:00:00")));
    }

    @Test
    public void tickTag() {
        Time zeit = new Time(23, 59, 59);
        zeit.tick();
        assertThat(zeit.toString(), is(equalTo("00:00:00")));
    }
}