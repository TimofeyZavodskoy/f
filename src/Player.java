public class Player {
  private String PlayerName;
  //Характеристики
  public int PlayerHealth;
  public int PlayerDamage;

  public double PlayerStamina;

  public double PlayerArmor;
  public double PlayerAccuracy;



  Player(String PName,double PArm, int PDmg, double PStm, double PAcur, int PHealth){
    this.PlayerName = PName;
    this.PlayerArmor = PArm;
    this.PlayerHealth = PHealth;
    this.PlayerDamage = PDmg;
    this.PlayerStamina = PStm;
    this.PlayerAccuracy = PAcur;

  }
}
