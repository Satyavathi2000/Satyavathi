package comparable;

public class Main {
 public static void main(String[] args) {
        // Creating two persons with the same ssn
        Person person1 = new Person(175.0, 70.0, "123-45-6789", "123-456-7890");
        Person person2 = new Person(180.0, 75.0, "123-45-6789", "987-654-3210");

        // Testing the equals method
        System.out.println("Person1 equals Person2: " + person1.equals(person2));
    }

}
