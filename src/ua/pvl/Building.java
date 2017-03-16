package ua.pvl;


public abstract class Building {

    public String address;
    public double square;

    public Building(String address, double square) {
        this.address = address;
        this.square = square;
    }

    public abstract double calcRent(double basicRent);
}
