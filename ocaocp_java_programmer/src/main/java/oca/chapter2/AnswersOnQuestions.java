package oca.chapter2;

public class AnswersOnQuestions {

    //1
//    A. ==             +
//    B. +
//    C. --
//    D. !              +
//    E. %
//    F. <=

    //2
    byte x1 = 5;
    byte y1 = 10;
//    _____ z = x1 + y1;
//    A. int                +
//    B. long               +
//    C. boolean
//    D. double             +
//    E. short
//    F. byte

    public static void main(String[] args) {
        //3
//        int x = 0;
//        while(x++ < 10) {}
//        String message = x > 10 ? "Greater than" : false;       //not compile
//        System.out.println(message+","+x);


        //5
        java.util.List<Integer> list = new java.util.ArrayList<Integer>();
        list.add(10);
        list.add(14);
        for(int xx : list) {
            System.out.print(xx + ", ");               //10,
            break;
            }

        //6
        int x = 4;
        long y = x * 4 - x++;
        if(y<10) System.out.println("Too Low");
        else System.out.println("Just right");
        //else System.out.println("Too High");           //not compile

        //7
        int x2 = 5;
        System.out.println(x2 > 2 ? x2 < 4 ? 10 : 8 : 7);      //output 8

        //8
        boolean x3 = true, z3 = true;
        int y3 = 20;
        x3 = (y3 != 10) ^ (z3=false);
        System.out.println(x3+", "+y3+", "+z3);       // true, 20, false

        //9
        for(int i=0; i<10 ; ) {          //he code contains an infinite loop and does not terminate.
            i = i++;
            System.out.println("Hello World");
            }

        //13
        int x5 = 50, x6 = 75;
        boolean b = x5 >= x6;
        if(b = true) System.out.println("Success");            //+
        else System.out.println("Failure");

        int c = 7;
        int result = 4;
        result += ++c;
        System.out.println(result);        //12

        
    }
}