
public class Samurai extends Human {
    private int health = 200;
    private static int numberOfSamurai;

    // static method
    public Samurai(int health){
        this.health = health;
        numberOfSamurai++;
    }
    public Samurai() {
    }
    public void deathBlow(Human otherHuman){
        this.health -= 0.5 * this.health;
    }

    public void meditate(){
        this.health += 1/2 * this.health;
    }
    public static int howMany(){
        return numberOfSamurai;
    }
}