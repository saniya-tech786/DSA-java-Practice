public class Class3 {
    public void eat(String name) { 
        // this is a method we declare
        System.out.println( name +" i am eating cake");
    }
    public void show() {
        System.out.println("this is my clas ad method and object programe");
    }
    public static void main(String[] args) {
        Class3 cat=new Class3(); // this is an object 
        cat.eat("cat");
        cat.show();
        Class3 Dog=new Class3();
        Dog.eat("zTiger");
        Dog.show();
        
    }
    
}
 

