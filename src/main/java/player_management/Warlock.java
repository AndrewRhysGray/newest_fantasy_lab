package player_management;

public class Warlock extends Player {

    String spell;
    String mythicalCreature;

    public Warlock(String name, int healthPoints, String spell, String mythicalCreature){
        super(name, healthPoints);

        this.spell = spell;
        this.mythicalCreature = mythicalCreature;
    }

    public String getSpell(){
        return this.spell;
    }

    public String getMythicalCreature(){
        return this.mythicalCreature;
    }


}
