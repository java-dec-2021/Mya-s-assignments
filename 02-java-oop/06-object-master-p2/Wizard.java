public class Wizard extends Human{

    private int health = 50;
    private int intelligence = 8;
    
    public void heal(Human otherHuman){
        otherHuman.health += this.intelligence;
    }
    public void fireball(Human otherHuman){
        otherHuman.health -= this.intelligence *3 ;
    }

    // getters and setters
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getIntelligence() {
        return intelligence;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

}