import org.junit.Before;
import org.junit.Test;
import player_management.Dwarf;

import static junit.framework.TestCase.assertEquals;

public class DwarfTest {
    Dwarf dwarf;

    @Before
    public void before() {
        dwarf = new Dwarf("Luca", 30, "spear");
    }
    @Test
    public void hasName(){
        assertEquals("Luca", dwarf.getName());
    }
    @Test
    public void hasHealthPoints(){
        assertEquals(30, dwarf.getHealthPoints());
    }
    @Test
    public void hasWeapon(){
        assertEquals("spear", dwarf.getWeapon());
    }
}
