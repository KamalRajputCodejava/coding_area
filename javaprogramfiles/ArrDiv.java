import java.util.Scanner;
public class ArrDiv {
    public static void main( String[] args){
        int [] a =new int [3]; // yaha per int datatype h , [] array ki class h aur a array ka nam h like identifier in 
                               //in Scanner class.
        
    Scanner sc = new Scanner(System.in);
        for(int i =0; i<3;i++){
           a[i] = sc.nextInt();
         
           System.out.println(  "           :"+a[i]);
        }
        
        

    }
    
}
