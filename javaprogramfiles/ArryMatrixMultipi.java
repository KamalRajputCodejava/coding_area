import java.util.Scanner;
public class ArryMatrixMultipi {
    public static void main ( String[] args ){
        int [][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c =new int[3][3];
        Scanner sc = new Scanner ( System.in );
        System.out.println("enter the elements of first matrix");
        for( int i =0 ; i< 3 ;i++ ){
            for(int j=0 ; j<3;j++){
                a [i][j] = sc.nextInt();


            }

            }
            System.out.println("enter the value of 2nd matrix");
            for(int i=0;i<3;i++){
                for(int j =0 ;j<3;j++){
                    b[i][j] = sc.nextInt();

                }
            }
            System.out.println("the resultent multipication matrix is ");
            for(int i=0;i<3;i++){    
                for(int j=0;j<3;j++){    
                c[i][j]=0;      
                for(int k=0;k<3;k++)      
                {      
                c[i][j]+=a[i][k]*b[k][j];      
                }//end of k loop  
                System.out.print(c[i][j]+" ");  //printing matrix element  
                }//end of j loop 
                System.out.println(); 
    
                
            }
        }
    }


    
    

