package ua.pvl;


public class PrivateHouse extends Building {

    public PrivateHouse(String address) {
        super(address);
    }

    @Override
    public double calcRent(double basicRent, double square) {
        double payment;
        if(square < 100.0) {
            payment = (square * basicRent / 100) * 80;
        } else {
            payment = square * basicRent;
        }

        return payment;
    }
}
