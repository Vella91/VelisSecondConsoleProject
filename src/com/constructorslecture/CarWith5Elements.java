package com.constructorslecture;

public class CarWith5Elements {

    String carName;
    String carColor;
    int carHorsePower;
    int carReleaseYear;
    boolean isSecondHand;

    public CarWith5Elements(String carName, String carColor, int carHorsePower, int carReleaseYear, boolean isSecondHand) {
        this.carName = carName;
        this.carColor = carColor;
        this.carHorsePower = carHorsePower;
        this.carReleaseYear = carReleaseYear;
        this.isSecondHand = isSecondHand;
    }

    public CarWith5Elements(String carName, String carColor, boolean isSecondHand){
        this.carName = carName;
        this.carColor = carColor;
        this.isSecondHand = isSecondHand;
        carHorsePower = -1;
        carReleaseYear = -1;
    }

    public CarWith5Elements(String carName, String carColor, int carReleaseYear, int carHorsePower) {
        this.carName = carName;
        this.carColor = carColor;
        this.carReleaseYear = carReleaseYear;
        this.carHorsePower = carHorsePower;
        isSecondHand = false;
    }

    public CarWith5Elements(String carName, int carHorsePower, int carReleaseYear, boolean isSecondHand) {
        this.carName = carName;
        this.carHorsePower = carHorsePower;
        this.carReleaseYear = carReleaseYear;
        this.isSecondHand = isSecondHand;
        carColor = "N/A";
    }

    public CarWith5Elements(){
    }

    public static void main(String[] args) {
        CarWith5Elements myFullCar = new CarWith5Elements("Giovanni", "Sky blue", 1500,2019,true);
        CarWith5Elements myFirstCar = new CarWith5Elements("Aventi", "Blue", true);
        CarWith5Elements mySecondCar = new CarWith5Elements("Astra", "Gray", 1995,  2500);
        CarWith5Elements myThirdCar = new CarWith5Elements("Punto", 1600, 2002, true);
    }
}
