package Objects;

public class Stats{

    private int Health;
    private int Strength;
    private int Speed;

    public int getHealth()
    {
        return this.Health;
    }
    public void setHealth(int health)
    {
        this.Health = health;
    }
    public int getStrength()
    {
        return this.Strength;
    }
    public void setStrength(int str)
    {
        this.Strength = str;
    }

    public int GenerateHealth()
    {
        return (int)Math.floor(Math.random() * (23 - 4) + 1);
    }
    public int GenerateStrength()
    {
        return (int)Math.floor(Math.random() * (7 - 3) + 1);
    }
}
