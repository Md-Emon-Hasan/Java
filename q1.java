public class q1 {
    class Animal{
        String name;
        public void eat(){
            System.out.println("I can Eat");
        }
    }

    class Dog extends Animal{
        public void display(){
            System.out.println("My name is" + name);
        }
    }

    class Main{
        public static void main(String[] args){
            Dog labrador = new Dog();

            labrador.name = "Ruhu";
            labrador.display();

            labrador.eat();
        }
    }
}
