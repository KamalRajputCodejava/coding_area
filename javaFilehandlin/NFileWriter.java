import java.io.FileWriter;
import java.io.IOException;

public class NFileWriter {
    // we can use file writer to write data in the file;
    //======================================================================
    // Constructors in FileWriter class ;
    // 1==> FileWriter fw = new FileWriter("string file name ");
    // 2==> FileWriter fw = new FileWriter (File f );
    // OR     ,,        ,, ,, ,,     ,,    (new File("abc.txt"));
    //above two constructors are use only override data ( file se purana data remove ho jata h aur naya data override hokar aa jata h);
    // 3==> FileWriter fw = new FileWriter("File name" , boolean append);
    // this is use for add new data in the file  if append is true ;
    // 4==> FileWriter fw = new FileWriter(File f , boolean append );
    // if specified file is not available thes constructors are able to create new file;
// =============================================================================
//various methods in FileWriter class ;
 // fw.write(ch); ==> write a single char ,
 // fw.write(char[] ch) ==> write an arry of char ;
 //fw.write(String s) ==> write a String value ;
 //fw.flush() ==> provide gaurantee to all the data write in the file ;
 //fw.close() ==> close the FileWriter Class and File ;
//Q: write a program to write data in a txt file ;
public static void main( String[] args ) throws IOException{
 FileWriter fw = new FileWriter("kamal.txt");
 fw.write(100); // char to the file is d ;
 fw.write("1000");
 fw.write("kamal kumar ji ");
 fw.write('\n');
 char[] ch = {'a','b','c'};
 fw.write(ch);
 fw.write('\n');
 fw.flush();
 fw.close();    
} 
    
}
