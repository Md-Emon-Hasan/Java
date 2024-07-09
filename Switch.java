public class Switch{
    public static void main(String[] args){
        int myNumber = 10;
        switch(myNumber){
            case 2:
                System.out.println("Two");
                    break;
            case 5:
                System.out.println("Five");
                    break;
            case 10:
                System.out.println("Ten");
                    break;
            case 1:
                System.out.println("One");
                    break;
            case 8:
                System.out.println("Eight");
                    break;
            default:
                System.out.println("Invalid Number");
        }
    }
}