package exp1;

class Vehicle {
    public String brand;
    public String color;

    Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void run() {
        System.out.println("run");
    }

}