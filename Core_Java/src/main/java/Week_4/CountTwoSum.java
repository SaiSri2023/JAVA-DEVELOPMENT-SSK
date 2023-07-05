import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountTwoSum {
    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndices = new HashMap<>(); //initailize  hashmap

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];//retrieve the current number
            int complement = target - num;

            if (numIndices.containsKey(complement)) {
                return new int[]{numIndices.get(complement), i}; //returns indices
            }

            numIndices.put(num, i); // store current num and indices
        }

        return new int[0];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

        int[] indices = findTwoSum(nums, target);

        if (indices.length == 2) {
            System.out.println("[" + indices[0] + ", " + indices[1] + "]");
        } else {
            System.out.println("No two numbers found that add up to the target sum.");
        }
    }
}
