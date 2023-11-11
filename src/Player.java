public class Player {
  private String name;
  //Характеристики
  public int health;
  public int damage;

  public double min = 0;
  public double max = 1;
  public double stamina;

  public double armor;
  public double accuracy;
  // инвентарь
 // ArrayList<Item> inventoryList = new ArrayList<>();


  Player(String name){
    this.name = name;
    this.armor = 0.85;
    this.health = 120;
    this.damage = 60;
    this.stamina = (double) (Math.random()*(max-min+1)+min);
    this.accuracy = (double) (Math.random()*(max-min+1)+min);

  }
}
