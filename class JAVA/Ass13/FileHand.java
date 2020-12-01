import java.io.File;
// import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHand {
    public static void main(String[] args) throws IOException {

        //! Creating file named b.txt
        File file = new File("b.txt");
        
        if(file.createNewFile()) System.out.println("New File named " + file.getName() + " created");
        else System.out.println("File already exists");

    //! FileWriter writes supplied string into the file b.txt
        FileWriter fw = new FileWriter(file);

        fw.write("Files in java might be tricky but it is quite fun");
        System.out.println("Successfully wrote into the file");
        fw.close();

        //! reading file using scanner class
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()) {
             System.out.println(sc.nextLine());
        }
        System.out.println(file.getAbsolutePath());
        System.out.println("length is " + file.length());

//! deleting the file if the user types y.
        System.out.println("Do you want to delete " + file.getName() + "file?(y/n)");
        Scanner dc= new Scanner(System.in);
        char c = dc.next().charAt(0);
        if(c == 'y') file.delete(); else System.out.println("Good decision");
        
    }
    
}
