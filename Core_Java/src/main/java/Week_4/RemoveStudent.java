import java.util.ArrayList;
import java.util.List;
public class RemoveStudent {
         String fn;
         String ln;
         double gpa;
        public RemoveStudent(String firstName, String lastName, double gpa) {
            this.fn = firstName;
            this.ln = lastName;
            this.gpa = gpa;
        }
        public double getGpa() {
            return gpa;
        }
        @Override
        public String toString() {
            return fn + " " + ln + " (GPA: " + gpa + ")";
        }
    }
    class RemoveStudentsBelowAverageGPA {
        public static void main(String[] args) {
            List<RemoveStudent> studentList = new ArrayList<>();
            studentList.add(new RemoveStudent("Om", "Raut", 3.0));
            studentList.add(new RemoveStudent("Dhoni", "Singh", 3.4));
            studentList.add(new RemoveStudent("Rahul", "KL", 3.8));
            studentList.add(new RemoveStudent("Hrithik", "Roshan", 3.8));
            studentList.add(new RemoveStudent("Sai", "Sri", 4.0));

            // Calculate the average GPA
            double tgpa = 0.0;
            for (RemoveStudent s : studentList) {
                tgpa += s.getGpa();
            }
            double averageGpa = tgpa / studentList.size();

            // Remove students with GPA less than the average GPA
            List<RemoveStudent> remainingStudents = new ArrayList<>();
            for (RemoveStudent s : studentList) {
                if (s.getGpa() >= averageGpa) {
                    remainingStudents.add(s);
                }
            }
            // Print the remaining students
            System.out.println("Remaining students:");
            for (int i = 0; i < remainingStudents.size(); i++) {
                RemoveStudent s = remainingStudents.get(i);
                System.out.println(s);
            }
        }
    }

