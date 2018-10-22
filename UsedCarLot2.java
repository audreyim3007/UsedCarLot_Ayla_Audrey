import java.util.*;

/**
 * Write a description of class UsedCarLot2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UsedCarLot2
{
    // instance variables - replace the example below with your own
    private List<Car> cars;
    private int totalValue;

    /**
     * Constructor for objects of class UsedCarLot2
     */
    public UsedCarLot2()
    {
        cars = new ArrayList<>();
        totalValue = 0;
    }
    
    public void addCar(Car usedCar) {
        // must be a car to pass through code
        if (usedCar == null) {
            return;
        }
        // if price is 0 or negative, reject car
        if (usedCar.getPrice() <= 0) {
            System.out.println("Does not have price; cannot be added.");
            return;
        }
        // if VIN is not unique, reject car
        if (!isUniqueVin(usedCar.getVin())) {
            System.out.println("Does not have unique VIN; cannot be added.");
            return;
        }
        // car can be added
        cars.add(usedCar);
        totalValue += usedCar.getPrice();
    }
    
    public void removeCar(Car usedCar) {
        // confirms that the car was in the Used Car Lot before removing
        boolean wasRemoved = cars.remove(usedCar);
        // subtracts usedCar value to adjust totalValue if car removed
        if (wasRemoved) {
            totalValue -= usedCar.getPrice();
        }
        else {
            System.out.println("Car was not in lot.");
        }
    }
    
    private boolean isUniqueVin(String vin) {
        // check if VIN is unique
        for (Car c: cars) {
            if (vin.equals(c.getVin())) {
                return false;
            }
        }
        // did not match any car == unique
        return true;
    }
    
    public void search(String make, String model, int price, String color, int year, String trans) {
        // chain through each searchBy method and return the final list
        List<Car> resultList = searchByMake(cars, make);
        resultList = searchByModel(resultList, model);
        resultList = searchByPrice(resultList, price);
        resultList = searchByColor(resultList, color);
        resultList = searchByYear(resultList, year);
        resultList = searchByTrans(resultList, trans);
        //if no results, tell user -- otherwise list matching cars
        if (resultList.isEmpty()) {
            System.out.println("No matching cars");
        }
        else {
            System.out.println("Here is the list of cars that match your search:");
            for (Car c: resultList) {
                System.out.println(c);
            }
            System.out.println("Would you like to delete them from the lot?");
        }
    }
    
    public List<Car> searchByMake(List<Car> cars, String make) {
        // new ArrayList for holding matching cars
        List<Car> resultList = new ArrayList<>();
        // find all cars that match the make and add to resultList
        for (Car c: cars) {
            if (c.getMake().equals(make)) {
                resultList.add(c);
            }
        }
        return resultList;
    }
    
    public List<Car> searchByModel(List<Car> cars, String model) {
        // new ArrayList for holding matching cars
        List<Car> resultList = new ArrayList<>();
        // find all cars that match the model and add to resultList
        for (Car c: cars) {
            if (c.getModel().equals(model)) {
                resultList.add(c);
            }
        }
        return resultList;
    }
    
    public List<Car> searchByPrice(List<Car> cars, int maxPrice) {
        // new ArrayList for holding matching cars
        List<Car> resultList = new ArrayList<>();
        // find all cars that cost maxPrice or less and add to resultList
        for (Car c: cars) {
            if (c.getPrice() <= maxPrice) {
                resultList.add(c);
            }
        }
        return resultList;
    }
    
    public List<Car> searchByColor(List<Car> cars, String color) {
        // new ArrayList for holding matching cars
        List<Car> resultList = new ArrayList<>();
        // find all cars that match the color and add to resultList
        for (Car c: cars) {
            if (c.getColor().equals(color)) {
                resultList.add(c);
            }
        }
        return resultList;
    }
    
    public List<Car> searchByYear(List<Car> cars, int year) {
        // new ArrayList for holding matching cars
        List<Car> resultList = new ArrayList<>();
        // find all cars that were made in year or newer and add to resultList
        for (Car c: cars) {
            if (c.getYear() >= year) {
                resultList.add(c);
            }
        }
        return resultList;
    }
    
    public List<Car> searchByTrans(List<Car> cars, String trans) {
        // new ArrayList for holding matching cars
        List<Car> resultList = new ArrayList<>();
        // find all cars that match trans and add to resultList
        for (Car c: cars) {
            if (c.getTrans().equals(trans)) {
                resultList.add(c);
            }
        }
        return resultList;
    }
    
    public void changeCarPrice(String vin, int price) {
        for (Car c: cars) {
            if (c.getVin().equals(vin)) {
                c.setPrice(price);
                return;
            }
        }
        System.out.println("VIN does not match any car in this lot.");
    }
}
