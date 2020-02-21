import org.junit.Before;
import org.junit.Test;
import player_management.Barbarian;

import static junit.framework.TestCase.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before() {
       barbarian = new Barbarian("Steve", 20, "sword");
    }

    @Test
    public void hasName() {
        assertEquals("Steve", barbarian.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(20, barbarian.getHealthPoints());
    }

    @Test
    public void hasWeapon(){ assertEquals("sword", barbarian.getWeapon());}

}
