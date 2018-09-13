
public class Testclass {
    public static void main(String[] args) {
        Time t1 = new Time(12, 17, 53);
        Time t2 = new Time(23, 59, 59);
        Time t3 = new Time(37, 0, 0);
        System.out.println(t3.isValid());
        System.out.println(t1.duration(t2));
        t2.tick();
        System.out.println(t2.toString());
    }
}
