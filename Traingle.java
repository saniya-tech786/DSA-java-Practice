public class Traingle {
    public static void main(String[] args) {
        int a=4,b=4,c=4;
        if(a==b && b==c) {
            System.out.println("Equilateral traingle");
        }else if(a==b || b==c || a==c) {
            System.out.println("Isosceles traingle");
        }else {
            System.out.println("Scalene Traingle");
        }
    }
    
}
