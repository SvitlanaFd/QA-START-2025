package org.prog.session6;

import org.prog.session1.Car;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestNGHomeWork {
    final static String User1 = "James Ostin";
    final static String User2 = "Richard Line";
    final static String User3 = "Kate Kotlin";

    @Test
    public void mainTest() {
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
