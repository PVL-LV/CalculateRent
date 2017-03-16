package ua.pvl;

public class Shop extends Building {

    public Shop(String address) {
        super(address);
    }

    @Override
    public double calcRent(double basicRent, double square) {
        double payment = square * basicRent / 100 * (100 + (square * 1));

        return 0;
    }
}
