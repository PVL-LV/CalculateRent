package ua.pvl;

public class Hospital extends Building {

    public Hospital(String address,  double square) {
        super(address, square);
    }

    @Override
    public double calcRent(double basicRent) {
        return 0;
    }
}
