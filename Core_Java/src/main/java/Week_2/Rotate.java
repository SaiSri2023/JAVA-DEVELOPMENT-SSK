import java.util.Scanner;

public class Rotate {
        public static void main(String args[]){
            System.out.println("Enter number of elements");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.print("Enter the elements");
            int[] a=new int[n];
            int x=2;
            for(int i=0;i<n;i++){
               a[i]=sc.nextInt();
            }
            for(int i = 0; i < x; i++){
                int j, f;
                f=a[0];
                for(j=0;j<a.length-1;j++){
                    a[j] = a[j+1];
                }
                a[j]=f;
            }

            System.out.println();


            for(int i = 0; i< a.length; i++){
                System.out.print(a[i] + " ");
            }
        }
}

