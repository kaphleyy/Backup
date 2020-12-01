package Ass10;

public class Q6 { 
    public static void main(String[] args) {
        String s = "Sunday,,monde,,y,Tues,,,,day,Wednesday,Friday,Sa,,turday,, ,aa";
        char delim = ',';
        int tempCount = 0;
        int currCheckpoint = 0;
        int prevCheckpoint = 0;
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < s.length() - 1) {
            if (s.charAt(i) == delim) {
                tempCount = 1;
                currCheckpoint = i;
                while (s.charAt(i + 1) == s.charAt(i)) {
                    tempCount++;
                    i++;
                }
                if (tempCount == 1) {
                    sb.append(s.substring(prevCheckpoint, currCheckpoint) + " ");
                    prevCheckpoint = currCheckpoint + 1;
                }
            }
            if (i == s.length() - 2) {
                if (s.charAt(s.length() - 1) == delim)
                    sb.append(s.substring(prevCheckpoint, s.length() - 1));
                else
                    sb.append(s.substring(prevCheckpoint));
            }
            i++;

        }
        System.out.println(sb);
    }

}
