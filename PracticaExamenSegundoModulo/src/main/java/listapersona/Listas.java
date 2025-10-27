package listapersona;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.LinkedList;

public class Listas {

    List<Persona> listaMenorEdadFemenino = new LinkedList<>();
    List<Persona> listaMenorEdad = new LinkedList<>();
    List<Persona> listaFemenino = new LinkedList<>();
    List<Persona> listaGeneral = new LinkedList<>();

    public void agregar(Persona p){
        int edad=Period.between(p.getFechaNacimiento(), LocalDate.now()).getYears();
        char sexo=p.getSexo();
        if(edad<18 && sexo=='F'){
            listaMenorEdadFemenino.add(p);
        }else if(edad<18){
           listaMenorEdad.add(p);
        }else if(sexo=='F'){
            listaFemenino.add(p);
        }else{
            listaGeneral.add(p);
        }
               
    }
    public static void main(String[] args) {
        Listas listas=new Listas();
         Persona p1 = new Persona(1, "Ana", 'F', LocalDate.of(2010, 5, 12)); // Menor y Femenina
        Persona p2 = new Persona(2, "Luis", 'M', LocalDate.of(2015, 8, 3));  // Menor y Masculino
        Persona p3 = new Persona(3, "Maria", 'F', LocalDate.of(1995, 2, 25)); // Mayor y Femenina
        Persona p4 = new Persona(4, "Carlos", 'M', LocalDate.of(1988, 11, 1)); // Mayor y Masculino
        listas.agregar(p1);
        listas.agregar(p2);
        listas.agregar(p3);
        listas.agregar(p4);
        System.out.println("Lista Menor Edad Femenino:");
        listas.listaMenorEdadFemenino.forEach(p -> System.out.println(p.getNombre()));

        System.out.println("\nLista Menor Edad:");
        listas.listaMenorEdad.forEach(p -> System.out.println(p.getNombre()));

        System.out.println("\nLista Femenino:");
        listas.listaFemenino.forEach(p -> System.out.println(p.getNombre()));

        System.out.println("\nLista General:");
        listas.listaGeneral.forEach(p -> System.out.println(p.getNombre()));
    }
}
    