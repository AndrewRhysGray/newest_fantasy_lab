package player_management;

public class Knight extends Player {

    String weapon;

    public Knight(String name, int healthPoints, String weapon) {
        super(name, healthPoints);
        this.weapon = weapon;

    }
    public String getWeapon(){
        return this.weapon;
    }
}

