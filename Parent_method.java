

public class Parent_method {
    int num=200;
}
 class Child extends Parent_method {
    int num=500;
    void show() {
        System.out.println(num);
        System.out.println(super.num);
    }

public class Main{
       public static void main(String[] args) {
        Child c=new Child();
        c.show();
    }
    
}
}
