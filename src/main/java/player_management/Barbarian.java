package player_management;

public class Barbarian extends Player {

    String weapon;

    public Barbarian(String name, int healthPoints, String weapon){
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public String getWeapon(){
        return this.weapon;
    }

}
