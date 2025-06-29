package org.prog.session3.poly;

//TODO: write overloaded drive to to contain:
//TODO: - amount of passengers  def: 0
//TODO: - is payment for gas split def: no

public class Mazda implements ICar {

    public void driveTo(String destination) {
        driveTo(destination, "here and now");
    }

    public void driveTo(String destination, String from) {
        driveTo(destination, from, "nowhere");
    }

    public void driveTo(String destination, String from, String stoppingAt) { driveTo(destination, from, stoppingAt, 0, false); }

    public void driveTo(String destination, String from, String stoppingAt, int passengersCount, boolean isPaymentSplit) {
        System.out.println("Mazda drives from " + from + " to " + destination);
        System.out.println("Mazda stopping at " + stoppingAt);
        System.out.println("Mazda passengers count " + passengersCount);
        System.out.println("Mazda payment split " + (isPaymentSplit ? "yes" : "no"));
    }

    public void manualGearSwitch(int gear) {
        System.out.println("Switch to " + gear);
    }

    @Override
    public void turn(String direction) {
        System.out.println("Mazda turns " + direction);
    }

    @Override
    public void accelerate() {
        System.out.println("Mazda accelerates");
    }

    @Override
    public void brake() {
        System.out.println("Mazba brakes");
    }
}
