//runtime stack mechanism in java Exception handling ;
 public class SimpleExcep
 {
    public static void main(String[] args){  // stack 1 ; 
        doStuff();
    }
    public static void doStuff(){ // stack 2 ; 
        doMoreStuff();
    }
    public static void  doMoreStuff(){  //stack 3 ; 
        System.out.println("Hello");
    }
} 