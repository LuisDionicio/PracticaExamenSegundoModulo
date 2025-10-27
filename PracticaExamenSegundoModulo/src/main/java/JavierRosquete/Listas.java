package JavierRosquete;

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
        if(edad>=18 && sexo=='F'){
            listaMenorEdadFemenino.add(p);
        }else if(edad>=18){
           listaMenorEdad.add(p);
        }else if(sexo=='F'){
            listaFemenino.add(p);
        }else{
            listaGeneral.add(p);
        }
               
    }
    
}
