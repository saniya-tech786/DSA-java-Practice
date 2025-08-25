public class while1 {
    public static void main(String[] args) {
        int row=1;
        while(row<=4) {
            int colum=1;
              while(colum<=4) {
                System.out.print("("+ row + "," + colum + ")");
              colum++;

            }
            System.out.println();
            row++;
        }
    } 
    
}
