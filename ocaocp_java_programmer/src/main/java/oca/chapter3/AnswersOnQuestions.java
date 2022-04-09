package oca.chapter3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AnswersOnQuestions {
    public static void main(String[] args) {
        //1
        int numFish = 4;
        String fishType = "tuna";
        //String anotherFish = numFish + 1;        //not compile
        //System.out.println(anotherFish + " " + fishType);
        System.out.println(numFish + " " + 1);

        //2
        String s = "Hello";
        String t = new String(s);
        if ("Hello".equals(s)) System.out.println("one");        //+
        if (t == s) System.out.println("two");
        if (t.equals(s)) System.out.println("three");            //+
        if ("Hello" == s) System.out.println("four");            //+
        if ("Hello" == t) System.out.println("five");

        //3
//        A. An immutable object can be modified.
//        B. An immutable object cannot be modified.     //+
//        C. An immutable object can be garbage collected.  //+
//        D. An immutable object cannot be garbage collected.
//        E. String is immutable.                           //+
//        F. StringBuffer is immutable.
//        G. StringBuilder is immutable

        //4
        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb);        //abbaccca

        //5
        String s1 = "java";
        StringBuilder s2 = new StringBuilder("java");
       // if (s1 == s2)         //Strinh == StringBuilser - exception
            System.out.print("1");
        if (s1.equals(s2))
            System.out.print("2");

        //10
        String a = "";
        a += 2;
        System.out.println(a);
        a += 'c';
        System.out.println(a);
        a += false;
        System.out.println(a);
        if ( a == "2cfalse") System.out.println("==");
        if ( a.equals("2cfalse")) System.out.println("equals");          //true

        //12
        StringBuilder numbers = new StringBuilder("0123456789");
        numbers.delete(2, 8);
        numbers.append("-").insert(2, "+");
        System.out.println(numbers);   // 01+89–

        //15
//        A. int[][] scores = new int[5][];
//        B. Object[][][] cubbies = new Object[3][0][5];
//        C. String beans[] = new beans[6];              //-
//        D. java.util.Date[] dates[] = new java.util.Date[2][];
//        E. int[][] types = new int[];        //-
//        F. int[][] java = new int[][];        //-

        //25
        List<String> hex = Arrays.asList("30", "8", "3A", "FF");
        Collections.sort(hex);
        int x = Collections.binarySearch(hex, "8");
        int y = Collections.binarySearch(hex, "3A");
        int z = Collections.binarySearch(hex, "4F");
        System.out.println(x + " " + y + " " + z);        //2 1 –3

    }
}
