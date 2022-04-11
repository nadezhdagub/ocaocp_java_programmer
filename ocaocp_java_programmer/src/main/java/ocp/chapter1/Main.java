package ocp.chapter1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HeavyAnimal hippo = new Hippo();
        boolean b1 = hippo instanceof Hippo; // true
        boolean b2 = hippo instanceof HeavyAnimal; // true
        boolean b3 = hippo instanceof Elephant; // false
        boolean b4 = hippo instanceof Object; // true
        Hippo nullHippo = null;
        boolean b5 = nullHippo instanceof Object; // false

        System.out.println(new ArrayList()); // []
        System.out.println(new String[0]); // [Ljava.lang.String;@65cc892

        String s1 = new String("lion");
        String s2 = new String("lion");
        System.out.println(s1.equals(s2)); // true
        StringBuilder sb1 = new StringBuilder("lion");
        StringBuilder sb2 = new StringBuilder("lion");
        System.out.println(sb1.equals(sb2)); // false

        Season s = Season.SUMMER;
        System.out.println(Season.SUMMER); // SUMMER
        System.out.println(s == Season.SUMMER); // true

        switch (s) {
            case WINTER:
                System.out.println("Get out winter!");
                break;
            case SUMMER:
                System.out.println("Time for walking");
                break;
            default:
                System.out.println("It is summer yet&");
        }
    }

//    @Override
//    public String toString() {
//        return "Name: " + name + ", Weight: " + weight;
//    }
}

class HeavyAnimal {
}

class Hippo extends HeavyAnimal {
}

class Elephant extends HeavyAnimal {
}

class Bobcat {
    public void findDen() {
    }
}

class BobcatMother extends Bobcat {
    @Override
    public void findDen() {
    }
}

class Card {
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        if (rank == null || suit == null) {
            throw new IllegalArgumentException();
        }
        this.rank = rank;
        this.suit = suit;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Card)) return false;
        Card c = (Card) obj;
        return rank.equals(c.rank) && suit.equals(c.suit);
    }

    public int hashCode() {
        return rank.hashCode();
    }
}

enum Season {
    WINTER, SPRING, SUMMER, FALL
}

enum S {
    WINTERR("Low"), SPRINGG("Medium"), SUMMERR("High"), FALLL("Medium");
    private String expectedVisitors;

    private S(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors() {
        System.out.println(expectedVisitors);
    }
}

class AnonInner {
    abstract class SaleToday {
        abstract int dollar();
    }

    public int administration(int basePrise) {
        SaleToday sale = new SaleToday() {
            @Override
            int dollar() {
                return 3;
            }
        };
        return basePrise = sale.dollar();

        //or
    }

    abstract class SaleToday1 {
        abstract int dollars();
    }
    public int pay() {
        return administ(5, new SaleToday1() {
            public int dollars() {return 3;}
        });
    }
    public int administ(int base, SaleToday1 saleToday1) {
        return base = saleToday1.dollars();
    }
}

