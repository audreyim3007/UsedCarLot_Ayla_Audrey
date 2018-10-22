public class AutoTransCar extends Car{ 
    private boolean cruzControlOn;
    
    public AutoTransCar(){
        super();
        cruzControlOn=false;
    }
    
    public AutoTransCar(String vin, String make, String model, String color, int year, int price, boolean ccOn){
        super(vin, make, model, color, year, price);
        cruzControlOn=ccOn;
    }
    
    public String getTrans() {
        return "auto";
    }
    
    public void setCruzControl(boolean cc){
        cruzControlOn=cc;
    }
    
    public boolean getCruzControl(){
        return cruzControlOn;
    }
    
    public void toggleCruzControl(){
        cruzControlOn = !cruzControlOn;
    }
}


 