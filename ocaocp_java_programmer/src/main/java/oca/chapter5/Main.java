package oca.chapter5;

public class Main {
    public static void eat() {
        System.out.println("Bear is eating");
    }

    public final boolean hasFeathers() {
        return true;
    }
}

class Panda extends Main {
    public static void eat() {
        System.out.println("Panda bear is chewing");
    }
    public static void main(String[] args) {
        Panda.eat();
    }
   // public final boolean hasFeathers() { // DOES NOT COMPILE
  //      return false;
  //  }
}

abstract class Animal {
    protected int age;
    public void eat() {
        System.out.println("Animal is eating");
    }
    public abstract String getName();
}

class Swan extends Animal {
    public String getName() {
        return "Mama";
    }
}

class Child extends Swan {
    @Override
    public String getName() {
        return "Chi";
    }
}

abstract class BigCat extends Animal {
    public abstract void roar();
}
class Lion extends BigCat {
    public String getName() {
        return "Lion";
    }
    public void roar() {
        System.out.println("The Lion lets out a loud ROAR!");
    }
}
