
package Ass13;

// [^0-9][(0-9)A-Za-z_|\1A-Za-z_]{6,}[0-9|\1]$
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q4 {
    public static void main(String[] args) {
        String s = "There are 60 students in 100 cse d section ,and 55 in cse a section0";
        String regex = "(\\d+)";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        int[] arr = new int[100];
        int flag = 0;

        while (m.find()) {
            arr[flag] = Integer.parseInt(m.group(1));
            flag++;
        }
        int largest = arr[0];
        for (int i : arr) {
            if (i > largest)
                largest = i;
        }

        System.out.println(largest);

    }

}
