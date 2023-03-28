package net.abi.p3;

public class Circulo extends Figura{
    private Double radio;

    public Circulo() {
        super();
        radio=1.0;
    }

    public Circulo(String color,Double radio) {
        super(color);
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double area(){
        return Math.PI*Math.pow(this.radio,2.0);
    }

    public Double perimetro(){
        return Math.PI*2*this.radio;
    }
    public String toString() {
        return "Círculo: " + "radio: " +radio+super.toString();
    }
}
