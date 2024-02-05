package id.player;

public class Player extends ABSPlayer {
   public Player(String name) {
    super(name);

    this.setName(name);
    this.setHealth(1000);
    this.setPhysicalAttackPower(50);
    this.setMagicalAttackPower(0);
    this.setPhysicalDefensePower(10);
    this.setMagicalDefensePower(0);
   } 
}
