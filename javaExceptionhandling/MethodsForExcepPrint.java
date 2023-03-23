public class MethodsForExcepPrint { 
    /*printStackTrace() == name of Exception: Description StackTrace ;
     * toString() == name of Exception : Description
     *getMessage() == Description ;
     */
    public static void main (String[] args ){
        try {
            System.out.println(10/0);
        }
        catch (ArithmeticException e ){
            e.printStackTrace();  // name of exception and Description StackTrace;
            System.out.println(e); // name of Exception : Desccription ;
            System.out.println(e.toString());// doing and printing some Exceptions
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println(" hey there is finally block ");
        }
    }
    
}
