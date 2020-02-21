package spell_management;

public class Freeze extends Spell {
    public Freeze(String name, int attackDamage){
        super(name, attackDamage);
    }

    public String getName(){
        return this.name;
    }

    public int getAttackDamage(){
        return this.attackDamage;
    }
}
