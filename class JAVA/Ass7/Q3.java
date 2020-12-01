package Ass7;

public class Q3 {

    public static void main(String[] args) {
        String check = "thisIsForCheckSum";
        int checkSum = 0;

        for (int i =0 ; i< check.length() ; i++) {
            checkSum +=check.charAt(i);
        }

        System.out.println(checkSum);
    }
    
}
