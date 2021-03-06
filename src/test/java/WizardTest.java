import org.junit.Before;
import org.junit.Test;
import player_management.Wizard;

import static junit.framework.TestCase.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before() {
        wizard = new Wizard("Andrew", 60, "fire", "dragon");
    }

    @Test
    public void hasName() {
        assertEquals("Andrew", wizard.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(60, wizard.getHealthPoints());
    }

    @Test
    public void hasSpell() {
        assertEquals("fire", wizard.getSpell());
    }
    @Test
    public void hasMythicalCreature() {
        assertEquals("dragon", wizard.getMythicalCreature());
    }

}