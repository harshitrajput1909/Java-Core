package classs;
import java.util.*;
public class Linearsearch {
    static void main() {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the size of the element");

        int size=in.nextInt();
        int[] arr=new int[size];
//        int length=arr.length;

        for(int j=0;j<size;j++){
            arr[j]=in.nextInt();
        }
        System.out.println("enter the target");
        int target=in.nextInt();
        System.out.println(find(arr,target));
    }
        static int find(int[] arr,int target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
            return -1;


        }
}
