import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class HashSetSample {

        public static void main(String[] args) {
            // Create a HashSet of strings
            HashSet<String> stringSet = new HashSet<>();

            // Create a Scanner object to read user input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the number of strings
            System.out.print("Enter the number of strings: ");
            int numStrings = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Prompt the user to enter the strings
            for (int i = 1; i <= numStrings; i++) {
                System.out.print("Enter string " + i + ": ");
                String inputString = scanner.nextLine();
                stringSet.add(inputString);
            }

            // Close the Scanner
            scanner.close();

            // Iterate HashSet using Iterator
            System.out.println("\nIterating HashSet using Iterator:");
            Iterator<String> iterator = stringSet.iterator();
            while (iterator.hasNext()) {
                String element = iterator.next();
                System.out.println(element);
            }

            // Iterate HashSet using forEach
            System.out.println("\nIterating HashSet using forEach:");
            for (String element : stringSet) {
                System.out.println(element);
            }

            // Iterate HashSet using Streams forEach
            System.out.println("\nIterating HashSet using Streams forEach:");
            stringSet.forEach(System.out::println);
        }
    }
