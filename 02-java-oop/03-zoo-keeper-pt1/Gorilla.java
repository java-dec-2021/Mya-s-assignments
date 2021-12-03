public class Gorilla extends Mammal{

    public void throwSomething(){
        this.energyLevel -= 5;
        System.out.println("The gorilla has thrown something and decrease the energy level by " + this.energyLevel );
    }

    public void eatBananas(){
        this.energyLevel += 10;
        System.out.println("The gorilla has increased its energy by " + this.energyLevel);
    }

    public void climb(){
        this.energyLevel -= 10;
        System.out.println("The gorilla has decreased its energy " + this.energyLevel + " by climbing a tree");
    }
}