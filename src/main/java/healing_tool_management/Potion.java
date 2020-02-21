package healing_tool_management;

public class Potion extends HealingTool {

    public Potion(String name, int healingPower) {
        super(name, healingPower);
    }

    public String getName() {
return this.name;
    }

    public int getHealingPower(){
        return this.healingPower;
    }

}
