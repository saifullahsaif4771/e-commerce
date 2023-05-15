import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Readfile {
    
    public String filereader() throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader("LogIn.txt"));
        String line = null; 
        String line1 = ""; 
        while ((line = reader.readLine()) != null) {

            line1=line1+line+"\n";
        }
        // System.out.println(line1);
        reader.close();
        return line1.toString();
    }
public static void main(String[] args)
{
    Readfile obj = new Readfile();
    
    try {
        System.out.println(obj.filereader());
        // obj.filereader();
    } catch (IOException e) {
        
        System.out.println(e);
    }
    
    
}
}
