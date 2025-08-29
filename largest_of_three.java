public class largest_of_three { 
    public static void main(String[] args) {
        int num1=3,num2=5,num3=10;
        if(num1>num2 && num1>num3) {
            System.out.println(num1 + "is greater");
        }else if(num2>num1 && num2>num3) {
            System.out.println(num2 + "is greater");
        }else {
            System.out.println(num3 + " is greatrer ");
        }
    }
    
}
