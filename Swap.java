public class Swap {
    public static void main(String[] args) {
        int a=5,b=3;
        System.out.println("Before swappping: a = " + a + " b = "+ b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapp: a = "+ a +" b = "+ b);
    }
}