import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your monthly salary : ");
        int salary=sc.nextInt();

        double annual=salary*12;
        if(annual>=200000) {
            System.out.println("Eligible for loan ");
        }else {
            System.out.println("not eligible for loan ");
        }
        
        
    }
    
}
