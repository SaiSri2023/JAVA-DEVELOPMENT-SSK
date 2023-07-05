import java.util.Arrays;
import java.util.Scanner;

public class StrCapital {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the strings");
            String input = scanner.nextLine();

            String[] str = input.split(" ");

            Arrays.stream(str)
                    .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
                    .sorted()
                    .forEach(System.out::println);

        }
    }

