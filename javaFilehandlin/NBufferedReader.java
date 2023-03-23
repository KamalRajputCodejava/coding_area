import java.io.*;
import java.io.FileReader;

public class NBufferedReader {
     /*FileReader is used to read the char data frome the file ;
      *  the spacial method in the FR is return int  fr.read() this method only read unicode value of
      the file char 
      so must be typecast the unicode to char . 
      */
// =================================================================================
// constructors used in the FileReader Class are two 
// 1==> FileReader fr = new FileReader("File name");
// 2==> fileReader fr = new FileReader(File f );
//Q : write a prog to read the char in the file ;
public static void main(String[] args) throws IOException  {
       BufferedReader fr = new BufferedReader(new FileReader("kamal.txt"));
       int i = fr.read();
       while(i!= -1){
            System.out.print((char)i);
            i =fr.read();
       }
       fr.close();
      // FileReader cr = new FileReader("name.txt");
      // int j = cr.read();
      // while( j!= -1){
        //  System.out.print((char)j);
          //j = cr.read();
       }
}
    

