interface Batter{
    void BabarAzam();
    void MohammadRizwan();
    int computeRun(int Babar, int Rizwan);
}

interface Bowler{
    void ShaheenAfridi();
    void MohammadAamir();
    int computeWicket(int Afridi, int Aamir);
}

interface AllRounder{
    void MohammadHafeez(int increment);
    void ShoaibMalik(int decrement);
}

class Team implements Batter, Bowler, AllRounder{
    void present(){
        System.out.println("Welcome to Team");
    }
    public void BabarAzam(){
        System.out.println("Best Batter Babar");
    }
    public void MohammadRizwan(){
        System.out.println("Batter Rizwan");
    }
    public int computeRun(int Babar, int Rizwan){
        return (Babar + Rizwan);
    }
    public void ShaheenAfridi(){
        System.out.println("Best Bowler Afridi");
    }
    public void MohammadAamir(){
        System.out.println("Bowler Amir");
    }
    public int computeWicket(int Afridi, int Aamir){
        return(Afridi + Aamir);
    } 
    public void MohammadHafeez(int increment){
        System.out.println("Best All-rounder Hafeez");
    }
    public void ShoaibMalik(int decrement){
        System.out.println("All-rounder Malik");
    }
}

class emon1{
    public static void main(String[] args) {
        Team team = new Team();
        team.BabarAzam();
        team.MohammadRizwan();
        System.out.println("Total Opening Run: " + team.computeRun(110, 88));
        team.ShaheenAfridi();
        team.MohammadAamir();
        System.out.println("Total Wicket: " + team.computeWicket(3, 2));
        team.MohammadHafeez(5);
        team.ShoaibMalik(5);
    }
}