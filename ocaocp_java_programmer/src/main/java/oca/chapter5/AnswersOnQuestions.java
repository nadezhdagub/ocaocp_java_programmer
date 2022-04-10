package oca.chapter5;

public class AnswersOnQuestions {
    public static void main(String[] args) {
        //5
      //  Which of the following may only be hidden and not overridden
//        A. private instance methods        +
//        B. protected instance methods
//        C. public instance methods
//        D. static methods          +
//        E. public variables          +
//        F. private variables         +

        //7
//        Which of the following statements about polymorphism are true? (Choose all that apply)
//        A. A reference to an object may be cast to a subclass of the object without an explicit cast.
//        B. If a method takes a superclass of three objects, then any of those classes may be passed      +
//            as a parameter to the method.
//        C. A method that takes a parameter with type java.lang.Object will take any reference.            +
//        D. All cast exceptions can be detected at compile-time.
//        E. By defining a public instance method in the superclass, you guarantee that the specific
//           method will be called in the parent class at runtime

        //10
//        Which statements are true for both abstract classes and interfaces? (Choose all that apply)
//        A. All methods within them are assumed to be abstract.
//        B. Both can contain public static final variables.            +
//        C. Both can be extended using the extend keyword.           +
//        D. Both can contain default methods.
//        E. Both can contain static methods.            +
//        F. Neither can be instantiated directly.        +
//        G. Both inherit java.lang.Object.

        //11
//        What modifiers are assumed for all interface variables? (Choose all that apply)
//        A. public      +
//        B. protected
//        C. private
//        D. static       +
//        E. final     +
//        F. abstract
    }
}
//2
class Mammal {
    public Mammal(int age) {
         System.out.print("Mammal");
         }
 }
//class Platypus extends Mammal {
//public Platypus() {             //where arguments? like in constructor mamal
    //    System.out.print("Platypus");
    //    }
//public static void main(String[] args) {
 //       new Mammal(5);
 //       }
//}

//3
//public interface CanHop {}
//public class Frog implements CanHop {
//    public static void main(String[] args) {
//    ______ frog = new TurtleFrog();
//    }
//}
//
//public class BrazilianHornedFrog extends Frog {}
//public class TurtleFrog extends Frog {}

//A. Frog             +
//B. TurtleFrog         +
//C. BrazilianHornedFrog
//D. CanHop           +
//E. Object         +
//F. Long

//6
//interface HasExoskeleton {
//abstract int getNumberOfSections();
//}
//abstract class Insect implements HasExoskeleton {
// abstract int getNumberOfLegs();
//}
// public class Beetle extends Insect {          //error
//int getNumberOfLegs() { return 6; }
//}

//9
//public interface CanFly {          //not have errors
//void fly();
//}
//interface HasWings {
// public abstract Object getWindSpan();
//}
//abstract class Falcon implements CanFly, HasWings {
//}