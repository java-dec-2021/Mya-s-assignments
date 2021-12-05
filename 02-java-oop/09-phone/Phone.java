public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    
    public abstract void displayInfo();
    
    // getters and setters 
    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }
    public String getVersionNumber() {
        return versionNumber;
    }
    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }
    public int getBatteryPercentage() {
        return batteryPercentage;
    }
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
    public String getCarrier() {
        return carrier;
    }
    public void setRingTone(String ringTone) {
        this.ringTone = ringTone;
    }
    public String getRingTone() {
        return ringTone;
    }
}