package Ass12;

public class Q2 {
    public static void main(String[] args) {
        int maxLength = 1;
        int tempIndex = 0;
        int index = 0;
        String s = "tttthiiiiisreeepeacting";
        int i = 0; 
        boolean isCountChanged = false;

        while (i < s.length() - 1) {
            int tempCount = 1;
            tempIndex = i;

            while (s.charAt(i) == s.charAt(i + 1)) {
                if (tempCount > maxLength) {
                    maxLength = tempCount;
                    isCountChanged = true;
                }
                tempCount++;
                i++;
            }

            if (isCountChanged) {
                index = tempIndex;
            }
            isCountChanged = false;
            i++;
        }

        System.out.println(s.substring(index, index + maxLength + 1));
    }
}
