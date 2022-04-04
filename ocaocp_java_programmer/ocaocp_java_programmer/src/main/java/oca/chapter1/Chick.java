class Chick {
    public Chick(){
        System.out.println("in constructors");
    }

    public vois Chick() {  // not cinstructor

    }
}

public class Swan {
    int numberEggs;  //instance variable

    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numberEggs = 1;     // set variable
        System.out.println(mother.numberEggs);      // read variable
    }

    //double noteAtStart = _10000.00;       //not compile
    //double noteAtEnd = 10000.00_;    //not compile
    //double noteBeforeDecimal = 1000_.00;   // not compile
    double note = 10_0_00.0_0;         //compile

    int s1, s2;
    int s3 = 1, s4 = 5;
}