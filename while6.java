public class while6 {
    public static void main(String[] args) {
        int row=1;
        int totalrow=5;

        while(row<=totalrow) {
        int colum=1; 
            while(colum<=row) {
                System.out.print(colum);
                colum++;
            }
            System.out.println();
            row++;

        }
    }
}