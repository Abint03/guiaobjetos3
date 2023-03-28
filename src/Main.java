import net.abi.p1.Cilindro;
import net.abi.p2.Estudiante;
import net.abi.p2.Persona;
import net.abi.p2.Staff;
import net.abi.p3.Circulo;
import net.abi.p3.Cuadrado;
import net.abi.p3.Rectangulo;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        /**----------------------PUNTO 1---------------------**/
        /*Cilindro a= new Cilindro(3.1,"verde",4.2);

        System.out.println(a.toString());
        Cilindro x=new Cilindro(3.1);
        x.setRadio(5.5);
        System.out.println(x.toString());*/

        /**----------------------PUNTO 2---------------------**/
       /* Estudiante e1= new Estudiante(45236762,"Abi","Alegre","abi@gmail.com","Independencia 1131",2022,1100.0,"Programación");
        Estudiante e2= new Estudiante(43322371,"Juan","Cheli","juan@gmail.com","Córdoba 3921",2022,1500.0,"Ing. Sistemas");
        Estudiante e3= new Estudiante(45204921,"Victoria","Marcone","vicky@gmail.com","Rivadavia 900",2022,200.0,"Adm. Empresarial");
        Estudiante e4= new Estudiante(43291591,"Lautaro","Burgos","lauti@gmail.com","Dorrego 553",2021,1100.0,"Programación");

        Staff s1= new Staff(22876549,"Lolo","Ramirez","lolo@hotmail.com","Balcarce 5023",25000.0,"mañana");
        Staff s2= new Staff(18693250,"Carmen","Lugones","car@hotmail.com","Malvinas 892",32000.0,"ncohe");
        Staff s3= new Staff(35985648,"Carlos","Teriel","carlos@hotmail.com","Falucho 1002",80000.0,"noche");
        Staff s4= new Staff(40216978,"Sofía","Chávez","soff@hotmail.com","San Martín 1249",50000.0,"mañana");

        ArrayList<Persona> listaPersonas=new ArrayList<>();
        listaPersonas.add(e1);
        listaPersonas.add(s1);
        listaPersonas.add(e2);
        listaPersonas.add(s2);
        listaPersonas.add(e3);
        listaPersonas.add(s3);
        listaPersonas.add(e4);
        listaPersonas.add(s4);

        Main a= new Main();
        a.cantidadesEstudiantesStaff(listaPersonas);
        double ingreso= a.ingresosInst(listaPersonas);
        System.out.println("INGRESOS INSTITUCION: $"+ingreso);
    }

    public void cantidadesEstudiantesStaff(ArrayList<Persona> lista){
        int estudiantes=0,staff=0;
        for(int i=0; i<lista.size();i++) {
            if(lista.get(i) instanceof Estudiante){
                estudiantes++;
            }else {
                staff++;
            }
        }
        System.out.println("HAY "+estudiantes+" ESTUDIANTES Y "+staff+" MIEMBROS DE STAFF.");
    }

    public double ingresosInst(ArrayList<Persona> lista){
        double ingresos=0.0;
        for(int i=0; i<lista.size();i++){
            if(lista.get(i) instanceof Estudiante){
                ingresos+=((Estudiante) lista.get(i)).getCuotaMensual();
            }
        }

        return ingresos;

    }*/
        /**----------------------PUNTO 3---------------------**/
        //predeterminados
        Rectangulo predR= new Rectangulo();
        Circulo predC= new Circulo();
        System.out.println(predR.toString());
        System.out.println(predC.toString());
        Cuadrado predCua=new Cuadrado();
        System.out.println(predCua.toString());
        //pruebas
        Rectangulo rec=new Rectangulo("azul",2.3,4.9);
        System.out.println("AREA: "+rec.area()+" PERIMETRO: "+rec.perimetro());
        Circulo cir=new Circulo("verde",4.4);
        System.out.println("AREA: "+cir.area()+" PERIMETRO: "+cir.perimetro());
        Cuadrado cuad=new Cuadrado("rosa",3.0);
        System.out.println("AREA: "+cuad.area()+" PERIMETRO: "+cuad.perimetro());
    }

}