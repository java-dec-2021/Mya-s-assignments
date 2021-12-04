

public class Ninja extends Human {
    private int stealth = 10;
    
    public void steal(Human otherHuman){
        otherHuman.health  -= this.stealth;
        this.stealth += this.health;
    }

    public void runAway(){
        this.health -= 10;
    }
}