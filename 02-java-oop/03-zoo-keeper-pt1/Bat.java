public class Bat{
    protected int energyLevel = 300;

    public Bat(int energyLevel){
        this.energyLevel=energyLevel;
    }
    public void fly(){
        this.energyLevel -= 50;
        System.out.println("A bat is taking off and its energy after flying" + this.energyLevel);
    }
    public void eatHumans(){
        this.energyLevel += 25;
        System.out.println("so-well, never mind and increases its energy after eating humans " + this.energyLevel);
    }
    public void attackTown(){
        this.energyLevel -= 100;
        System.out.println("A town is on fire!" + this.energyLevel );
    }
}