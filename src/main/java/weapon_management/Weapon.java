package weapon_management;

public abstract class  Weapon {

    String name;
    int attackDamage;

    public Weapon(String name, int attackDamage) {
        this.name = name;
        this.attackDamage = attackDamage;
    }
}