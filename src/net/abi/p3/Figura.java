package net.abi.p3;

import java.awt.*;

abstract public class Figura {
    private String color;

    public Figura() {
        color="Rojo";
    }

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract public Double area();
    abstract public Double perimetro();

    @Override
    public String toString() {
        return " Figura: " +
                "color: " + color+".";
    }
}
