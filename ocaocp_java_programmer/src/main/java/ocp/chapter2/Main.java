package ocp.chapter2;

public class Main {
}

@FunctionalInterface
interface Sprint {
    public abstract void sprint(Main main);
}

class Tiger implements Sprint {
    public void sprint(Main main) {
        System.out.println("Animal is in sprint" + main.toString());
    }
}
