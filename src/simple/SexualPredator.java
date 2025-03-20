package simple;

import java.util.Random;

public class SexualPredator implements Creature {

    int health;
    String name;
    Random random = new Random();

    public SexualPredator(String name) {
        this.health = random.nextInt(10,15);
        this.name = name;
    }

    @Override
    public int attack() {
        boolean hasBoner = false;
        int hasbonerDef =  random.nextInt(10);
        if (hasbonerDef <= 3){
            hasBoner = true;
        }
        if (hasBoner) {
            System.out.println(this.name + " uses dick slap with a hard stiffy!");
            return random.nextInt(8, 12);
        } else {

            System.out.println(this.name + " uses Dick slap with a soft boy");
            return random.nextInt(0, 2);
        }
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
        return "from the depths of Epstein island a predator comes thundering";
    }
}
