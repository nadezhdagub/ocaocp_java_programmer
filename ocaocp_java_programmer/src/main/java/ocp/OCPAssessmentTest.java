package ocp;

import java.util.Set;
import java.util.TreeSet;

class Dog { int size; Dog(int s) { size = s; } }
public class OCPAssessmentTest {
    public static void main(String[] args) {
        TreeSet<Integer> i = new TreeSet<Integer>();
        TreeSet<Dog> d = new TreeSet<Dog>();

        d.add(new Dog(1));
        d.add(new Dog(2));
        d.add(new Dog(1));
        //d.add(new Dog(1));
        i.add(1);
        i.add(2);
        i.add(1);
        System.out.println(d.size() + " " + i.size());

        Set<String> set = new TreeSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("one");
        for (String str : set) {
            System.out.print(str + " ");
        }
        
    }
}
