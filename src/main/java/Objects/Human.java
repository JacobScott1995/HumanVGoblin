package Objects;

public class Human extends Stats {



    public Human()
    {
      setStrength(GenerateStrength());
      setHealth(GenerateHealth());
    }
    public String BattleCry()
    {
        return "You will die Goblin!";
    }
}
