public class First_String{
    public static void main(String[] args) {
        // method 1
        String e1 = "emon";
        System.out.println(e1);
        // method 2
        char ch[] = {'e', 'm', 'o', 'n'};
        String e2 = new String(ch);
        System.out.println(e2);
        // method 3
        String e3 = new String("emon");
        System.out.println(e3);

        // check the length of string
        String length = "emon";
        int value = length.length();
        System.out.println(value);
        System.out.println(length.length());

        // convert to lowercase
        String lowercase = "emon";
        String lString = lowercase.toLowerCase();
        System.out.println(lString);
        System.out.println(lowercase.toLowerCase());

        // conver to uppercase
        String uppercase = "emon";
        String uString = uppercase.toUpperCase();
        System.out.println(uString);
        System.out.println(uppercase.toUpperCase());

        // usign trim function to remove white space
        // without trim function
        String withoutTrim = "    emon";
        System.out.println(withoutTrim);
        // using trim function
        String trim = "    emon";
        String usunTrim = trim.trim();
        System.out.println(usunTrim);
        System.out.println(trim.trim());

        // using substring function
        String subString = "Bangladesh";
        String subString2 = subString.substring(1);
        System.out.println(subString2);
        System.out.println(subString.substring(1));
        String subString3 = subString.substring(1, 5);
        System.out.println(subString3);
        System.out.println(subString.substring(1, 5));

        // using replace function
        String replace = "Welocom to Bangladesh";
        String replace1 = replace.replace("Bangladesh", "Dhaka");
        System.out.println(replace1);
        System.out.println(replace.replace("Bangladesh", "Dhaka"));

        // using charAt function for index value
        String charAt = "emon";
        System.out.println(charAt.charAt(3));

        // using equals function
        String equals = "emon";
        System.out.println(equals.equals("emon"));
        System.out.println(equals.equals("hasan"));
        System.out.println(equals.equalsIgnoreCase("Emon"));

        // using isempty function
        String isempty = "Hello";
        String isempty1 = "";
        System.out.println(isempty.isEmpty());
        System.out.println(isempty1.isEmpty());

        // using contains function
        String contains = "bangladesh";
        System.out.println(contains.contains("hello"));
        System.out.println(contains.contains("hi"));
        System.out.println(contains.contains("bangladesh"));

        // using concat function for add two string
        String fname = "Emon";
        String lname = "Hasan";
        System.out.println(fname + " " .concat(lname));
    }
}