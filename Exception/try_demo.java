package Exception;

public class try_demo {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        int c = a / b;
        System.out.println("The result is: " + c);
    }
}

// public class Exception1 {

//     public static void main(String[] args) {
//         int a = 10;
//         int b = 5;
//         int c = 5;
//         int x = a / (b - c);
//         System.out.println("x = " + x);
//     }
    
// }

// public class Exception2 {
//     public static void main(String[] args){
//         int a = 10;
//         int b = 5;
//         int c = 5;
//         int x;
//         int y;
        
//         try{
//             x = a / (b - c);
//         }
//         catch(ArithmeticException e){
//             System.out.println("Divided by zero");
//         }
//         y = a / (b + c);
//         System.out.println("y = " + y);
//     }
// }

// public class Exception3 {
//     public static void main(String[] args){
//         try{
//             int a = 2;
//             int b = 4;
//             int c = 2;
//             int x = 7;
//             int z;
//             int p[] = {2};
//             p[3] = 33;
//             try{
//                 z = x / ((b * b) - (4 * a *c));
//                     System.out.println("The value of z is = " + z);
//             }
//             catch(ArithmeticException e){
//                 System.out.println("Divided by zero in arithmetic expression");
//             }
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("Array index is out-of-bounds");
//         }
//     }
// }

// public class Exception4 {
//     public static void main(String[] args){
//         int a[] = {5,10};
//         int b = 5;
        
//         try{
//             int x = a[2] / b - a[1];
//         }
//         catch(ArithmeticException e){
//             System.out.println("Division by Zero");
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("Array index error");
//         }
//         catch(ArrayStoreException e){
//             System.out.println("Wrong data type");
//         }
        
//         int y = a[1] / a[0];
//         System.out.println("y = " + y);
//     }
// }

// package exception1;
// import java.lang.Exception;

// class MyException extends Exception{
//         MyException(String message){
//             super(message);
//         }
// }
// public class Exception5 {
//     public static void main(String[] args){
//         int x = 5;
//         int y = 5;
        
//         try{
//             float z = (float) x / (float) y;
//             if(z < 0.01){
//                 throw new MyException("Number is too small");
//             }
//         }
//         catch(MyException e){
//             System.out.println("Caught my exception");
//             System.out.println(e.getMessage());
//         }
//         finally{
//             System.out.println("I am always here");
//         }
//     }
// }


// package exception1;

// public class Exception6 {
//     static void divided_m() throws ArithmeticException{
//         int x = 22;
//         int y = 0;
//         int z;
//         z = x / y;
//     }
//     public static void main(String[] args){
//        try{
//            divided_m();
//        } 
//        catch(ArithmeticException e){
//            System.out.println("Caught the exception" + e);
//        }
//     }
// }
