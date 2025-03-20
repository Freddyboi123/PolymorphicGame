package simple;

import java.util.ArrayList;
import java.util.Random;


public class CreatureGenerator {

    private ArrayList<Creature> creatures = new ArrayList<>();

    public CreatureGenerator(){
        generateCreatures();
    }

    public void generateCreatures() {
       /* creatures.add(new Spider("Daddy Freakylegs"));
        creatures.add(new Dragon("SilverDragon Slut cuck"));
        creatures.add(new Spider("Lille Peter Eddy Betty"));
        creatures.add(new Dragon("Goon lord"));*/
        creatures.add(new SexualPredator("Jeffry Epstein"));
      // creatures.add(new SexualPredator("Bill Cosby"));
      // creatures.add(new SexualPredator("Lars Løkke Rasmussen"));
       //creatures.add(new SexualPredator("P. Diddy"));

    }

    public Creature getRandomCreature() {
        Random r = new Random();
        int i = r.nextInt(creatures.size());
        return creatures.get(i);
    }
}
