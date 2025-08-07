public class Test4 {
    public static void main(String[] args) {
        int[] arr = {56, 23, 11, 13,20};
        int insertIndex = 2;
        int insertValue = 15;

        int newarr[] = new int[arr.length + 1];

        for (int i = 0; i < newarr.l-ength; i++) {
            if (i < insertIndex) {
                newarr[i] = arr[i];
            } else if (i == insertIndex) {
                newarr[i] = insertValue;
            } else {
                newarr[i] = arr[i - 1];
            }
        }

        for (int no : newarr) {
            System.out.print(no + " ");
        }
    }
}
