public class StringBuil {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("This is a string");

        System.out.println(str.capacity());
        System.out.println(str.replace(0, 3, "a"));
        System.out.println(str.delete(5, 7));
        System.out.println();

        StringBuilder str1 = new StringBuilder(5);
        System.out.println(str1.capacity());
        str1.append('A');
        for (int i = 0; i < 10; i++)
            str1.append(i);
        System.out.println(str1.capacity());
        System.out.println(str1.toString());
        System.out.println();
        System.out.println(str1.codePointAt(0));
        System.out.println(str.append(true));
    }

}
