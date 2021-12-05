
public class Iphone extends Phone implements Ringable {

    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    
    }

    @Override
    public void displayInfo() {
        System.out.println("Version: " + this.getVersionNumber());
       System.out.println("Battery Percentage: " + this.getBatteryPercentage());
       System.out.println("Carrier: " +  this.getCarrier());
       System.out.println("Ringtone: " + this.getRingTone());
        
    }

    @Override
    public String ring() {
        return this.getRingTone();
    }

    @Override
    public String unlock() {
        
        return "Unlock via facial recognition!";
    }

    
}