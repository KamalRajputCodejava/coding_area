import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import  java.util.stream.*;
// how to read file using File_ines method and classes ;
public class FileReader 
{ public FileReader(String string) {
    }

public static void main(String[] args) throws IOException
{ String str = "C:\\Users\\Lenovo\\Desktop\\New Text Document.txt" ; // path of file jise read karna h;
 Path dir = Paths.get(str);  // defining the path of the file ; using paths.get(str);
 Stream<String>content = Files.lines(dir);  //storing the data of the file ;
 content.forEach(out->System.out.println(out)); //we are using lambda function for 
                                                // over here lambda function is taking 'out'as a prameter
                                                // and printing it ;
}
    
    
}
