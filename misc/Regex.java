import java.util.regex.*;

class Main {
    public static void main (String[] args) {
        Pattern pattern = Pattern.compile("hello world", Pattern.CASE_INSENSITIVE);

        /* RegEx for FIRST PARAMETER of compile()
         *
         * [xyz] find one character in between []
         * [^xyz] find one character NOT in between []
         * [0-9] find character 0-9
         *
         * METACHARS:
         * x|y|z


        Matcher matcher = pattern.matcher("Say Hello World!");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("match found");
        }

        else {
            System.out.println("not found");
        }
    }
}
