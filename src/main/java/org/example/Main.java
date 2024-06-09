package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Player1 name");
        String player1Name = sc.nextLine();
        System.out.println("enter Player2 name");
        String player2Name = sc.nextLine();
        System.out.println("Do you want to enter player(s) attributes? (Y/N)");
        String choice = sc.nextLine();

        Player playerA = new Player(50, 5, 10, player1Name);
        Player playerB = new Player(100, 10, 5, player2Name);

        if ("y".equalsIgnoreCase(choice)) {
            System.out.println("Enter Player 1 Attributes");
            System.out.println("enter Player1 Health");
            int player1Health = sc.nextInt();
            System.out.println("enter Player1 Strength");
            int player1Strength = sc.nextInt();
            System.out.println("enter Player1 Attack");
            int player1Attack = sc.nextInt();

            System.out.println("Enter Player 2 Attributes");
            System.out.println("enter Player2 Health");
            int player2Health = sc.nextInt();
            System.out.println("enter Player2 Strength");
            int player2Strength = sc.nextInt();
            System.out.println("enter Player2 Attack");
            int player2Attack = sc.nextInt();
            playerA=new Player(player1Health,player1Strength,player1Attack,player1Name);
            playerB=new Player(player2Health,player2Strength,player2Attack,player2Name);

        }


        Arena arena1 = new Arena(playerA, playerB);
        arena1.fight();

    }
}
