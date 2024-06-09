package org.example;


public class Main
{
    public static void main(String[] args) {
        player playerA = new player(50, 5, 10);
        player playerB = new player(100, 10, 5);
        arena arena1 = new arena(playerA, playerB);
        arena1.fight();
    }
}
