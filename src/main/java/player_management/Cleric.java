package player_management;

public class Cleric extends Player {

    String healingTool;

    public Cleric(String name, int healthPoints, String healingTool){
        super(name, healthPoints);
        this.healingTool = healingTool;
    }
    public String hasHealingTool(){
        return this.healingTool;
    }
}


