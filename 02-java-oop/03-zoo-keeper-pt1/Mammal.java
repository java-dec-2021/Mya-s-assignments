
public class Mammal {
    protected int energyLevel = 100;
    private int displayEnergy;

    // constructor
    public Mammal(){

    }
    // public Mammal(int energyLevel){
    //     this.energyLevel=energyLevel;
    // }
    // method

    public int displayEnergy(){
        System.out.println("the energyLevel: " + this.energyLevel);
        return this.energyLevel;
    }
    
    // getters and setters
    public int getEnergyLevel() {
        return energyLevel;
    }
    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }
    
    public int getDisplayEnergy() {
        return displayEnergy;
    }
    public void setDisplayEnergy(int displayEnergy) {
        this.displayEnergy = displayEnergy;
    }
}
