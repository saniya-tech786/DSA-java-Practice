class Parent_constructor {
    Parent_constructor(String name) {
        System.out.println("my name is: " + name);
    }
}

class Child extends Parent_constructor {
    Child(String name) {
        super(name); // call parent constructor with parameter
        System.out.println("this is child class: " + name);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Child c = new Child("saniya");
    }
}
