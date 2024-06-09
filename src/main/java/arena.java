public class arena
{
    private player playerA;
    private player playerB;
    private Dice dice;

    public arena(player player1,player player2)
    {
        playerA=player1;
        playerB=player2;
        dice=new Dice();
    }

    public void fight()
    {
        while (playerA.playerAlive() && playerB.playerAlive()) {
            if (playerA.getHealth() < playerB.getHealth()) {
                attackValueCalc(playerA, playerB);
                if (playerB.playerAlive()) ;
                attackValueCalc(playerB, playerA);
            } else if ((playerA.getHealth() > playerB.getHealth()))
            {
                attackValueCalc(playerB, playerA);
                if (playerA.playerAlive())
                    attackValueCalc(playerA, playerB);
            }

        }
        if(displayWinner()==1){
            System.out.println("playerA wins");
        }
        else{
            System.out.println("playerB wins");
        }
    }

    public void attackValueCalc(player attacker, player defender) {
        int attackDice = dice.roll();
        int defendDice = dice.roll();
        int p1Attack = attacker.getAttacks()*attackDice;
        int p2Strength = defender.getStrength()*defendDice;

        int reducedHealth = Math.max(0,p1Attack - p2Strength);
        defender.reducedHealthCalc(reducedHealth);
    }

    public int displayWinner()
    {
        int flag=0;
        if(playerA.playerAlive()) {
            flag = 1;

        }
        if(playerB.playerAlive()) {
            flag = 0;
        }
        return flag;
    }
}




