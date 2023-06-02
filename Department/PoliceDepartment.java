import java.util.Scanner;

class PoliceDepartment extends Department {
    @Override
    int getDepartmentSize() {
        System.out.println("Enter a price");
        Scanner sc = new Scanner(System.in);
        int departmentSize= sc.nextInt();
        return departmentSize;
    }
}
