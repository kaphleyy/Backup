package practiceQuestions;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(isValid("abc", "def", "dabecf"));
    }

    static String isValid(String a, String b, String c) {
        int pointer1 = 0;
        int pointer2 = 0;
        boolean isIt = true;

        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) != a.charAt(pointer1) && c.charAt(i) != b.charAt(pointer2)) {
                isIt = false;
                System.out.println(isIt);
                return "not Valid";
            }
            System.out.println(isIt);

            if (c.charAt(i) == a.charAt(pointer1))
                pointer1++;
            else if (c.charAt(i) == b.charAt(pointer2))
                pointer2++;
            System.out.println(pointer1 + " " + pointer2);

        }
        if (isIt)
            return "valid";
        else
            return "not valid";
    }
}
