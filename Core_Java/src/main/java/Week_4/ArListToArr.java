import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArListToArr {
        public static void main(String[] args) {
            ArrayList<String> arrayList = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of strings: ");
            int num = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the strings:");

            for (int i = 0; i < num; i++) {
                String input = scanner.nextLine();
                arrayList.add(input);
            }
            String[] array = arrayList.toArray(new String[arrayList.size()]);
            System.out.println("Array: " + Arrays.toString(array));
        }
    }
