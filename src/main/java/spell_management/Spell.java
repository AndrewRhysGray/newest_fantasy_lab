package spell_management;

public abstract class Spell {

    String name;
    int attackDamage;

    public Spell(String name, int attackDamage) {
        this.name = name;
        this.attackDamage = attackDamage;
    }

}