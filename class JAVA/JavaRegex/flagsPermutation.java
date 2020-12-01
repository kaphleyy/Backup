package JavaRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//? use the given input and given pattern to check the working of all compile flags(alone and combined)
// ?String inp = "I dream of softwares\nmore softwares, all day long"
// ?String[] patt ={"softwares.more softwares","wares\nmore","softwares$", "more softwares"};

public class flagsPermutation {
    public static void main(String[] args) {
        String inp = "I dream of softwares\nmore softwares, all day long";
        String[] regex = { "softwares.more softwares", "wares\nmore", "softwares$", "more softwares" };

        int[] flags = { Pattern.CASE_INSENSITIVE, Pattern.COMMENTS, Pattern.DOTALL, Pattern.MULTILINE,
                Pattern.UNIX_LINES, Pattern.CASE_INSENSITIVE | Pattern.COMMENTS, Pattern.COMMENTS | Pattern.DOTALL,
                Pattern.MULTILINE | Pattern.UNIX_LINES, Pattern.CASE_INSENSITIVE | Pattern.DOTALL };

        for (int i = 0; i < regex.length; i++) {
            for (int j = 0; j < flags.length; j++) {
                Pattern p = Pattern.compile(regex[i], flags[j]);
                Matcher m = p.matcher(inp);

                while (m.find()) {
                    System.out.println("Matches " + m.group() + " at (" + m.start() + "," + m.end() + ")\n");
                }
            }

        }
    }

}
