public class ManualTransCar extends Car{
    private int numGears;
    
    public ManualTransCar(){
        super();
        setNumGears(5);
    }
    
    public ManualTransCar(String vin, String make, String model, String color, int year, int price, int numGears){
        super(vin, make, model, color, year, price);
        setNumGears(numGears);
    }
    
    public String getTrans() {
        return "manual";
    }
    
    public void setNumGears(int ng){
        if (3<=ng && ng <=6){
            numGears=ng;
        }
        else {
            numGears=5;
        }
    }
    
    public int getNumGears(){
        return numGears;
    }
}