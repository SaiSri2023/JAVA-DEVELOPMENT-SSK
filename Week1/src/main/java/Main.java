import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //hello world
        System.out.println("Hello world!");

        //student
        Student stud=new Student();
        stud.setName("Mahinder Singh Dhoni");
        System.out.println("Student name is " +stud.getName());

        //product
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

        //poly
        Color c= new Color();
        Color c1 = new Black();
        Color c2 = new Orange();
        Color c3 = new Blue();
        c.printColor();
        c1.printColor();
        c2.printColor();
        c3.printColor();

        //department
        PoliceDepartment pdept=new PoliceDepartment();
        System.out.println("Size of department:" +pdept.getDepartmentSize());

        //vehicle (interface)
        Vehicle v=new Vehicle();
        v.start();
        v.stop();

        //Constructor assign
        Child ch=new Child();
        Child ch1=new Child(8);

        //static assign
        StaticDemo sd=new StaticDemo();

        //final assign
        FinalDemo fdd1 =new FinalDemo();
        fdd1.finalMethod();

        int num=sc.nextInt();
        int rev=0;
        while(num!=0){
            int r=num%10;
            rev=rev*10+r;
            num/=10;
        }
        System.out.println(rev);
        }

    }
