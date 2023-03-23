public class Test3 {
public static void main(String[] args){
    doStuff();
}
 public static void  doStuff(){
    doMoreStuff();
 }
 public  static void doMoreStuff(){
     doHeveStuff();
   try{ System.out.println(10/0);} // use of try catch statments for handling Exception ;
   catch(ArithmeticException e){
    System.out.println(10/2);/* AE ko try catch se handle kiya gaya h ;
                             */
   }                             //yaha per Arithmetic Exception rise hoga ;//aur program abnormally terminate hoga ;
 }
 public static void doHeveStuff(){
    System.out.println("Hello Guys");
 }

    
}
