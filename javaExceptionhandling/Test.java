   
public class Test{
    public static void main(String[] args ){
        doStuff();
    }
   public static void doStuff(){
    doMoreStuff();
    }
    public static void doMoreStuff(){
        System.out.println(10/0); //this is the Example of default Exception handling ;
                                 // inside a method if any Exception is occurs 
                                 // so that that is responsible for rise in Exception ;
                                 
    }

}
