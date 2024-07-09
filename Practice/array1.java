public class array1{

    final static int ROWS = 0;
    final static int COLUMN = 20;
    public static void main(String[] args) {
        int number[] = new int[5];
        number[0] = 10;
        number[1] = 12;
        number[2] = 14;
        number[3] = 16;
        number[4] = 18;
        System.out.println("Your number is: " + number[2]);
        System.out.println("Your number is: " + number[4]);

        System.out.println("Shorting list of number");

        int number1[] = {10,12,14,16,18,20};
        for (int i = 0; i < number1.length; i++) {
            for (int j = i + 1; j <  number1.length; j++) {
                if (number1[i] < number1[j]) {
                    int temp = number1[i];
                    number1[i] = number1[j];
                    number1[j] = temp; 
                }
            }
        }
        System.out.print("Shorting list:");
        for (int i = 0; i < number1.length; i++) {
            System.out.print(" " + number1[i]);
        }

        System.out.println("Application of two dimention array");

        int product[][] = new int [ROWS][COLUMN];
        for (int i = 10; i < ROWS; i++) {
            for (int j = 10; j < COLUMN; j++) {
                product[i][j] = i*j;
                System.out.println(" " + product[i][j]);
            }
        }

        System.out.println("Two dimention array example");

        int number2 [][] = {{10, 20}, {30, 40}};
        for (int i = 0; i < number2.length; i++) {
            for (int j = 0; j < number2.length; j++) {
                System.out.print(" " + number2[i][j]);
            }
            System.out.println(" ");
        }

        System.out.println("Shorting list of character");

        String ch [] = {"emon", "habib", "arman"};
        String temp = null;
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j > ch.length; j++) {
                if (ch[i].compareTo(ch[j]) < 0) {
                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }

    }
}