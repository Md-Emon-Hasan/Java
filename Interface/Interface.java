interface Bycicle {
    void applyBreak(int decrement);
    void applySpeed(int increment);
}

class AvonCycle implements Bycicle{
    void blowhorn(){
        System.out.println("pee pee poo poo");
    }
    public void applyBreak(int decrement){
        System.out.println("Applying Break");
    }
    public void applySpeed(int increment){
        System.out.println("Applying Speed");
    }
}

public class Interface {
    public static void main(String[] args) {
        AvonCycle cycleEmon = new AvonCycle();
        cycleEmon.applyBreak(1);
    }
}
