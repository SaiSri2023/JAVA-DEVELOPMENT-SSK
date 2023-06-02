import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter department size: ");
        int dept_size=sc.nextInt();
        PoliceDepartment pdept=new PoliceDepartment(dept_size);
        int departmentSize=pdept.getDepartmentSize();
        System.out.println("Size:" +departmentSize);
    }

}
