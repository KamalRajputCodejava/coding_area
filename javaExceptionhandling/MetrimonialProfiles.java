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
public class MetrimonialProfiles {
    public static void main(String[] args ){
        System.out.println("enter your age for marraige !!!");
        Scanner sc = new Scanner(System.in);
        int age  = sc.nextInt();
         if( age < 21)
         {throw new TooyoungException("please wait for some time ");
}       // throw used for printing own Exception ;
    else if( age >60)
    {
     throw new TooOldException("Your age is already crossed for marriage wait for next birth in new life");
}
else {
    System.out.println("you will get Matched profile details soon by Email / Whatsapp");
     }
    } 
  }
