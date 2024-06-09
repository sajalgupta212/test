package org.example;

public class player {
    private int health;
    private int strength;
    private int attacks;

    public player(int h,int s, int a){
        health=h;
        strength=s;
        attacks=a;
    }

    public int getHealth()
    {
        return health;
    }

    public int getStrength()
    {
        return strength;
    }

    public int getAttacks()
    {
        return attacks;
    }

    public void reducedHealthCalc(int damage)
    {
        health=Math.max(0,health-damage);
    }

    public boolean playerAlive()
    {
        return health>0;
    }
}
