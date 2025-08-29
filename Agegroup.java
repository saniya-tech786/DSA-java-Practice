public class Agegroup {
    public static void main(String[] args) {
        int age=21;
        if(age>0 && age<=12) {
            System.out.println("your child");
        }else if(age>12 && age<=18){
            System.out.println("your teenage");

        }else if(age>18 && age<=30) {
            System.out.println("your young");
        }else {
            System.out.println("your old");
        }
    }
    
}
