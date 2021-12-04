public class Human{
    protected int strength = 3;
    protected int stealth = 3;
    protected int intelligence = 3;
    protected int health = 100;
    
    // public Human(int strength){
    //     this.strength =strength;
    // }
    public void attackHuman(Human otherHuman){
        otherHuman.health -= this.strength;
        System.out.println("The health of the attacked human reduced the strength of the current human " + otherHuman.health );
    }

}