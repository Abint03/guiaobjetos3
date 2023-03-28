package net.abi.p1;

import com.sun.corba.se.impl.interceptors.PICurrent;

public class Circulo {
    private
    Double radio;
    private String color;

    public Circulo() {
        radio=1.0;
        color="rojo";
    }

    public Circulo(Double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double area(){
        return (Math.PI*(radio*radio));
    }


    @Override
    public String toString() {
        return "Circulo: " +
                "radio: " + radio +
                ", color: " + color;
    }
}
