import java.util.Scanner;
public class ArryDeclaration {
    public static void main(String[] args){
        int [] a =  new int[3]; // declaration of an array  as name int[] a by new keyword because the array are objects
        Scanner sc = new Scanner(System.in);
        for(int i= 0 ; i<3;i++){
            a [i] = sc.nextInt(); // elements reads by user .
             }
             for(int j=0 ; j<3; j++){
                
                System.out.println(" elements as "+ a[j]); // element print by for loop .
             }
    } 

    
}
