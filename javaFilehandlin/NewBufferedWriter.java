import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class NewBufferedWriter {
    /*BufferdWriter bw = new BufferedWriter(new FileWriter("filename"));
     * the BW is used to writer char data in the class; we dont need line seprator(\n);
     */
    // BufferedWriter can't communicate  to the file directly so we need FileWriter class object ;  
   // Constructors in BW class ;
   //==>1 BW bw = new BW(new FileWriter("abc.txt"));
   //==>2 BW bw = new BW(new BW(new FW("abc.txt"))); two level buffering ;
   //============================================================================
   //Methods in BW class ;
   //==1> int bw.write(int ch);
   //==>2     bw.write(char[] ch);
   //==>3     bw.write(String s);
   //==4>. void flush();
   //==5> void  close();
   //==6> newLine(); to insert a '\n'in the txt ;
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("kamal.txt"));
         bw.write("hy my ello hi hkak" );
         bw.flush();
         bw.close();
        
    }
}
