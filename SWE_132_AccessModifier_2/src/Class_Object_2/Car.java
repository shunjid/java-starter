package Class_Object_2;

public class Car {

    public String carName;
    String ownerName;
    public int price;
    private final int carCode = 321;

    public Car(String carName, String ownerName, int price) {

        this.carName = carName;
        this.ownerName = ownerName;
        this.price = price;
    }

    public int getCarCode() {
        return carCode;
    }
}
