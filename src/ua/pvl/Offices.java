package ua.pvl;


public class Offices extends Building {

    public Offices(String address,  double square) {
        super(address, square);
    }

    @Override
    public double calcRent(double basicRent) {
        double payment = square * basicRent / 100 * (square * 1); // not sure is it correct formula

        return payment;
    }
}
