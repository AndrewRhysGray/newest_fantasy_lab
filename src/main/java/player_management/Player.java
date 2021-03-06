package player_management;

public abstract class Player {
    String name;
    int healthPoints;

    public Player(String name, int healthPoints){
        this.name = name;
        this.healthPoints = healthPoints;
    }
    public String getName(){
        return this.name;
    }
    public int getHealthPoints(){
        return this.healthPoints;
    }

}

