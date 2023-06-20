import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Traverse {

        public static void main(String[] args) {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("Add");
            arrayList.add("Mul");
            arrayList.add("Subtract");

            // Traverse using a for loop
            System.out.println("Traversing using a for loop:");
            for (int i = 0; i < arrayList.size(); i++) {
                String element = arrayList.get(i);
                System.out.println(element);
            }
            System.out.println();

            // Traverse using an enhanced for loop
            System.out.println("Traversing using an enhanced for loop:");
            for (String element : arrayList) {
                System.out.println(element);
            }
            System.out.println();

            // Traverse using an iterator
            System.out.println("Traversing using an iterator:");
            Iterator<String> iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                String element = iterator.next();
                System.out.println(element);
            }
            System.out.println();

            // Traverse using forEach
            System.out.println("Traversing using forEach:");
            arrayList.forEach(System.out::println);
            System.out.println();

            // Traverse using parallel stream
            System.out.println("Traversing using parallel stream:");
            arrayList.parallelStream().forEach(System.out::println);
        }
    }

