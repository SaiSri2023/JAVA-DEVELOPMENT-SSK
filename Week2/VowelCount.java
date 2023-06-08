import java.util.Scanner;

public class VowelCount {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String");
        String str=sc.nextLine();
        str=str.toUpperCase();
        int j=0;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)=='A'|| str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U'){
                j++;
            }
        }
        System.out.println("Count=" +j);
    }

}
