package org.prog.session1;

import org.w3c.dom.css.CSSStyleRule;

//TODO: HW4: add String model and make equals & hashCode work by model and color
public class Car {

    public String color;
    public String model;

    public void goTo() {
        System.out.println(color + " car is going somewhere");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car car = (Car) obj;

            if (this.color == null && car.color == null)
                return true;

            if ((this.color == null && car.color != null) || (this.color != null && car.color == null))
                return false;

            if (this.model == null && car.model == null)
                return true;

            if ((this.model == null && car.model != null) || (this.model != null && car.model == null))
                return false;

            return this.color.equals(car.color) && this.model.equals(car.model);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (model+color).hashCode();
    }

    @Override
    public String toString() {
        return "Car : " + color;
    }

    public String getColor() {
        return color;
    }
}