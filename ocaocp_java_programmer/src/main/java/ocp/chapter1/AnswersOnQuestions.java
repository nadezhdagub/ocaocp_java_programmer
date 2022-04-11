package ocp.chapter1;

public class AnswersOnQuestions {
    public static void main(String[] args) {
        //3
        String s1 = "Canada";
        String s2 = new String(s1);
        if(s1 == s2) System.out.println("s1 == s2");
        if(s1.equals(s2)) System.out.println("s1.equals(s2)");      //this true

        //5
//        Which of the following statements are true, assuming a and b are String objects? (Choose
//        all that apply.)
//        A. If a.equals(b) is true, a.hashCode() == b.hashCode() is always true.           +
//        B. If a.equals(b) is true, a.hashCode() == b.hashCode() is sometimes but not
//        always true.
//        C. If a.equals(b) is false, a.hashCode() == b.hashCode() can never be true.
//        D. If a.equals(b) is false, a.hashCode() == b.hashCode() can sometimes be true      +
    }
}

//1
class Employee {
    public int employeeId;
    public String firstName, lastName;
    public int yearStarted;

    @Override
    public int hashCode() {
        return employeeId;
    }

    public boolean equals(Employee e) {
        return this.employeeId == e.employeeId;
    }

    public static void main(String[] args) {
        Employee one = new Employee();
        one.employeeId = 101;
        Employee two = new Employee();
        two.employeeId = 101;
        if (one.equals(two)) System.out.println("Success");       // this result
        else System.out.println("Failure");
    }
}

//2
class Book {
    private int ISBN;
    private String title, author;
    private int pageCount;
    public int hashCode() {
        return ISBN;
    }
    @Override public boolean equals(Object obj) {
        if ( !(obj instanceof Book)) {
            return false;
        }
        Book other = (Book) obj;
        return this.ISBN == other.ISBN;
    }
// imagine getters and setters are here
    //code compile
}
