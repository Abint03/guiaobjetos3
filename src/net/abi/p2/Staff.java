package net.abi.p2;

public class Staff extends Persona {
    private Double salario;
    private String turno;

    public Staff() {
        super();
    }

    public Staff(Integer dni, String nombre, String apellido, String email, String direccion, Double salario, String turno) {
        super(dni, nombre, apellido, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double salarioAnual(){
        return salario*12;
    }

    @Override
    public String toString() {
        return "Staff: " + super.toString()+ " Salario: " + salario + ", turno: '" + turno;
    }
}
