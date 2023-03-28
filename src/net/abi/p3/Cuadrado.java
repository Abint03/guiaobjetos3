package net.abi.p3;

public class Cuadrado extends Rectangulo{
    public Cuadrado() {
        super();
    }
    public Cuadrado(String color, Double lado){
        super(color,lado,lado);
    }



    @Override
    public String toString() {
        return "Cuadrado: lados: "+super.getAltura()+" color:"+super.getColor();
    }
}
