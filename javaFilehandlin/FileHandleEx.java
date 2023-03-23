import java.io.FileWriter;
import java.io.IOException ;
public class FileHandleEx{ 
    public static void main(String[] args){
        String content  =" My name is kamal Rajput";
      
try {  // creating Instance of the filewriter class ;
        FileWriter f  =new FileWriter("kamal.jpg");
        f.write(content);
        // file must be close ; 
        f.close();
        //displaying message after successfully writing into a file ;
        // happy life doing good job for the erning ; 
}
catch(IOException e)
{ // display the exception of file ;
    System.out.println(e);


}

    }

}