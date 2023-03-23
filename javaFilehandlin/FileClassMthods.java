import java.io.File;
import java.io.IOException;
public class FileClassMthods { 
    // f.exists();  ==> for checking the fle is exists();
   //f.createNewFile() ==> for create new file ;
   //f.mkdir(); ==> make new directory ;
   //f.isFile();  ==> returns true if specified objects pointed to a physical file ; 
   //f.isDirectory(); ==> returns true if specified objects pointed to a physical directory;
   //f.list(); ==> returns string[] for all files and directory names ;
   //f.length(); returns long  , no. of charecters present in the file ;
   //f.delete(); //returns boolean value to delete specific file Or directory;
   //==?qus : write a program to display all files and directory in any folder ;
   public static void main(String[] args)throws IOException{
     long count =0 ;
   File f = new File("D:\\");
    String [] str = f.list() ;
  for(String s1 : str){
    count++;
    System.out.println("THE LIST OF THE DIR AND FILES ARE : "+ s1);
}
System.out.println("total no of files are : "+ count);
   }
}
