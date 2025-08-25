// This class demonstrates the use of statements and semicolons in Java.
import java.util.Scanner;
class while5 {

    // The main method serves as the entry point for the program.
    public static void main(String[] args) {
        
        // write your code here
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
         int i=1;
         while(i<=number) {
             if(number%2!=0) {
             int j=1; 
             while(j<=number) {
                 System.out.print("Addition Table for " + number +":" + i + "+" + j + " =" + i+j );
                 j++;
             }
             }
             System.out.println("");
             i++;
         }
    }
}