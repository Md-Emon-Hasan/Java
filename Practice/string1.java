public class string1 {
    public static void main(String[] args) {
        // declaration method 1
        String ch = new String("Emon");
        System.out.println(ch);
        // declaration method 2
        String ch1 = ("Emon");
        System.out.println(ch1);
        // declaration method 3
        char ch2[] = {'e','m','o','n'};
        String ch3 = new String(ch2);
        System.out.println(ch3);
        
        // check the length of string
        String CheckLen = ("Hello");
        System.out.println(CheckLen.length());
        int CheckLen1 = CheckLen.length();
        System.out.println(CheckLen1);

        // convert to lowercase
        String lowerCase = ("EmOn");
        String lowerCase1 = lowerCase.toLowerCase();
        System.out.println(lowerCase1);
        System.out.println(lowerCase.toLowerCase());

        // convert to uppercase
        String upperCase = ("emon");
        String upperCase1 = upperCase.toUpperCase();
        System.out.println(upperCase1);
        System.out.println(upperCase.toUpperCase());

        // using trim function to remove white space
        String Trim = ("   Emon");
        String Trim1 = Trim.trim();
        System.out.println(Trim1);
        System.out.println(Trim.trim());
        System.out.println("Without Trim:");
        String WTrim = ("   emon");
        String WTrim1 = WTrim;
        System.out.println(WTrim);
        System.out.println(WTrim1);

        // using substring
        String subString = ("bangladesh");
        String subString1 = subString.substring(1);
        System.out.println(subString.substring(1));
        System.out.println(subString1);
        String subString2 = subString.substring(1,5);
        System.out.println(subString2);
        System.out.println(subString.substring(1,5));

        // using replace function
        String replace = ("How are you");
        String replace1 = (replace.replace("are","old are"));
        System.out.println(replace.replace("are","old are"));
        System.out.println(replace1);

        // using chatAt function for index value
        String chatAt = ("bangladesh");
        System.out.println(chatAt.charAt(3));

        // using equals function
        String equals = ("bangladesh");
        System.out.println(equals.equals("hello"));
        System.out.println(equals.equals("bangladesh"));

        // is isempty function
        String isempty = "hello";
        String isempty1 = "";
        System.out.println(isempty.isEmpty());
        System.out.println(isempty1.isEmpty());

        // using contains function
        String contains = ("bangladesh");
        System.out.println(contains.contains("hello"));
        System.out.println(contains.contains("bangladesh"));

        // using concatination in java
        String fname = ("bangla");
        String lname = ("desh");
        String all1 = (fname.concat(lname));
        System.out.println(all1);
        System.out.println(fname.concat(lname));
        String fname1 = ("emon");
        String all = (fname1.concat(" hasan"));
        System.out.println(all);
        System.out.println(fname1.concat(" hasan"));
    }
}
