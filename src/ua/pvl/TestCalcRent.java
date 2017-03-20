package ua.pvl;

public class TestCalcRent {

    public static double basicRent = 100;

    public static void main(String[] args) {

        Building[] buildings = new Building[6];
        buildings[0] = new PrivateHouse("23 Jebs street", 125);
        buildings[1] = new Offices("2234 Orlano str", 300);
        buildings[2] = new Shop("Sezam street", 250);
        buildings[3] = new Hospital("Clinic str", 1000);
        buildings[4] = new Shop("Dlk str", 70);
        buildings[5] = new PrivateHouse("Strick str", 32);

        double rent = 0.00;

        for (Building b : buildings) {
            if (b.square > 100 && b instanceof PrivateHouse) {
                rent += b.calcRent(basicRent);
            }
        }
        System.out.println("Total rent cost for privat houses with less than 100 sq.m = " + rent);

        for(Building b : buildings) {
            if(!(b instanceof PrivateHouse)){
                rent += b.calcRent(basicRent);
            }
        }
        System.out.println("Rent cost for all shops, offices and hospitals = " + rent);

        for (Building b : buildings) {
            if (b.square < 100 && b instanceof PrivateHouse) {
                rent += b.calcRent(basicRent);
            }
        }
        System.out.println("Total rent cost for privat houses with more than 100 sq.m = " + rent);
    }
}
