import org.example.Dice;
import org.example.Arena;
import org.example.Player;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTests {
    Player playerx;

    @Test
    public void playerInitials() {
        playerx = new Player(100, 50, 30, "A");
        Assert.assertEquals(100, playerx.getHealth());
        Assert.assertEquals(50, playerx.getStrength());
        Assert.assertEquals(30, playerx.getAttacks());
        Assert.assertEquals("A", playerx.getName());
    }

    @Test
    public void reducedHealthCheck() {
        playerx = new Player(100, 50, 30, "A");
        playerx.reducedHealthCalc(40);
        Assert.assertEquals(60, playerx.getHealth());

        playerx.reducedHealthCalc(70);
        Assert.assertEquals(0, playerx.getHealth());

    }

    @Test
    public void isAliveTest() {
        playerx = new Player(100, 50, 30, "A");

        Assert.assertTrue(playerx.playerAlive());

        playerx.reducedHealthCalc(100);
        Assert.assertFalse(playerx.playerAlive());
    }

    @Test
    public void testArenaFight() {
        Player playerA = new Player(50, 5, 10, "A");
        Player playerB = new Player(100, 10, 5, "B");
        Arena arena1 = new Arena(playerA, playerB);
        arena1.fight();
        Assert.assertTrue(!playerA.playerAlive() || !playerB.playerAlive());
    }

    @Test
    public void testDiceRoll() {
        Dice dice = new Dice();
        for (int i = 0; i < 100; i++) {
            int roll = dice.roll();
            Assert.assertTrue(roll >= 1 && roll <= 6);
        }
    }
}

