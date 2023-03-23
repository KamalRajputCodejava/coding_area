 import java.util.Scanner;
 public class AvgArry {
    static public void main(String[] arg){
        int arry[] = new int[10];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the numbers in arry");
        for(int i = 0 ; i<arry.length ;i++){
            arry[i] =sc.nextInt();
            
            sum =sum+arry[i];
        }
        System.out.println(" Sum of the array  : "+ sum);
    }
    
}
