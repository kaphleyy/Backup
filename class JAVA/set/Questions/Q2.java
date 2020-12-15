package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Q2 {
    public static void main(String[] args) {
        HashSet<Character> set = new HashSet<Character>();

        ArrayList<Character> list = new ArrayList<>();

        char[] vowels ={'a','e','a','i','o','u','u'};

        for(char a : vowels) {
            list.add(a);
            set.add(a);
        }

        System.out.println(list);
        System.out.println(set);


    }
    
}
