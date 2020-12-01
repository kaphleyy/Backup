
//?WAP to convert bin to octal
public class Q2Next {
    public static void main(String[] args) {
        String bin = "10";
        int dec = Integer.parseInt(bin,2);
        String oct = Integer.toString(dec,8);
        System.out.println(oct);
    }
    
}
