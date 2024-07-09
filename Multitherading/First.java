package Multitherading;

// class A extends Thread{
//     public void run(){
//         for (int i = 1; i < 5; i++) {
//             System.out.println("From Thread A: " + i);
//         }
//         System.out.println("Exit From A");
//     }
// }

// class B extends Thread{
//     public void run(){
//         for (int j = 1; j < 5; j++) {
//             System.out.println("From Thread B: " + j);
//         }
//         System.out.println("Exit From B");
//     }
// }

// class C extends Thread{
//     public void run(){
//         for (int k = 1; k < 5; k++) {
//             System.out.println("From Thred C:" + k);
//         }
//         System.out.println("Exit From C");
//     }
// }

// public class First{
    
//     public static void main(String[] args) {
//         new A().start();
//         new B().start();
//         new C().start();
//     }
    
// }


//     class E extends Thread{
//         public void run(){
//            for(int i = 1; i < 5; i++){
//                System.out.println("From Thraed E: " + i);
//            } 
//             System.out.println("Exit From E");
//         }
//     }

//     class F extends Thread{
//         public void run(){
//             for(int j = 1; j < 5; j++){
//                 System.out.println("From Thred F:" + j);
//             }
//             System.out.println("Exit From F");
//         }
//     }

//     class G extends Thread{
//         public void run(){
//             for(int g = 1; g < 5; g++){
//                 System.out.println("From Thread J: " + g);
//             }
//             System.out.println("Exit From G");
//         }
//     }

// public class First {
//     public static void main(String[] args){
//         new E().run();
//         new F().run();
//         new G().run();
//     }
// }


// package multithreading1;

// class A1 extends Thread{
//     public void run(){
//         for(int i = 1; i < 5; i++){
//             if(i == 1) yield();
//             System.out.println("From Thread A1 : i = " +i);
//         }
//         System.out.println("Exit from A");
//     }
// }

// class B1 extends Thread{
//     public void run(){
//         for(int j = 1; j < 5; j++){
//             System.out.println("From Thraed B : j = " + j);
//             if(j == 3) stop();
//         }
//         System.out.println("Exit from B");
//     }
// }

// class C1 extends Thread{
//     public void run(){
//         for(int k = 1; k < 5; k++){
//             System.out.println("From Thraed C : k = " + k);
//             if(k == 1)
//                 try{
//                     sleep(2000);
//                 }
//                 catch(Exception e){
                
//                 }
//         }
//         System.out.println("Exit from C");
//     }
// }

// public class Multithreading3 {
//     public static void main(String[] args){
//         A1 threadA = new A1();
//         B1 threadB = new B1();
//         C1 threadC = new C1();
//         System.out.println("Start thread A: ");
//         threadA.start();
//         System.out.println("Start thread B: ");
//         threadB.start();
//         System.out.println("Start thread C: ");
//         threadC.start();
//     }
// }


// package multithreading1;

// class A4 extends Thread{
//     public void run(){
//         System.out.println("threadA started");
//         for(int i = 1; i < 5; i++){
//             System.out.println("From thread A : i = " + 1);
//         }
//         System.out.println("Exit from A");
//     }
// }

// class B4 extends Thread{
//     public void run(){
//         System.out.println("threadB started");
//         for(int j = 5; j < 5; j++){
//             System.out.println("from thread B : j = " + j);
//         }
//         System.out.println("Exit from B");
//     }
// }

// class C4 extends Thread{
//     public void run(){
//         System.out.println("threadC started");
//         for(int k = 1; k < 5; k++){
//             System.out.println("from thread C : k = " + k);
//         }
//     }
// }

// public class Multithredaing4 {
//     public static void main(String[] args){
//         A4 threadA = new A4();
//         B4 threadB = new B4();
//         C4 threadC = new C4();
        
//         threadC.setPriority(Thread.MAX_PRIORITY);
//         threadB.setPriority(threadA.getPriority()+1);
//         threadC.setPriority(Thread.MIN_PRIORITY);
        
//         System.out.println("Start thread A");
//         threadA.start();
//         System.out.println("Start thread B");
//         threadB.start();
//         System.out.println("Start thread C");
//         threadC.start();
//         System.out.println("End of main thread");
//     }
    
// }

