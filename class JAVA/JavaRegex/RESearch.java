package JavaRegex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RESearch {
    public static void main(String[] args) {
        //matches():  matches the entire string 
        // lookingAt(): matches for the beginning of the text only


        String regex = "hello";
        String sentence = "hello i am  saying   this ";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(sentence);

        System.out.println(matcher.matches());
        System.out.println(matcher.lookingAt());
        System.out.println(matcher.find());
        matcher.reset();
        System.out.println(matcher.find());

        //the checker continue from the place where the lookingAt left it , ie the first match wont be matched by find
        
    }
    
}
