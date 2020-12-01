package Ass13;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) throws Exception {
        File file = new File("phone.txt");  
        Scanner sc = new Scanner(file);

        Pattern p = Pattern.compile("^(0|91)?[7-9][0-9]{9}");


        while(sc.hasNextLine()) {
            String phone = sc.nextLine();
        Matcher m = p.matcher(phone);

        if(m.find()) System.out.println(phone);
    }
}
}
