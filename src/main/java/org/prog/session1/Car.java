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

            boolean isColorEqual = true;
            if (this.color == null && car.color == null)
                isColorEqual = true;
            else if ((this.color == null && car.color != null) || (this.color != null && car.color == null))
                isColorEqual = false;
            else
                isColorEqual = this.color.equals(car.color);

            boolean isModelEqual = true;
            if (this.model == null && car.model == null)
                isModelEqual = true;
            else if ((this.model == null && car.model != null) || (this.model != null && car.model == null))
                isModelEqual = false;
            else
                isModelEqual = this.model.equals(car.model);

            return isColorEqual && isModelEqual;
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