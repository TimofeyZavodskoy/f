import java.util.ArrayList;

public class Enemy {
    private String name;
    //Характеристики
    public int health;
    public int damage;

    public double min = 0;
    public double max = 1;
    public double stamina;

    public double armor;
    public double accuracy;
    //ArrayList<ItemEnemy> inventoryList = new ArrayList<>();


    Enemy(String name) {
        this.name = name;
        this.armor = 0.54;
        this.health = 250;
        this.damage = 20;
        this.stamina = (double) (Math.random() * (max - min + 1) + min);
        this.accuracy = (double) (Math.random() * (max - min + 1) + min);
    }

}
