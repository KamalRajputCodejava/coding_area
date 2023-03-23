import java.util.Scanner;

// this problem shows the example of Metrimonial site or marrege site Exception handle ;
class TooyoungException extends RuntimeException { //creating exception class ;
    TooyoungException(String s ){ // constructor to communicate to the parent class
    super(s);
}
}
class TooOldException extends RuntimeException {
 TooOldException (String s){ // constructor to communicate to the parent class
    super(s);
 }
}
public class TryCatchMetrimonial {
    public static void main(String[] args ){
        System.out.println("enter your age for marraige !!!");
        Scanner sc = new Scanner(System.in);
        int age  = sc.nextInt();
        try{
            if(age < 18){
         }
        }
        catch(TooyoungException ex){
            ex.getMessage();
        }
        try{ if(age > 60){

        }
     }
     catch(TooOldException ex ){
        ex.getMessage();
     }
     if(age >21 | age <60){
        System.out.println("your matched profile get by email");
     }
     
    
}
}
