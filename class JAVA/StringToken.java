import java.util.StringTokenizer;
// class to break strings into tokens

public class StringToken {
    
    public static void main(String[] args) {

// const. 1 : StringTokenizer(String) =>creates an tokenizer object from the specified string
// the object divides the string taking a space as a delimiter
        // hasMoreTokens() or hasMoreElements() : checks whether there are more tokens in the tokenizer 
        // next() : returns next token of the object as a string
        // nextElement() : returns next token as a object
        StringTokenizer token = new StringTokenizer("This.is.the string tokenizer", " .", true);
// last true is ask whether to return delimeter as a token or not
        System.out.println(token.countTokens());
        while(token.hasMoreTokens()) {
            System.out.println(token.nextToken());
        }
        System.out.println(token.countTokens());

    }
    
}
