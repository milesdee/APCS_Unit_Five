public class CarTrip {

    private int myStartOdometer;
    private int myEndOdometer;
    private double myTime;
    private double myGallonsUsed;

    public CarTrip(int starting, int ending, double time, double gallons){
        this.myStartOdometer = starting;
        this.myEndOdometer = ending;
        this.myTime = time;
        this.myGallonsUsed = gallons;
    }
    public CarTrip(){
        this.myStartOdometer = 0;
        this.myEndOdometer = 0;
        this.myTime = 0;
        this.myGallonsUsed = 0;
    }


    public int getMyStartOdometer() {
        return myStartOdometer;
    }

    public int getMyEndOdometer() {
        return myEndOdometer;
    }

    public double getMyTime() {
        return myTime;
    }

    public double getMyGallonsUsed() {
        return myGallonsUsed;
    }

    public void setMyStartOdometer(int myStartOdometer) {
        this.myStartOdometer = myStartOdometer;
    }

    public void setMyEndOdometer(int myEndOdometer) {
        this.myEndOdometer = myEndOdometer;
    }

    public void setMyTime(double myTime) {
        this.myTime = myTime;
    }

    public void setMyGallonsUsed(double myGallonsUsed) {
        this.myGallonsUsed = myGallonsUsed;
    }

    public int getTripDistance(){
        return(getMyEndOdometer()-getMyStartOdometer());
    }

    public double getAverageSpeed(){
        return(getTripDistance()/getMyTime());
    }

    public double getGasMileage(){
        return(getTripDistance()/getMyGallonsUsed());
    }

    public double getTotalGasPrice(double pricePerGallon){
        return((double)((int)(pricePerGallon*getMyGallonsUsed()*100+0.5))/100);
    }

    public String toString(){
        return("Distance traveled: " + getTripDistance() + " miles");
    }

}