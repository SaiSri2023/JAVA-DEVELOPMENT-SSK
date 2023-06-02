import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a price");
        product prod = new product();
        Scanner sc = new Scanner(System.in);
        Double ans1, ans2, ans3;
        Double price = sc.nextDouble();
        prod.setPrice(price);
        ans1= prod.getPrice(5);
        ans2 = prod.getPrice(9.6);
        ans3 = prod.getPrice(6.8);
        System.out.println("Ans1= " + ans1);
        System.out.println("Ans1= " + ans2);
        System.out.println("Ans1= " + ans3);
    }
}