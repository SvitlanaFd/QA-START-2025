package org.prog.session4;

import org.prog.session1.Car;

public class Session4 {

    /**
     *
     * ############################
     * ###############10###########
     * ############################
     * ############################
     * @param args
     */

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "red";
        Car car2 = new Car();
        car2.color = "red";

//        String s1 = "red";
//        String s2 = "red";
//
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());

        System.out.println(car1.equals(car2));
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());

        System.out.println(car1.toString());
        System.out.println(car2.toString());

        //Car car1 = new Car();
        car1.color = "red";
        car1.model = "bmw";
        //Car car2 = new Car();
        car2.color = "red";
        car2.model = "mers";
        Car car3 = new Car();
        car3.color = "red";
        car3.model = "bmw";
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());
        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));
        System.out.println(car1 == car2);
        System.out.println(car1 == car3);
    }
}
