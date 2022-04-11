package ocp.chapter3;

import java.util.*;

public class Main {
  //  Elephant elephant = new Elephant();
  //  Crate<Elephant> crateForElephant = new Crate<>();
 //   crateForElephant.packCrate(elephant);
  //  Elephant inNewHome = crateForElephant.emptyCrate()

    public static void printList(List<Object> list) {
        for (Object x: list) System.out.println(x);
    }
    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
       // printList(keywords); // DOES NOT COMPILE

        List<String> listt = new ArrayList<>();
        System.out.println(listt.add("Sparrow"));
        System.out.println(listt.add("Sparrow"));
        System.out.println(listt.remove("Sparrowr"));
        System.out.println(listt.contains("hawk"));

        Set<String> set = new HashSet<>();
        System.out.println(set.add("Sparrow"));
        System.out.println(set.add("Sparrow"));   //output false
        System.out.println(set.remove("Sparrow"));
        System.out.println(set.contains("hawk"));
        Set<Integer> sett = new TreeSet<>();
        boolean b1 = sett.add(66); // true
        boolean b2 = sett.add(10); // true
        boolean b3 = sett.add(66); // false
        boolean b4 = sett.add(8); // true
        for (Integer integer: sett) System.out.print(integer + ","); // 8,10,66

        Queue<String> queue = new ArrayDeque<>();
        System.out.println(queue.add("Sparrow"));
        System.out.println(queue.add("Sparrow"));
        System.out.println(queue.remove("Sparrow"));
        System.out.println(queue.contains("hawk"));
        System.out.println(queue.offer("dfdfdf")); // true
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());

        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        String food = map.get("koala"); // bamboo
        for (String key : map.keySet()) {
            System.out.println(key + ", ");
        }
    }

}

class Clare<T> {
    private T contents;
    public  T emptyClare() {
        return contents;
    }

   // public static <T> Crate<T> ship(T t) {
     //   System.out.println("Preparing " + t);
    //    return new Crate<T>();
   // }
}

class SizeLimitedCrate<T, U> {
    private T contents;
    private U sizeLimit;
    public SizeLimitedCrate(T contents, U sizeLimit) {
        this.contents = contents;
        this.sizeLimit = sizeLimit;
    } }

class Crate {
    private Object contents;
    public Object emptyCrate() {
        return contents;
    }
    public void packCrate(Object contents) {
        this.contents = contents;
    }
}

interface Shippable<T> {
    void ship(T t);
}


//class ShippableRobotCrate implements Shippable<Robot> {
//    public void ship(Robot t) { }
//}

class Duck implements Comparable<Duck> {
    private String name;
    public Duck(String name) {
        this.name = name;
    }
    public String toString() { // use readable output
        return name;
    }
    public int compareTo(Duck d) {
        return name.compareTo(d.name); // call String's compareTo
    }
    public static void main(String[] args) {
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quack"));
        ducks.add(new Duck("Puddles"));
        Collections.sort(ducks); // sort by name
        System.out.println(ducks); // [Puddles, Quack]
    } }
