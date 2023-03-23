import java.io.*;
public class NFile {
    //File  f = new File ("abc.txt"); this line would not create any file  it will check 
    // abc.txt file is available in the system or not if it is  available then
    //  refrence variable f is reffers that file ;
    //agar ye file avialable nahi h to uska object create karta h ;
    public static void main ( String[] args ) throws IOException{
        File f = new File ( "abc.txt");
        System.out.println(f.exists());// to check this file exists or not ;
        f.createNewFile(); // create the new file of name "abc.txt";
        System.out.println(f.exists());
        File  d = new File("dirNewfilder");
        d.mkdir(); // create the directory ;

        //================================================================
        //File class constructors ;
        File j = new File("dirNewfilder", "hello.txt");
        j.createNewFile();
        // file creation on other location;
        File k = new File("E:\\kk.txt");
        k.createNewFile();
    /* E:\\kk.txt ;
        |_____kk.txt ;
        |
     */    
    }  
    // by this method we can create the directry also ;
    // we use the f.mkdir(); method for directory ;
    
}
