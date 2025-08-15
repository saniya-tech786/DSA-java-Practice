public class Class2 {
    String name="Saniya"; // it is a instance variable 
    int roll_no=203;
    public static void main(String[] args) {
        Class2 sc=new Class2(); //yaha per properties ko access karre hain bythrow the object 
        System.out.println("My name is: "+sc.name);
        System.out.println(sc.name+ " roll no is "+sc.roll_no);
        
    }
}