import java.util.ArrayList;
import java.util.Scanner;
public class RemoveLast {
        public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of values to add: ");
            int numValues = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the values:");
            for (int i = 0; i < numValues; i++) {
                String input = sc.nextLine();
                list.add(input);
            }
            System.out.println("Before removing " + list);
                if (!list.isEmpty()) {
                    int lastIndex = list.size() - 1;
                    list.remove(lastIndex);
                    System.out.println("Last object removed.");
                } else {
                    System.out.println("The ArrayList is empty. Nothing to remove.");
                }
            System.out.println("After removing " + list);

        }
    }

