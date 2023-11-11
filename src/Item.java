import java.util.Random;
public class Item {
    Random rnd = new Random();
    // для игрока
    public int Sword = 44;
    public int Bow =  50;
    public int Crossbow = 90;
    int min = 84;
    int max = 120;
    private int ShotgunDmg = (int) (Math.random() * (max - min + 1) + min);
    public int Shotgun = ShotgunDmg;
    //крит
     double mincrt = 0;
     double maxcrit = 1;
     private double crt = (double) (Math.random() * (maxcrit - mincrt + 1) + mincrt);
     public double CritChance = crt;

     // для узбка
     public int Mech = 24;
    public int Luck =  30;



    double mincrtE = 0;
    double maxcritE = 1;
    //for (double i = 0; i < 1; i++) {
    //    double crtE = min + rnd.nextInt(max - min + 1);



   // }

   /// public double CritChanceE = crtE;


}
