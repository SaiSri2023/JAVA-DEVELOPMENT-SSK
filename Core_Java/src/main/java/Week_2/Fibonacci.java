import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        int f=0,l=1,t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.printf(f+" "+l);
        for(int i=2;i<n;i++){
            t=f+l;
            System.out.printf(" "+t);
            f=l;
            l=t;
        }

    }
}

