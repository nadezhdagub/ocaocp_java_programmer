package oca.chapter4;

class Koala {
    public static int count = 0; // static variable
    public static void main(String[] args) { // static method
        System.out.println(count);
    }
}

public class Main {

    private static int one;
    private static final int two;
    private static final int three = 3;
    //private static final int four; // DOES NOT COMPILE

    static {
        one = 1;
        two = 2;
        //three = 3; // DOES NOT COMPILE
       // two = 4; // DOES NOT COMPILE
        }

    public void walk1() {}
    //default void walk2() {} // DOES NOT COMPILE
    //void public walk3() {} // DOES NOT COMPILE
    void walk4() {}

    public void walk1(int... nums) { }
    public void walk2(int start, int... nums) { }
    //public void walk3(int... nums, int start) { } // DOES NOT COMPILE
   // public void walk4(int... start, int... nums) { } // DOES NOT COMPILE

    private static int count;
    public Main() { count++; }

    public static void main(String[] args) {
        Koala.main(new String[0]);

        Main c1 = new Main();
        Main c2 = new Main();
        Main c3 = new Main();
        System.out.println(count); // 3

        StringBuilder name = new StringBuilder();
        speak(name);
        System.out.println(name); // Webby
    }

    public static void speak(StringBuilder s) {
        s.append("Webby");
    }
}
