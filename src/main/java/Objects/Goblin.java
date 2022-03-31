package Objects;

public class Goblin extends Stats {

    public Goblin()
    {
       setHealth(GenerateHealth());
       setStrength(GenerateStrength() - 1);//Goblins are smaller thus get a disadvantage
    }
    public String BattleCry()
    {
        return "I will defeat you, you strange looking alien!";
    }

}
