import java.util.Random;

public class Items {
   //предметы для игрока
    public int Sword = 44;
    public int Bow = 50;
    public int Crossbow = 90;
    public int Shotgun;
    public double CritChance;

    // предметы для нпс
    public int Mech = 24;
    public int Luck = 30;
    public double CritChanceE;

    public Items() {

        int max = 120;
        int min = 65;
        Random rnd = new Random();
        Shotgun = rnd.nextInt(max - min + 1) + min;

        // криты для игрока
        double mincrt = 0;
        double maxcrit = 1;
        CritChance = rnd.nextDouble() * (maxcrit - mincrt) + mincrt;
        // криты для непися
        double mincrtE = 0;
        double maxcritE = 1;
        CritChanceE = rnd.nextDouble() * (maxcritE - mincrtE) + mincrtE;
    }
}