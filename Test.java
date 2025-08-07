public class Test {
    public static void main(String[] args) {
        int[] arr={1,3,5,89,56};
        int max=arr[0];
        for(int i=1;i<arr.length;i++) {
            if(max<arr[i]) {
                max=arr[i];
            }
        }
        System.out.println("maxinum number is: "+max);
    }
}