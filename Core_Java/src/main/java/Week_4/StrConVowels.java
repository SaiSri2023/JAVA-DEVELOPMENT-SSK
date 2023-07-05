import java.util.Arrays;
import java.util.Scanner;

public class StrConVowels {
    public static void main(String[] args){
        System.out.println("enter the strings");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] str=input.split(" ");
        Arrays.stream(str)
                .filter(s -> s.matches(".*[aeiouAEIOU].*"))
                .forEach(s -> {
                    long vowelCount = s.chars()
                            .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                            .count();
                    System.out.println(s + " (Number of vowels: " + vowelCount + ")");
                });
    }
}
