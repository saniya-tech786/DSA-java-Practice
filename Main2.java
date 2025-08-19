class Parent {

    void display() {
        System.out.println("this is parent class method");
    }
}
class Child extends Parent {
    void display() {
        System.out.println("this is child class");
    }
    void show() {
        display();
        super.display();
    }

}
public class Main2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}