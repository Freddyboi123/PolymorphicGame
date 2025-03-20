package simple;

import java.util.Random;
import java.util.Scanner;

public class GamePlay {

    private Player player;
    private CreatureGenerator creatureGenerator = new CreatureGenerator();

    public void startGame() {
        creatureGenerator.generateCreatures();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ganster counter molester!");
        System.out.println("What is your name?");
        String input = scanner.nextLine();
        this.player = new Player(input);
        while (!input.equals("n") && player.getHealth() > 0) {
            System.out.print("You are walking and ");
            Creature creature = creatureGenerator.getRandomCreature();
            System.out.println(creature.meet());
            while (creature.getHealth() > 0 && player.getHealth() > 0) {
                System.out.println("Will you molest " + creature.getName() + " y/n?");
                String fighting = scanner.nextLine();
                if(fighting.equals("n"))
                    break;
                fight(creature);

                if (creature.getHealth() <= 0) {
                    if (creature instanceof SexualPredator) {
                        System.out.println();
                        System.out.println(creature.getName() + " is now dead" + "\n" + "\"He did not kill himself\"");
                        System.out.println();
                        player.changeHealth(30);
                    } else {

                        System.out.println(creature.getName() + " is dead. " + player.getName() + " gets 5 healthpoints");
                        player.changeHealth(5);
                    }
                    System.out.println(player.getName() + " has " + player.getHealth() + " healthpoints");
                    System.out.println(creature.getName() + " has " + creature.getHealth() + " healthpoints");
                }
                if(player.getHealth() <= 0) {
                    System.out.println(player.getName() + " died and got molested.. in that order.");
                    break;
                }
            }
            System.out.println("Do you want to procede y/n?");
            input = scanner.nextLine();

        }
        System.out.println("Game over! you suck yourself keep going on sucking. Forever, Forever and ever!");
    }


    private void fight(Creature creature) {
        System.out.println(player.getName() + " and " + creature.getName() + " will now fight");
        Random random = new Random();
        int playerAttack = random.nextInt(10) + 1;
        int creatureAttack = creature.attack();
        System.out.println(player.getName() + " attacks with " + playerAttack);
        System.out.println(creature.getName() + " attacks with " + creatureAttack);
        if (playerAttack > creatureAttack) {
            System.out.println(creature.getName() + " is molested by " + playerAttack + " points");
            creature.takeDamage(playerAttack);
        } else if (playerAttack < creatureAttack) {
            System.out.println(player.getName() + " is molested by " + creatureAttack + " points");
            player.changeHealth(-creatureAttack);
        } else
            System.out.println("It is a tie! Nobody is molested");

    }

}
