import java.util.Scanner;
public class ArrayTranspose {
    public static void main( String[] args){
        int arr[][] = new int [3][3];
        int arrT[][] = new int[3][3] ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of matrix");
        for( int i =0 ; i< 3 ;i++ ){
            for(int j=0 ; j<3;j++){
                arr[i][j] = sc.nextInt();


            }

            }
        for(int i =0 ;i<3;i++){
            for(int j = 0 ;j<3;j++){
                arrT[i][j]= arr[j][i] ;
                System.out.print("   "+arrT[i][j]);


            }
            System.out.println();
        }
        


    }
    
}
