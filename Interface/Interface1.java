interface Bycicle {
    void applyBreak(int decrement);
    void applySpeed(int increment);
}

interface HornBycicle{
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bycicle, HornBycicle{
    void blowhorn(){
        System.out.println("pee pee poo poo");
    }
    public void applyBreak(int decrement){
        System.out.println("Applying Break");
    }
    public void applySpeed(int increment){
        System.out.println("Applying Speed");
    }
    public void blowHornK3g(){
        System.out.println("Kabhi khusi kabhi ghum");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon na");
    }
}

public class Interface1 {
    public static void main(String[] args) {
        AvonCycle cycleEmon = new AvonCycle();
        cycleEmon.applyBreak(1);
        cycleEmon.blowHornK3g();
        cycleEmon.blowHornmhn();
    }
}
