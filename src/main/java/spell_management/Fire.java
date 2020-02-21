package spell_management;

public class Fire extends Spell {
    public Fire(String name, int attackDamage){
        super(name, attackDamage);
    }

    public String getName(){
        return this.name;
    }

    public int getAttackDamage(){
        return this.attackDamage;
    }

}
