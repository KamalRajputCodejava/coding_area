import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NewBufferedReader { 
/*BufferedReader class is most recommanded reader in the java file handling ;
  the methods in BR class are  
 * ==> 1. int  br.read();
 * ==> 2. int br.read(char[] ch)
 * ==> 3. void br.close();
 * ==> 4. String readLine(); { mostly use this method to read char data,this method is return null when all lines are read;};
 *  
 */
//============================================================================
//* CONSTRUCTORS USE IN  BR class 
//==>1. BufferedReader br = new BufferedReader(new FileReader("filename"));
//==>2. BufferedReader br = new BufferedReader(new FileReader("filename") , buffersize);
public static void main(String[] args) throws IOException {
    FileReader f = new FileReader("abc.txt");
    BufferedReader br = new BufferedReader(f);
    String line = br.readLine(); //use this method to read data line by line ;
    while(line!=null){                    
        System.out.print(line);
        line = br.readLine();
    }
    br.close(); // for closing the BR class ; and file ; 
    }
}
