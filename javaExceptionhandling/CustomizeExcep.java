import java.util.Scanner ;
class InsufficientFund extends RuntimeException {
  InsufficientFund(String s){
    super(s);
  }
}
class InvalidData extends RuntimeException{
    InvalidData (String s){
        super(s);
    }

}
public class CustomizeExcep {
    public static void main(String[] args)
    {
       try{ int ammount1 =12000;
        String  Data  ;
        Scanner sc = new Scanner(System.in);
        System.out.println("  enter the ammount of money ");
           int ammount = sc.nextInt();
        }
        catch(InsufficientFund | InvalidData e){
            System.out.println( " A/c  balance : " +e);

        }
    }
    
}
