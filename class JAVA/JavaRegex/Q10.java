package JavaRegex;

public class Q10 {
    public static void main(String[] args) {
        System.out.println(globalReplace("this is good for all , this is really good", "this", "that"));
    }

    static String globalReplace(String doc, String target, String replace) {
        doc = doc.replaceAll(target, replace);
        return doc;
    }

}
