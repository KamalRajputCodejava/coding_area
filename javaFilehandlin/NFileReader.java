import java.io.*;
import java.io.FileReader;
public class NFileReader {
    /*==> as the method int fr.read() return int value so we compulsory to type cast ;
     * the new overrride method is int fr.read(char[] ch);
     * to read the char array of the file ;
     * 
     */
   public static void main(String[] args)  throws IOException{
    FileReader fr = new FileReader("kamal.txt");
    char [] ch = new char[1000];// initialize the char arry ;
    long noch =0 ;
      int i =  fr.read(ch);
      for(char ch1 :ch){
      System.out.print(ch1);  
      noch++;         
        }
        System.out.println("no. of charector are :"+noch);
   }    
}
