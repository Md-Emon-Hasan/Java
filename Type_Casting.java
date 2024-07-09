public class Type_Casting {
    public static void main(String[] args){
        // Declearing Variable
        byte b = 127;
        short s;
        char c;
        int i;
        long l;
        float f;
        double d;

        // Widening Casting
        s = (short) b;
        c = (char) b;
        i = (int) b;
        l = (long) b;
        f = (float) b;
        d = (double) b;
        
        // Print the value
        System.out.println("Byte only:" + b);
        System.out.println("Byte to short:" + s);
        System.out.println("Byte to char:" + c);
        System.out.println("Byte to int:" + i);
        System.out.println("Byte to long:" + l);
        System.out.println("Byte to float:" + f);
        System.out.println("Byte to double:" + d);

        // Declearing Variable
        double d1 = 127;
        byte b1;

        //Narrowing Casting
        f = (float) d1;
        l = (long) d1;
        i = (int) d1;
        c = (char) d1;
        s = (short) d1;
        b1 = (byte) d1;

        // Print the value
        System.out.println("Double only:" + d1);
        System.out.println("Double to float:" + f);
        System.out.println("Double to long:" + l);
        System.out.println("Double to int:" + i);
        System.out.println("Double to char:" + c);
        System.out.println("Double to short:" + s);
        System.out.println("Double to byte:" + b1);
    }
}
