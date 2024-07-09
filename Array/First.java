//package Array;

public class First {
    final static int ROWS = 0;
    final static int COLUMN = 20;
    public static void main(String[] args) {

        int marks[] = new int[5];
        marks[0] = 100;
        marks[1] = 68;
        marks[2] = 78;
        marks[3] = 90;
        marks[4] = 66;
        System.out.println(marks[4]);

        int marks1[] = {10,20,30,40,50,60};
        System.out.println(marks1[1]);

        int marks2[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(marks2[0]);
        System.out.println(marks2.length);

        float marks3[] = {1.1f,2.2f,3.3f,4.4f,5.5f,6.6f};
        System.out.println(marks3[2]);
        System.out.println(marks3.length);

        System.out.println("Using foreach loop");

        int marks4[] = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < marks4.length; i ++) {
            System.out.println(marks4[i]);
        }

        //shorting list array
        int number1[] = {55,40,80,65,71};
        System.out.print("Given list");
        for (int i1 = 0; i1 < number1.length; i1 ++) {
            System.out.print(" " + number1[i1]);
        }
        System.out.println(" ");
        for (int i = 0; i < number1.length; i++) {
            for (int j = i + 1; j < number1.length; j ++) {
                if (number1[i] < number1[j]) {
                    int temp = number1[i];
                    number1[i] = number1[j];
                    number1[j] = temp;
                }
            }
        }
        System.out.print("Shorted list");
        for (int i = 0; i < number1.length; i ++) {
            System.out.print(" " + number1[i]);
        }
        System.out.println(" ");

        //two dimension array
        
        int product [][] = new int [ROWS][COLUMN];
        int row, column;
        int i, j;
        for (i = 10; i < ROWS; i ++) {
            for (j = 10; j < COLUMN; j ++) {
                product[i][j] = i*j;
                System.out.print(" " + product[i][j]);
            }
            System.out.print("");
        }

        int array [][] = {{10,20},{30,40}};
        for (int i2 = 0; i2 < 2; i2++) {
            for (int j2 = 0; j2 < 2; j2++) {
                System.out.print(array[i2][j2] + " ");
            }
            System.out.println(" ");
        }
    }
}
