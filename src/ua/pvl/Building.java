package ua.pvl;


public abstract class Building {

    private String address;

    public Building(String address) {
        this.address = address;
    }

    public double square = getSquare();

    private double getSquare() {
        //get square
        return 0;
    }

    public double basicRent = getBasicRent();

    public double getBasicRent() {
        // get basic rent
        return 0;
    }

    public abstract double calcRent(double basicRent, double square);

}
