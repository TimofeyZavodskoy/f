import java.util.ArrayList;

public class Enemy {
    private String EnemyName;

    public int EnemyHealth;
    public int EnemyDamage;
    public double EnemyStamina;

    public double EnemyArmor;
    public double EnemyAccuracy;



    Enemy(String EName, int EHealth, int EDmg, double EStam, double EArm, double EAcc) {
        this.EnemyName = EName;
        this.EnemyHealth = EHealth;
        this.EnemyDamage = EDmg;
        this.EnemyStamina = EStam;
        this.EnemyArmor = EArm;
        this.EnemyAccuracy = EAcc;
    }

}
