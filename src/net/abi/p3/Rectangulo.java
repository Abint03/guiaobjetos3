package net.abi.p3;

public class Rectangulo extends Figura{
    private Double base;
    private Double altura;

    public Rectangulo() {
        super();
        base=1.0;
        altura=1.0;
    }

    public Rectangulo(String color,Double base, Double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double area(){
        return this.base*this.altura;
    }

    public Double perimetro(){
        return (this.base*2)+(this.altura*2);
    }

    @Override
    public String toString() {
        return "Rectangulo: " + "base: " + base + ", altura: " + altura+super.toString();
    }
}
