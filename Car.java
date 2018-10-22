
public abstract class Car{
    //instance variables
    private String vin;
    private String make;
    private String model;
    private String color;
    private int year;
    private int price;
    
    //constructors
    public Car(){
        vin="undef";
        make="undef";
        model="undef";
        color="undef";
        year=0;
        price=0;
    }
    
    public Car (String vin, String make, String model, String color, int year, int price){
        this.vin=vin;
        this.make=make;
        this.model=model;
        this.color=color;
        this.year=year;
        this.price=price;
    }
    
    
    //getters and setters for instance variables
    public abstract String getTrans();
    
    public String getVin(){
        return vin;
    }
    
    public void setVin(String vin){
        this.vin=vin;
    }
    
    public String getMake(){
        return make;
    }
    
    public void setMake(String make){
        this.make=make;
    }
    
    public String getModel(){
        return model;
    }
    
    public void setModel(String model){
        this.model=model;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color=color;
    }
    
    public int getYear(){
        return year;
    }
    
    public void setYear(int year){
        this.year=year;
    }
    
    public int getPrice(){
        return price;
    }
    
    public void setPrice(int price){
        this.price=price;
    }
    
    // converts individual Car to user-friendly String format
    public String toString() {
        return "" + year + " " + make + " " + model + ", " + color + ", " + getTrans() + ", $" + price;
    }
}

