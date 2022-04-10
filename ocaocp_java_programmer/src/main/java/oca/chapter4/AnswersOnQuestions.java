package oca.chapter4;

//13
//class RopeSwing {
//    private static final String leftRope;
//    private static final String rightRope;
//    private static final String bench;           //error
//    private static final String name = "name";
//
//    static {
//        leftRope = "left";
//        rightRope = "right";
//        }
//    static {
//        name = "name";                 //error
//        rightRope = "right";              //error
//        }
//    public static void main(String[] args) {
//        bench = "bench";                  //error
//        }
//}

public class AnswersOnQuestions {
    public static void main(String[] args) {
        //1
//        public class Ant {
//            _____ void method() { }
//        }
//        A. default
//        B. final    //+
//        C. private  //+
//        D. Public
//        E. String
//        F. zzz:

        //2
//        A. final static void method4() { }  //+
//        B. public final int void method() { }
//        C. private void int method() { }
//        D. static final void method3() { }   //+
//        E. void final method() {}
//        F. void public method() { }

        //15
//        public void print(byte x) {
//            System.out.print("byte");
//        }
//        public void print(int x) {
//            System.out.print("int");
//        }
//        public void print(float x) {
//            System.out.print("float");
//        }
//        public void print(Object x) {
//            System.out.print("Object");
//        }
        Main t = new Main();
        short s = 123;
        //t.print(s);
        //t.print(true);
        //t.print(6.789);
        //output  intObjectObject

    }

    //5
    public int howMany(boolean b, boolean... b2) {
        return b2.length;
    }
//A. howMany();
//B. howMany(true);
//C. howMany(true, true);
//D. howMany(true, true, true);      //+
//E. howMany(true, {true});
//F. howMany(true, {true, true});
//G. howMany(true, new boolean[2]);  //+
}

//7
//1: package my.school;
//        2: public class Classroom {
//          3: private int roomNumber;
//          4: protected String teacherName;
//          5: static int globalKey = 54321;
//          6: public int floor = 3;
//          7: Classroom(int r, String t) {
//              8: roomNumber = r;
//              9: teacherName = t; } }


//1: package my.city;
//        2: import my.school.*;
//        3: public class School {

//              4: public static void main(String[] args) {
//                  5: System.out.println(Classroom.globalKey);                //error
//                  6: Classroom room = new Classroom(101, ""Mrs. Anderson");      //error
//                  7: System.out.println(room.roomNumber);                 //error
//                  8: System.out.println(room.floor);
//                  9: System.out.println(room.teacherName); } }                 //error
