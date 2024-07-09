public class hello2 {
    public static void main(String[] args) {
        byte b = 127;
        short s;
        char c;
        int i;
        long l;
        float f;
        double d;
        // Widening casting
        s = (short) b;
        c = (char) b;
        i = (int) b;
        l = (long) b;
        f = (float) b;
        d = (double) b;
        System.out.println("Byte: " + b);
        System.out.println("byte to short: " + s);
        System.out.println("byte to char: " + c);
        System.out.println("byte to int: " + i);
        System.out.println("byte to long: " + l);
        System.out.println("byte to float: " + f);
        System.out.println("byte to double: " + d);
        // Narrowing casting
        double d1 = 50;
        byte b1;
        f = (float) d1;
        l = (long) d1;
        i = (int) d1;
        c = (char) d1;
        s = (short) d1;
        b1 = (byte) d1;
        System.out.println("Double: " + d1);
        System.out.println("double to float: " + s);
        System.out.println("double to long: " + c);
        System.out.println("double to int: " + i);
        System.out.println("double to char: " + l);
        System.out.println("double to short: " + f);
        System.out.println("double to byte: " + b1);
    }
}