public class StaticDemo {
    public static int ch;

    public static int stat1(int a) {
        ch = a;
        return ch;
    }

    static {
        System.out.println(stat1(3));
    }
}
