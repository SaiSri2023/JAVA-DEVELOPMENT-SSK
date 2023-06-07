import java.util.Scanner;

public class SmallLarge {
    public static void main(String args[]){
                System.out.println("Enter number of elements");
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int[] a=new int[n];
                System.out.println("Enter the array");
                for(int i=0;i<n;i++){
                    a[i]=sc.nextInt();
                }
                sc.close();
                int small=a[0];
                int large=a[0];
                for (int i=1;i<a.length;i++){
                    if(a[i]<small){
                        small=a[i];
                    }
                }
                for (int i=1;i<a.length;i++){
                    if (a[i]>large) {
                        large=a[i];

                    }
                }
                System.out.println("Smallest number is "+small);
                System.out.println("Largest number is "+large);




            }
        }

