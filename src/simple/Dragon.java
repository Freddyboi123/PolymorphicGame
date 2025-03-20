package simple;

import java.util.Random;

public class Dragon implements Creature {

    int health;
    String name;
    Random random = new Random();

    public Dragon(String name) {
        this.health = random.nextInt(8,12);
        this.name = name;
    }

    @Override
    public int attack() {
        return random.nextInt(5,7);
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String meet() {
        return "from the sky a veiny green dildo cums thundering";
    }
}
