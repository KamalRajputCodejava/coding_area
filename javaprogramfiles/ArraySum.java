import java.util.Scanner;
public class ArraySum {
    public static void main( String[] args){
        int arr[] = new int[10];// declared
        int sum =0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element in array");
        for(int i = 0 ;i<10;i++){
            arr[i] =sc.nextInt();
             }
             for( int i = 0 ;i<10; i++){
                sum =sum+arr[i];
             }
             System.out.println(" sum of elements  : " + sum);
    }
    
}
