public class Car {
    String model;
    int modelNumber;
    String color;
    int currentSpeed = 0;
    boolean isEngineStart = false;

    public Car(String model, int modelNumber, String color) {
        this.model = model;
        this.modelNumber = modelNumber;
        this.color = color;
    }

    public void startEngine() {
        isEngineStart = true;
        System.out.println(model + " engine started");
    }

    public void stopEngine() {
        isEngineStart = false;
        System.out.println(model + " engine stopped");
    }
}
