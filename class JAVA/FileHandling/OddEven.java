import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OddEven {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new FileReader("input.txt")));
        BufferedWriter odd = new BufferedWriter(new FileWriter(new File("odd.txt")));
        BufferedWriter even = new BufferedWriter(new FileWriter(new File("even.txt")));

String str;
        while ((str=br.readLine()) !=null) {
            if(Integer.parseInt(str) % 2  == 0){
                even.write(str);
                even.newLine();
            }
            else{
                odd.write(str);
                odd.newLine();
            }
        }
        System.out.println("Successfully Copied");
        br.close();
        odd.close();
        even.close();

        
    }
    
}