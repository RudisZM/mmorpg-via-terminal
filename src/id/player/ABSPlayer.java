package id.player;

public abstract class ABSPlayer {
    private String name = null;
    private int health = 0;
    private int physicalAttackPower = 0;
    private int magicalAttackPower = 0;
    private int physicalDefensePower = 0;
    private int magicalDefensePower = 0;

    ABSPlayer(String name) {
        this.name = name;
    }

    // method seter and getter
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int geHealth() {
        return this.health;
    }
    public void setPhysicalAttackPower(int physicalAttackPower) {
        this.physicalAttackPower = physicalAttackPower;
    }
    public int getPhysicalAttackPower() {
        return this.physicalAttackPower;
    }
    public void setMagicalAttackPower(int magicalAttackPower){
        this.magicalAttackPower = magicalAttackPower;
    }
    public int getMagicalAttackPower() {
        return this.magicalAttackPower;
    }
    public void setPhysicalDefensePower(int physicalDefensePower) {
        this.physicalDefensePower = physicalDefensePower;
    }
    public int getPhysicalDefensePower() {
        return this.physicalDefensePower;
    }
    public void setMagicalDefensePower(int magicalDefensePower)  {
        this.magicalDefensePower = magicalDefensePower;
    }
    public int getMagicalDefenfePower() {
        return this.magicalDefensePower;
    }

    public void showInfoPlayer() {
        System.out.println("Name\t\t\t: " + this.name);
        System.out.println("Health\t\t\t: " + this.health);
        System.out.println("Physical Attack\t\t: " + this.physicalAttackPower);
        System.out.println("Magical Attack\t\t: " + this.magicalAttackPower);
        System.out.println("Physical Defense\t: " + this.physicalDefensePower);
        System.out.println("Magical Defense\t\t: " + this.magicalDefensePower);
    }
}
