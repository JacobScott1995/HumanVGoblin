package Objects;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Fighting{

    Goblin goblin = new Goblin();
    Human human = new Human();

    public void Fighting() {
        boolean dead = false;
        System.out.println("You've encountered a Goblin!");

        goblin.getHealth();
        goblin.getStrength();
        human.getHealth();
        human.getStrength();


       while(!dead) {
            System.out.println("Current Goblin Health: " + goblin.getHealth());
            System.out.println("Current Human Health: " + human.getHealth());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int damage = goblin.getStrength();
            human.setHealth(human.getHealth() - damage);
            int attack = human.getStrength();
            goblin.setHealth(goblin.getHealth() - attack);

            if (human.getHealth() <= 0) {
                System.out.println("You have fallen and died. Please retry.");
                dead = true;
            } else if (goblin.getHealth() <= 0) {
                System.out.println("You killed the goblin! Congratulations!");
                dead = true;
            } else {
                System.out.println("Your attack weakened the foe and the fight continues");
                goblin.setStrength(goblin.GenerateStrength());
                human.setStrength(human.GenerateStrength());
            }
        }
         restart();
    }
    public void restart() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to play again? \n" + "Y / N\n");
        try {
            String answer = scan.nextLine().toLowerCase(Locale.ROOT);
            if (answer.isEmpty()) throw new InputMismatchException("Gotta put something here!");
            if (answer.contains("y")) {
                new World();
            } else {
                System.out.println("Thank you for playing!");
                System.exit(0);
            }
        } catch (InputMismatchException r) {
            r.printStackTrace();
        }
    }
}
