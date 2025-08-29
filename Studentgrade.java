
    import java.util.Scanner; 
        public class Studentgrade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("enter your marks: ");
    int marks=sc.nextInt();
    if(marks>=90) {
        System.out.println("Grade: A");
    }else if(marks>=80) {
        System.out.println("B Grade");
    }else if(marks>=70) {
        System.out.println("C Grade");
    }else {
        System.out.println("FAIL");
    }
    }
    
}

    

