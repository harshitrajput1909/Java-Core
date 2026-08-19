package classs;

import java.util.Scanner;

public class FindTheMissingNUmber {
    static void main() {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the size of the element");

        int size=in.nextInt();
        int[] arr=new int[size];
//        int length=arr.length;

        for(int j=0;j<size;j++){
            arr[j]=in.nextInt();
        }
        System.out.println("the missing number is");
        System.out.println(find(arr));
    }
    static int find(int[] arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
           sum+=arr[i];
        }
        int n=arr.length+1;
        int total=(n*(n+1))/2;

        return total-sum;


    }
}
