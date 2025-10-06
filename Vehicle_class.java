// Base Vehicle class
class Vehicle {
    protected String model;
    
    public Vehicle(String model) {
        this.model = model;
    }
    
    public void forward() {
        System.out.println(model + " is moving forward");
    }
    
    public void reverse() {
        System.out.println(model + " is moving in reverse");
    }
}

// SUV class extending Vehicle
class SUV extends Vehicle {
    public SUV(String model) {
        super(model);
    }
    
    @Override
    public void forward() {
        System.out.println(model + " SUV is moving forward with all-wheel drive");
    }
    
    @Override
    public void reverse() {
        System.out.println(model + " SUV is reversing with rear camera turned on");
    }
}

// SportsCar class extending Vehicle
class SportsCar extends Vehicle {
    public SportsCar(String model) {
        super(model);
    }
    
    @Override
    public void forward() {
        System.out.println(model + " sports car is accelerating rapidly forward");
    }
    
    @Override
    public void reverse() {
        System.out.println(model + " sports car is reversing in low gear");
    }
}

// Hybrid class extending Vehicle
class Hybrid extends Vehicle {
    public Hybrid(String model) {
        super(model);
    }
    
    @Override
    public void forward() {
        System.out.println(model + " hybrid is silently moving forward using electric motor");
    }
    
    @Override
    public void reverse() {
        System.out.println(model + " hybrid is reversing on autopilot");
    }
}

// Test class
public class Main {
    public static void main(String[] args) {
        SUV suv = new SUV("Toyota 4Runner");
        SportsCar sports = new SportsCar("Porsche 911");
        Hybrid hybrid = new Hybrid("Toyota Prius");
        
        suv.forward();
        suv.reverse();
        
        sports.forward();
        sports.reverse();
        
        hybrid.forward();
        hybrid.reverse();
    }
}