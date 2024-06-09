package org.example;

public class Arena {
    private Player playerA;
    private Player playerB;
    private Dice dice;

    public Arena(Player player1, Player player2) {
        this.playerA = player1.getHealth() > player2.getHealth() ? player2 : player1;
        this.playerB = player1.getHealth() > player2.getHealth() ? player1 : player2;
        dice = new Dice();
    }

    public void fight() {

        while (playerA.playerAlive() && playerB.playerAlive()) {
            attackValueCalc(playerA, playerB);
            if (playerB.playerAlive())
                attackValueCalc(playerB, playerA);
            else break;
            attackValueCalc(playerB, playerA);
            if (playerA.playerAlive())
                attackValueCalc(playerA, playerB);
        }

        if (displayWinner() == 1) {
            System.out.println(playerA.getName()+" wins");
        } else {
            System.out.println(playerB.getName()+" wins");
        }
    }

    public void attackValueCalc(Player attacker, Player defender) {
        int attackDice = dice.roll();
        int defendDice = dice.roll();
        int p1Attack = attacker.getAttacks() * attackDice;
        int p2Strength = defender.getStrength() * defendDice;

        System.out.println("attacker:" + p1Attack + " " + attacker.toString());
        System.out.println("defender:" + p2Strength + " " + defender.toString());
        defender.reducedHealthCalc(Math.max(0, p1Attack - p2Strength));
        System.out.println("-->defender:" + p2Strength + " " + defender.toString() + "\n");
    }

    public int displayWinner() {
        int flag = 0;
        if (playerA.playerAlive()) {
            flag = 1;
        }
        if (playerB.playerAlive()) {
            flag = 0;
        }
        return flag;
    }
}




