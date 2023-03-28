package net.abi.p2;

public class Estudiante extends Persona {
    private Integer anioIngreso;
    private Double cuotaMensual;
    private String carrera;

    public Estudiante() {
        super();
    }

    public Estudiante(Integer dni, String nombre, String apellido, String email, String direccion, Integer anioIngreso, Double cuotaMensual, String carrera) {
        super(dni, nombre, apellido, email, direccion);
        this.anioIngreso = anioIngreso;
        this.cuotaMensual = cuotaMensual;
        this.carrera = carrera;
    }

    public Integer getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(Integer anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public Double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(Double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String toString() {
        return "Estudiante: " + super.toString()+ " Año de ingreso: " + anioIngreso + ", carrera: '" + carrera+", cuota mensual: "+cuotaMensual;
    }
}
