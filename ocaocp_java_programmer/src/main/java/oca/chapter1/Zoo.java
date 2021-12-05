package oca.chapter1;

import java.util.*;
import java.util.Random;

class Animal {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int numberVision(int month) {
        return 0;
    }
}
class Animal2 {   // at most one of the classes in the fi le is allowed to be public.
}

public class Zoo {
    String s1, s2;
    String s3 = "yes", s4 = "no";
    int numberEggs;
    int numEggs = 0;
    String name1;
    private String name2 = "Fuzzy";
    {
        System.out.println("setting field");
    }
    public Zoo() {
        name1 = "Duke";
        System.out.println("in constructor");
    }

    public static void main(String[] args) {      // Can String[] args, String args[], String... args
        System.out.println(args[0]);
        System.out.println(args[1]);
        Random r = new Random();
        System.out.println(r.nextInt(10));

        Zoo mother = new Zoo();
        mother.numberEggs = 1;
        System.out.println(mother.numberEggs);

        String first = "Teodor";
        String last = "Rusveld";
        String full = first + last;

        System.out.println(56); // 56   десятичная
        System.out.println(0b11); // 3   двоичная
        System.out.println(017); // 15  восьмиричная
        System.out.println(0x1F); // 31  шестнадцатеричная

        //double notAtStart = _1000.00; // DOES NOT COMPILE
        //double notAtEnd = 1000.00_; // DOES NOT COMPILE
       // double notByDecimal = 1000_.00; // DOES NOT COMPILE
        System.out.println(2_000_222);
    }
}
  //Comments

/*Comments
        Comments
        Comments*/
/**
 /**
 * Javadoc multiple-line comment
 * @author Jeanne and Scott
 */