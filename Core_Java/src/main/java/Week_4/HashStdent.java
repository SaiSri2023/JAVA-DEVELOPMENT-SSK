import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashStdent{
    public static void main(String[] args) {
        Map<String, Student_1> studentMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter no of students");
        int n= Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("GPA: ");
            double gpa = scanner.nextDouble();
            scanner.nextLine();
            Student_1 student = new Student_1(firstName, lastName, gpa);
            studentMap.put(firstName, student);
            System.out.println();
        }

        System.out.println("HashMap Entries (using entrySet):");
        for (Map.Entry<String, Student_1> entry : studentMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("\nHashMap Entries (using forEach method):");
        studentMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        System.out.println("\nHashMap Entries (using keySet and Iterator):");
        for (String key : studentMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + studentMap.get(key));
        }
    }
}
class Student_1 {
    private String fn;
    private String ln;
    private double gpa;

    public Student_1(String firstName, String lastName, double gpa) {
        this.fn = firstName;
        this.ln = lastName;
        this.gpa = gpa;
    }
    public String getFirstName() {
        return fn;
    }
    public String getLastName() {
        return ln;
    }
    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + fn + '\'' +
                ", lastName='" + ln + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
