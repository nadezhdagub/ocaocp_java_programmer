package oca.chapter2;

public class Main {
    public static void main(String[] args) {
        System.out.print(9/3); // Выходы 3
        System.out.print(9 % 3); // Выходы 0

        System.out.print(10/3); // Выходы 3
        System.out.print(10 % 3); // Выходы 1System.out.print(11/3); // Выходы 3

        System.out.print(11 % 3); // Выходы 2System.out.print(12/3); / / Выходы 4
        System.out.print (12 % 3); // Выходы 0

        double x = 39.21;
       // float y = 2.1;       //x+y not compile, because of y without f - 2.1f

        short xx = 10;
        short yy = 3;        //xx/yy  - int

        boolean x1 = false;
        System.out.println(x1); // false
        x1 = !x1;
        System.out.println(x1); // true

        int counter = 0;
        System.out.println(counter); // Outputs 0
        System.out.println(++counter); // Outputs 1
        System.out.println(counter); // Outputs 1
        System.out.println(counter--); // Outputs 1
        System.out.println(counter); // Outputs 0

        int x2 = (int)1.0;
        short y2 = (short)1921222; // Stored as 20678

        short x3 = 10;
        short y3 = 3;
        short z3 = (short)(x3 * y3);

        int hourOfDay = 2;
        if(hourOfDay < 11) {
            System.out.println("Good Morning");
        } else if(hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }

        System.out.println((x > yy) ? 21 : "Zebra");

        int dayOfWeek = 5;
        switch(dayOfWeek) {
            default:
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }

        int count = 2;
     /*   int value = switch (count) {
            case 1 -> 12;
            case 2 -> 32;
            case 3 -> 52;
            default -> 0;
        };*/

        while(x < 10)
            yy++;

        do {
            x++;
        } while(false);
        System.out.println(x); // Outputs 1

        for(int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        int x4 = 0;
        for(long y = 0, z = 4; x4 < 5 && y < 10; x4++, y++) {
            System.out.print(y + " ");
        }
        System.out.print(x);
    }
}