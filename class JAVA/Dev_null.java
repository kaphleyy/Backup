// ?Program to find the null device in your system .

import java.io.File;

public class Dev_null {
    public static void main(String[] args) {
        File f = new File("/dev/null");
        if (f.exists()) {
            System.out.println("/dev/null is the null device in your system");
            return;
        }
        String s = System.getProperty("os.name");

        if (s == null)
            System.out.println("jnk is the Null Device in your system.");
        else if (s.startsWith("Windows"))
            System.out.println("NUL is the Null Device in your system.");

        else
            System.out.println("jnk is the Null Device in your system.");
    }

}
