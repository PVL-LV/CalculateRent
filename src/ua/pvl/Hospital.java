package ua.pvl;

public class Hospital extends Building {

    public Hospital(String address) {
        super(address);
    }

    @Override
    public double calcRent(double basicRent, double square) {
        return 0;
    }
}
