import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void revArray(int[] a) {
        int fn = 0;
        int ln = a.length - 1;
        int tn;
        while (fn < ln) {
            tn = a[fn];
            a[fn] = a[ln];
            a[ln] = tn;
            fn++;
            ln--;
        }
    }

    public static void main(String args[]) {
        System.out.println("Enter number of elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array");
        int i;
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        revArray(a);
        System.out.print(Arrays.toString(a));
    }
}




