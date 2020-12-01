package Ass13;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("a.txt");

        fw.write("hello , this is file handling guys.");
        fw.close();
    }

    
}
