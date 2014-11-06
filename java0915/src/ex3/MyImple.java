package ex3;

public class MyImple implements MyInter1_2 {

    private static boolean getData;
    private static boolean getA;
    private static boolean getb;

    @Override
    public int getData() {
        return 100;
    }

    @Override
    public int getA() {
        return 200;
    }

    @Override
    public int getB() {
        return 300;
    }

    public static void main(String[] args) {
        System.out.println(getData);
        System.out.println(getA);
        System.out.println(getb);
    }
}
