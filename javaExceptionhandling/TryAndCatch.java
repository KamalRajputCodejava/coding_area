class TryAndCatch
    {
     public static void main(String[] args )
        {
            try{int a = 15;
                int b = 0;
                System.out.println("Value of a = " + a);
                System.out.println("Value of b = " + b);
                int c = a / b;
                System.out.println("The result is :");
                System.out.println("a/b = " + c);
            }
            catch(Exception e){
             System.out.println("the exception is :"+e);
               e.printStackTrace();
            }
            finally {
                System.out.println("hey finally block ");
            }
                
            }
        }
    

