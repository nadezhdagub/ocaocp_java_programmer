package oca.chapter1;

public class AnswersOnQuestions {
    // 1
    //A. A$B                 +
    //B. _helloWorld         +
    //C. true
    //D. java.lang
   // E. Public              +
    //F. 1980_s

    // 2
    private String brand;
    private boolean empty;
    public static void main(String[] args) {
        AnswersOnQuestions wb = new AnswersOnQuestions();
        System.out.print("Empty = " + wb.empty);
        System.out.print(", Brand = " + wb.brand);             // Empty = false, Brand = null     output
    }

    //3
//    short numPets = 5;
//    int numGrains = 5.6;                 -
//    String name = "Scruffy";
//    numPets.length();                    -
//    numGrains.length();                  -
//    name.length();

    //4
   // public class Snake {
        String result = "done";
        public void shed(boolean time) {
            //String result = "done";
            if (time) {
                }
            System.out.println(result);
            }
   // }

    //5
  //  package aquarium;
    //public class Tank {}

   // package aquarium.jellies;
  //  public class jelly {}

  //  package visitor;
  //  public class AquariumVisitor {
  //      public static void admire(Jelly jelly) {
  //      }
 //   }



}


//6
//package aquarium;
import java.lang.*;         //-
import java.lang.System;      //-
import aquarium.Water;      //-
import aquarium.*;      //-
//public class Tank {
   // public void print(Water water) {
   //     System.out.println(water); } }




//7
/*package aquarium;
public class Water {
    boolean salty = false;
}
package aquarium.jellies;
public class Water {
    boolean salty = true;
}
package employee;
        INSERT IMPORTS HERE
public class WaterFiller {
    Water water;
}*/
//A. import aquarium.*;                       +
//B. import aquarium.Water;                   +
//   import aquarium.jellies.*;
//C. import aquarium.*;                       +
//   import aquarium.jellies.Water;
//D. import aquarium.*;
//   import aquarium.jellies.*;
//E. import aquarium.Water;
//   import aquarium.jellies.Water;
//F. None of these imports can make the code compile.



//8
/*public class BirdDisplay {
    public static void main(String[] name) {
        System.out.println(name[1]);
    } }*/
//A. java BirdDisplay Sparrow Blue Jay
//B. java BirdDisplay Sparrow "Blue Jay"       +
//C. java BirdDisplay Blue Jay Sparrow
//D. java BirdDisplay "Blue Jay" Sparrow
//E. java BirdDisplay.class Sparrow "Blue Jay"
//F. java BirdDisplay.class "Blue Jay" Sparrow
//G. Does not compile


//9
//public static void main( )
//A. String[] _names   +
//B. String[] 123
//C. String abc[]        +
//D. String _Names[]     +
//E. String... $n        +
//F. String names
//G. None of the above.

//10
//        A. private static void main(String[] args)
//        B. public static final main(String[] args)
//        C. public void main(String[] args)
//        D. public static void test(String[] args)
//        E. public static void main(String[] args)  +
//        F. public static main(String[] args)
//        G. None of the above