import java.util.Scanner;
public class ArraySearch {
    public static void main( String[] args ){
         int size =10;
        int [] a = new int[size];
        Scanner sc = new Scanner( System.in);
        System.out.println("find element");
        int  x = sc.nextInt();
        System.out.println(" enter the elements of an array");
        for ( int i = 0 ; i<size; i++){
            a[i]= sc.nextInt();
        }
        for(int i = 0 ; i<size ; i++){
            if(a[i]==x)
            System.out.println("elemet x is found  at "+i +"index:");

        }

    }
}
