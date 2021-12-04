package oca;

/*interface HasTail { int getTailLength(); } //3 qestion
abstract class Puma implements HasTail {  //3 qestion
protected int getTailLength() {return 4;} //3 qestion        //error
}
//3 qestion --------
public class Cougar extends Puma {      //error
    public static void main(String[] args) {
        Puma puma = new Puma();         //error
        System.out.println(puma.getTailLength());
        }
        public int getTailLength(int length) {return 2;}
}
//------*/


import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.function.Predicate;

// 16 question
//public interface Animal { public default String getName() { return null; } }
//interface Mammal { public default String getName() { return null; } }
//abstract class Otter implements Mammal, Animal {}

//15 question
//public interface CanSwim {}
//public class Amphibian implements CanSwim {}
//class Tadpole extends Amphibian {}

// 14 question
class Chicken {}
interface HenHouse { public java.util.List<Chicken> getChickens(); }

//8 question
class Reindeer extends OCAAssessmentTest {
    public Reindeer(int age) { System.out.print("Reindeer"); }
    public boolean hasHorns() { return true; }
}

public class OCAAssessmentTest {
    // 12 question
    private String color;
    public OCAAssessmentTest() {
        this("white");
    }
    public OCAAssessmentTest(String color) {
        color = color;
    }

    //10 question
   // public OCPAssessmentTest(String n) {
  //      name = n;
 //       }
 //   private String name;


    //8 question
  //  public OCPAssessmentTest() { System.out.print("Deer"); }
    public OCAAssessmentTest(int age) { System.out.print("DeerAge"); }
    private boolean hasHorns() { return false; }

    //6 question
    public static void addToInt(int x, int amountToAdd) { //6 question
        x = x + amountToAdd; //6 question
        } //6 question

    private static int $;   //1 qestion
    public static void main(String[] args) {
        String a_b;//1 qestion
        System.out.print($);//1 qestion
       // System.out.print(a_b);   //must be initialized   //1 qestion

        // 2 qestion         //true is printed out exactly three times
        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));

        // 4 question
        boolean keepGoing = true;
        int count = 0;
        int x = 3;
        while(count++ < 3) {
            int y = (1 + 2 * count) % 3;
            switch(y) {
                default:
                    case 0: x -= 1; break;
                case 1: x += 5;
                    }
            }
        System.out.println(x);   //6 output

        // 5 question
        System.out.print("a");
        try {
            System.out.print("b");
            throw new IllegalArgumentException();
            } catch (RuntimeException e) {
            System.out.print("c");
            } finally {
            System.out.print("d");
            }
        System.out.print("e"); ///abcde output

        //6 question
        int a = 15;
        int b = 10;
        OCAAssessmentTest.addToInt(a, b);
        System.out.println(a);   //15 output

        // 7 question
        int[] array = {6,9,8};
        List<Integer> list = new ArrayList<>();
        list.add(array[0]);
        list.add(array[2]);
        list.set(1, array[1]);
        list.remove(0);
        System.out.println(list);   // 9 output

        // 8 question
        OCAAssessmentTest deer = new Reindeer(5);
        System.out.println(","+deer.hasHorns());  // DeerReindeer,false

        // 9 question
      //  A. Checked exceptions are intended to be thrown by the JVM (and not the programmer).
      //  B. Checked exceptions are required to be caught or declared.      //yes
      //  C. Errors are intended to be thrown by the JVM (and not the programmer). //yes
     //   D. Errors are required to be caught or declared.
     //   E. Runtime exceptions are intended to be thrown by the JVM (and not the programmer).
    //    F. Runtime exceptions are required to be caught or declared

        // 10 question
//        OCPAssessmentTest one = new OCPAssessmentTest("g1");
//        OCPAssessmentTest two = new OCPAssessmentTest("g2");
//        one = two;
//        two = null;
//        one = null;
       // A. Immediately after line 9, no grasshopper objects are eligible for garbage collection.
       // B. Immediately after line 10, no grasshopper objects are eligible for garbage collection.
       // C. Immediately after line 9, only one grasshopper object is eligible for garbage collection.  //yes
      //  D. Immediately after line 10, only one grasshopper object is eligible for garbage collection.  //yes
      //  E. Immediately after line 11, only one grasshopper object is eligible for garbage collection.
      //  F. The code compiles.  //yes
        // G. The code does not compile.

        // 11 question
        int xx = 5, j = 0;
        OUTER: for(int i=0; i<3; )
            INNER: do {
            i++; xx++;
            if(x > 10) break INNER;
            xx += 4;
            j++;
            } while(j <= 2);
        System.out.println(xx);    // 20 output

        // 12 question
        OCAAssessmentTest e = new OCAAssessmentTest();
        System.out.println("Color:" + e.color);  // Color:null  output

        // 13 question
        int luck = 10;
        if((luck>10 ? luck++: --luck)<10) {
            System.out.print("Bear");
            } if(luck<10) System.out.print("Shark");    // BearShark output

        //14 question
       // HenHouse house = ______________
       // Chicken chicken = house.getChickens().get(0);
       // for(int i=0; i<house.getChickens().size();
       //        chicken = house.getChickens().get(i++)) {
        //    System.out.println("Cluck");                       // D, E, F. output
        //    }

        // 15 question
//        List<Tadpole> tadpoles = new ArrayList<Tadpole>();
//        for(Amphibian amphibian : tadpoles) {
//            ___________ tadpole = amphibian;     //A, C, E
//        }

        //16 question

        //17 question
        System.out.println(test(i -> i == 5));
        System.out.println(test((i) -> i == 5));
        System.out.println(test((i) -> {return i == 5;}));

        //18 question
        System.out.println(LocalDate.of(2015, Calendar.APRIL, 1));
        System.out.println(LocalDate.of(2015, Month.APRIL, 1));
        System.out.println(LocalDate.of(2015, 3, 1));
        System.out.println(LocalDate.of(2015, 4, 1));

        //19 question
        //Bytecode is in a file with which extension?
       // A. .bytecode
      //  B. .bytes
      //  C. .class
      //  D. .exe
      //  E. .javac
      //  F. .java

        // 20 question
        //Which of the following are checked exceptions? (Choose all that apply)
        //A. Exception
       // B. IllegalArgumentException
        //C. IOException
       // D. NullPointerException
       // E. NumberFormatException
      //  F. StackOverflowError
    }

    //17 question
    private static boolean test(Predicate<Integer> p) {
        return p.test(5);
        }
}
