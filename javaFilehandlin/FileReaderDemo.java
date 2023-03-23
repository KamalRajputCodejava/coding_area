import java.io.*;
public class FileReaderDemo { 
    /* in this filereader demo example we have tho approach are given ;
     * |__________________________________________________________|
     */ //==========----------------=========-=========-=-=========
    // approach1==> 
    public static void main(String[] args) throws IOException {
        
        FileReader fr = new FileReader("abc.txt");
       // char[] ch  = new char[ (int)fr.length()]
   // ==2 aproch is 
   System.out.println("======================================================");
   //FileReader fr1 = new FileReader("abc.txt");
   //FileReader fr2 = new FileReader("abc.txt");
   int i = fr.read();
   while(i != -1){

    System.out.print((char)i); //==> typecasting is compolsory ;
   } 
    }  
    
}
