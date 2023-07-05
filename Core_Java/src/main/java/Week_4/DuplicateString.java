import java.util.HashSet;
import java.util.Scanner;

public class DuplicateString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashSet<Character> hashset=new HashSet<Character>();
        for(int i=0;i<str.length();i++)
            hashset.add(str.charAt(i));
        System.out.println(hashset);
    }
}
