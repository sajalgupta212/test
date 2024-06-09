import org.testng.Assert;
import org.testng.annotations.Test;

public class unitTests {
    @Test
    public void playerInitials() {
        player playerx = new player(100, 50, 30);
        Assert.assertEquals(100, playerx.getHealth());
        Assert.assertEquals(50, playerx.getStrength());
        Assert.assertEquals(30, playerx.getAttacks());
    }

    @Test
    public void reducedHealthCheck() {
        player playerx = new player(100, 50, 30);

        playerx.reducedHealthCalc(40);
        Assert.assertEquals(60, playerx.getHealth());

        playerx.reducedHealthCalc(70);
        Assert.assertEquals(0, playerx.getHealth());

    }

    @Test
    public void isAliveTest() {
        player playerx = new player(100, 50, 30);

        Assert.assertTrue(playerx.playerAlive());

        playerx.reducedHealthCalc(100);
        Assert.assertFalse(playerx.playerAlive());
    }

    @Test
    public void testArenaFight() {
        player playerA = new player(50, 5, 10);
        player playerB = new player(100, 10, 5);
        arena arena1 = new arena(playerA, playerB);
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

