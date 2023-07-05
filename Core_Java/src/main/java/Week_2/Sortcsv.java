import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student_1{
    String fn,ln,gpa;
    public Student_1(String a, String b, String c ) {
        this.fn = a;
        this.ln = b;
        this.gpa = c;
    }
}
class SortLast implements Comparator<Student_1> {
    @Override
    public int compare(Student_1 a1, Student_1 a2) {
        return a1.ln.compareTo(a2.ln);
    }
}
public class Sortcsv {
    public static void main(String[] args)
    {
        try
        {

            List<Student_1> students = new ArrayList<>();
            int i = 0;
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\saisr\\Downloads\\JAVA-DEVELOPMENT-SSK\\Week2\\newlist.csv"));
            String line = br.readLine();
            line = br.readLine();
            while (line != null)
            {
                String[] temp = line.split(",");
                Student_1 s = createStudent(temp);
//                System.out.println(s.fn);0
                students.add(s);
                line = br.readLine();
            }

            Collections.sort(students,new SortLast());

            for(Student_1 st: students)
            {
                System.out.printf(st.fn+"   ");
                System.out.printf(st.ln+"   ");
                System.out.println(st.gpa);
            }
//                System.out.println(st);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static Student_1 createStudent(String[] metadata) {
        String fn = metadata[0];
        String ln = metadata[1];
        String gpa = metadata[2];

        return new Student_1(fn,ln,gpa);
    }

}