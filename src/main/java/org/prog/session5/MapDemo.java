package org.prog.session5;

import org.prog.session1.Car;

import java.util.*;


//TODO: write Map with car owners as keys and owned cars as values
//TODO: assign each car random color using randomColor() from this class

public class MapDemo {

    final static String User1 = "James Ostin";
    final static String User2 = "Richard Line";
    final static String User3 = "Kate Kotlin";

    public static void main(String[] args) {
        Map<String, List<Car>> carOwners = new HashMap<>();

        carOwners.put(User1, new ArrayList<>());

        var car = new Car();
        car.carName = "Rolls Royce";
        car.color = randomColor();
        carOwners.get(User1).add(car);

        car = new Car();
        car.carName = "BMW";
        car.color = randomColor();
        carOwners.get(User1).add(car);

        carOwners.put(User2, new ArrayList<>());

        car = new Car();
        car.carName = "Mers";
        car.color = randomColor();
        carOwners.get(User2).add(car);

        carOwners.put(User3, new ArrayList<>());

        car = new Car();
        car.carName = "Lexus";
        car.color = randomColor();
        carOwners.get(User3).add(car);

        car = new Car();
        car.carName = "Zaporozhets";
        car.color = randomColor();
        carOwners.get(User3).add(car);

        for (var owner: carOwners.keySet()) {
            System.out.println(owner);

            for (var ownedCar: carOwners.get(owner)) {
                System.out.println(ownedCar);
            }
        }

        // tax id, each tax id can have 1-5 FOPs
        Map<String, List<String>> map = new HashMap<>();
        map.put("17253761525", new ArrayList<>());

        map.get("17253761525").add("FOP #1");
        map.get("17253761525").add("FOP #2");
        map.get("17253761525").add("FOP #3");
        map.get("17253761525").add("FOP #4");

        List<String> list1 = map.get("17253761525");

        for (String someString : list1) {
            System.out.println("Citizen 17253761525 has : " + someString);
        }
    }

    public static String randomColor() {
        return switch ((int)(Math.random() * 5)) {
            case 0 -> "red";
            case 1 -> "green";
            case 2 -> "blue";
            case 3 -> "yellow";
            case 4 -> "pink";
            default -> "black";
        };
    }
}
