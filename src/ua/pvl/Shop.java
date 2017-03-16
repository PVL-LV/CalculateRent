package ua.pvl;

public class Shop extends Building {

    public Shop(String address,  double square) {
        super(address, square);
    }

    @Override
    public double calcRent(double basicRent) {
        double payment = square * basicRent / 100 * (100 + (square * 1));

        return 0;
    }
}
