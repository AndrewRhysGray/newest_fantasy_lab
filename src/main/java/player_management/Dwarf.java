package player_management;

public class Dwarf extends Player {

    String weapon;

    public Dwarf(String name, int healthPoints, String weapon) {
        super(name, healthPoints);

        this.weapon = weapon;
    }

    public String getWeapon(){
        return this.weapon;
    }

}