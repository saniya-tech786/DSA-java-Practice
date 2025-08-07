import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int  arr[];
        int n;
        int sum=0;
        int even=0;
        int odd=0;
        Scanner sc=new Scanner(System.in);

         //declaring the size of array 
        System.out.println("enter the aray size:");
        n=sc.nextInt();

        arr=new int[n];
       
        System.out.println("enter the"+ n +"number of element in the array: ");
        for(int i=0;i<n;i++) {
       
             arr[i]=sc.nextInt();

        }
        System.out.println("arrays element are: "); //printing the array element 
        for(int i=0;i<n;i++) {
            
            System.out.print(arr[i]+" ");
            sum+=arr[i];
        }
        System.out.println("sum is: "+sum); // find the sum of the array element ]
        
        //min number 

        int min=arr[0];
        for(int i=0;i<arr.length;i++) {
        if(min>arr[i]) {
            min=arr[i];
    }
}
    System.out.println("min is: "+min);

    //maximum number 
     int max=arr[0];
    for(int i=0;i<arr.length;i++) {
        if(max<arr[i]) {
            max=arr[i];
        }
    }
       System.out.println("max is: "+max);
     
       //even or odd number 
      for(int i=0;i<arr.length;i++) {
        if(arr[i]%2==0) {
           even++;
        }
        else {
            odd++;
        }
       
    }
     System.out.println("even: "+even+ "\n"+"odd is: "+odd);
    
}
}