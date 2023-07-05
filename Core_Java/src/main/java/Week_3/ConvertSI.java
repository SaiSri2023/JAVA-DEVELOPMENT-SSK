package src.main.java;

import java.util.Scanner;

public class ConvertSI {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String ");
        String str = sc.nextLine();

        try {
            int input = Integer.parseInt(str);
            System.out.println("The  string "+ str+"and result are " + input);
        }
        catch(Exception e){
            System.out.println("There is an exception");
        }
    }
}
