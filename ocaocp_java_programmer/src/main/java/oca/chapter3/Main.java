package oca.chapter3;

import java.sql.Array;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

class Mutable {
    private String s;
    public void setS(String newS){ s = newS; } // Setter makes it mutable
    public String getS() { return s; }
}
final class Immutable {
    private String s = "name";
    public String getS() { return s; }
}

public class Main {
    String nname = "Fluffy";
    //String nname = new String("Fluffy"); //so so can use
    public static void main(String[] args) {

        String animals = "Animals";
        System.out.println(animals.length()); //length - 7
        System.out.println(animals.charAt(2)); // on the index 2 is i (0, 1, 2...)
        System.out.println(animals.indexOf("a"));    //4
        System.out.println(animals.indexOf("al"));
        System.out.println(animals.indexOf('a', 3));    //4
        System.out.println(animals.indexOf('a', 3));    //4
        System.out.println(animals.indexOf("al", 5));   //-1
        System.out.println(animals.substring(0));      //A
        System.out.println(animals.substring(0, 4));   //Anim
        System.out.println(animals.toLowerCase());
        System.out.println(animals.toUpperCase());
        System.out.println("ABC".equals("ABC"));  //true
        System.out.println("ABC".equals("abc"));  //false
        System.out.println("ABC".equalsIgnoreCase("abc"));  //true
        System.out.println("abc".startsWith("a"));
        System.out.println("abs".contains("b"));
        System.out.println("abc".replace('a', 'A'));  //Abc
        String lowerString = animals.toLowerCase();

        StringBuilder alpha = new StringBuilder();
        for(char current = 'a'; current <= 'z'; current++)
            alpha.append(current);
        System.out.println(alpha);

        Main t1 = new Main();
        Main t2 = new Main();
        Main t3 = t1;
        System.out.println(t1 == t1); // true
        System.out.println(t1 == t2); // false
        System.out.println(t1.equals(t2)); // false

        int[] array = new int[3];
        int[] arr = new int[] {1, 2, 3};
        int[] ar = {12, 13, 14};
        int [] a;
        int arra[];
        int ark [];
        int c[], b;

        String [] bugs = { "cricket", "beetle", "ladybug" };
        String [] alias = bugs;
        System.out.println(bugs.equals(alias)); // true
        System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0

        String[] strings = { "stringValue" };
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        //againStrings[0] = new StringBuilder(); // НЕ КОМПИЛИРУЕТСЯ
        objects[0] = new StringBuilder(); // осторожно!

        int[] number = {10, 9, 48};
        Arrays.sort(number);
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i] + " ");
        }

        int[] numbers = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numbers, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers, 1)); // -1
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2
        System.out.println(Arrays.binarySearch(numbers, 9)); // -5

        ArrayList list = new ArrayList<>();
        list.add("hawk");
        list.add(true);
        System.out.println(list);

        ArrayList<String> list2;

        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("123");

        LocalTime time1 = LocalTime.of(6, 15); // час и минута
    }
}
