import java.util.Scanner;
public class AddMatrix {
    public static void main( String[] args){
        int[][] a = {{1,2,3},{4,5,6 }, {5,9,0}};
        int[][] b = {{1,2,3},{4,5,6 }, {5,9,0}};
        // for storing new add values of the given arry we create new arry int[][] c ,
         Scanner sc = new Scanner(System.in);
       int c[][] = new int[3][3];// arry initalization step.
        System.out.println("the sum of two given matrix is below :  ");
        for ( int i = 0 ; i<3;i++){
            for(int j = 0 ; j<3;j++){
                c [i][j] = a[i][j]+b[i][j] ;
                System.out.print("  "+c[i][j]);
             }
            System.out.println();


        }
    }
    
}
