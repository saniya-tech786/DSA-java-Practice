public class while3 { 
   public static void main(String[] args) {
    int i=1;
    while(i<=5) {
        if(i%2==0) {
           int j=1;
            while(j<=5) {
                System.out.print("(" + i + " ," + j + ")");
                j++;

            }
          System.out.println();
        }
          
          i++;
    }
   } 
    
}
