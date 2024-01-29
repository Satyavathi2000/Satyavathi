package hashmap;

import java.util.HashMap;
import hashmap.Student;

public class StudentHashMap {

    public static HashMap<String, Student> createStudentHashMap() {
        HashMap<String, Student> studentMap = new HashMap<>();

        Student student1 = new Student("John", "Doe", 3.8);
        Student student2 = new Student("Alice", "Smith", 3.5);
        Student student3 = new Student("Bob", "Johnson", 3.9);
        Student student4 = new Student("Emily", "Williams", 3.7);
        Student student5 = new Student("David", "Brown", 4.0);
        Student student6 = new Student("Emma", "Miller", 3.6);
        Student student7 = new Student("Charlie", "Davis", 3.2);
        Student student8 = new Student("Olivia", "Moore", 3.8);

        studentMap.put(student1.firstName, student1);
        studentMap.put(student2.firstName, student2);
        studentMap.put(student3.firstName, student3);
        studentMap.put(student4.firstName, student4);
        studentMap.put(student5.firstName, student5);
        studentMap.put(student6.firstName, student6);
        studentMap.put(student7.firstName, student7);
        studentMap.put(student8.firstName, student8);

        return studentMap;
    }

    public static Student getStudentByName(HashMap<String, Student> studentMap, String name) {
        if (studentMap == null) {
            return null; // Return null if the map is null
        }
        return studentMap.get(name);
    }

    // ... (other methods)

    public static void main(String[] args) {
        HashMap<String, Student> studentMap = createStudentHashMap();

        // Print all student names
        System.out.println("Student Names:");
        for (String studentName : studentMap.keySet()) {
            System.out.println(studentName);
        }

        // Example: Get a student by name
        String studentNameToFind = "Bob";
        Student foundStudent = getStudentByName(studentMap, studentNameToFind);

        if (foundStudent != null) {
            System.out.println("\nDetails for student " + studentNameToFind + ":");
            System.out.println("First Name: " + foundStudent.firstName);
            System.out.println("Last Name: " + foundStudent.lastName);
            System.out.println("GPA: " + foundStudent.gpa);
        } else {
            System.out.println("\nStudent not found with name: " + studentNameToFind);
        }
    }
}
