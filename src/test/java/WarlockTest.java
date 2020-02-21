import org.junit.Before;
import org.junit.Test;
import player_management.Warlock;

import static junit.framework.TestCase.assertEquals;

public class WarlockTest {
    Warlock warlock;

    @Before
    public void before(){
        warlock = new Warlock("Stephen", 50, "freeze", "ogre" );
    }

    @Test
    public void hasName(){
        assertEquals("Stephen", warlock.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(50, warlock.getHealthPoints());
    }

    @Test
    public void hasSpell(){ assertEquals("freeze", warlock.getSpell());}

    @Test
    public void hasMythicalCreature(){ assertEquals("ogre", warlock.getMythicalCreature());}
}

