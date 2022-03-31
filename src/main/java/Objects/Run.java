package Objects;

public class Run {

    public static void main(String[] args) {

       System.out.println("Are you prepared to fight the Goblin?\n ====================\nPlease use W,A,S,D to move\n ====================");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new World();
    }
}
