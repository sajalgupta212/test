package org.example;

public class Player {
    private int health;
    private int strength;
    private int attacks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return "Player{" +
                "health=" + health +
                ", strength=" + strength +
                ", attacks=" + attacks +
                ", name='" + name + '\'' +
                '}';
    }

    public Player(int h, int s, int a, String playerName) {
        health = h;
        strength = s;
        attacks = a;
        name = playerName;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getAttacks() {
        return attacks;
    }

    public void reducedHealthCalc(int damage) {
        health = Math.max(0, health - damage);
    }

    public boolean playerAlive() {
        return health > 0;
    }
}
