import java.util.Properties;
// import java.util.Set;

public class properties {
    public static void main(String[] args) {
        Properties p = System.getProperties();

        // getProperty(key) return value in string formatx
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("os.arch"));
        System.out.println(System.getProperty("java.class.path"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("file.separator"));
        System.out.println(System.getProperty("path.separator"));
        System.out.println();
        System.out.println();

        // p.forEach((k, v) -> System.out.println(k + " : " + v));
        p.list(System.out);

    }

}
