package net.abi.p1;

public class Cilindro extends Circulo {
    private Double altura;

    public Cilindro() {
        super();
        altura=1.0;
    }

    public Cilindro(Double altura) {
        this.altura = altura;
    }

    public Cilindro(Double radio, String color, Double altura) {
        super(radio, color);
        this.altura = altura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public double volumen(){
        return (this.area()*altura);
    }

    public double area(){
        return (2*Math.PI*super.getRadio()*altura)+2*super.area();
    }

    @Override
    public String toString() {
        return "Cilindro: " +
                "subclase de "+super.toString()+" altura: " + altura+" volumen: "+volumen();
    }
}
