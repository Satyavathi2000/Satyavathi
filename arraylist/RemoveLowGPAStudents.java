package arraylist;

import java.util.ArrayList;

class Student {
    String firstName;
    String lastName;
    double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }
}

public class RemoveLowGPAStudents {
    public static void main(String[] args) {
        // Creating an ArrayList of Students
        ArrayList<Student> Stud = new ArrayList<>();

        Stud.add(new Student("Bob", "G", 3.8));
        Stud.add(new Student("Ram", "V", 3.5));
        Stud.add(new Student("Havi", "B", 2.9));
        Stud.add(new Student("Javier", "K", 4.0));

        // Displaying the ArrayList before removal
        System.out.println("Students before removal:");
        for (Student element : Stud) {
            System.out.println(element.firstName + " " + element.lastName + " - GPA: " + element.gpa);
        }

        // Removing Students with GPA less than the average GPA
        double totalGPA = 0;

        //double x = Stud.get(0).gpa;

        for (Student element : Stud) {
            totalGPA += element.gpa;
        }
        double averageGPA = totalGPA / Stud.size();

        ArrayList<Student> remainingStudents = new ArrayList<>();
        for (Student Student : Stud) {
            if (Student.gpa >= averageGPA) {
                remainingStudents.add(Student);
            }
        }

        // Displaying the ArrayList after removal
        System.out.println("\nStudents after removal:");
        for (Student element : remainingStudents) {
            System.out.println(element.firstName + " " + element.lastName + " - GPA: " + element.gpa);
        }
    }
}
