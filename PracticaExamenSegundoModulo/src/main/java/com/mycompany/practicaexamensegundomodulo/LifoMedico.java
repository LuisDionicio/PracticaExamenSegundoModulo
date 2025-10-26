
package com.mycompany.practicaexamensegundomodulo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LifoMedico {
    private nodoPregunta1 primero; // único nodo de apoyo (tope de la pila)
    private nodoPregunta1 ultimo;
    public LifoMedico() {
        primero = null;
        ultimo = null;
    }

    // Verifica si la pila está vacía
    public boolean lifoEstaVacia() {
        return primero == null;
    }

    // Push: agregar un médico
    public void lifoPush(Medico medico) {
        nodoPregunta1 nuevo = new nodoPregunta1(medico);
        nuevo.setSiguiente(primero);
        primero = nuevo;
        System.out.println("Medico agregado: " + medico.getNombMedi());
    }

    // Pop: eliminar el médico del tope
    public void lifoPop() {
        if (lifoEstaVacia()) {
            System.out.println("La pila esta vacia. No se puede eliminar.");
            return;
        }
        System.out.println(" Medico eliminado: " + primero.getMedico().getNombMedi());
        primero = primero.getSiguiente();
    }

    // Peek: ver el médico del tope
    public void lifoPeek() {
        if (lifoEstaVacia()) {
            System.out.println("La pila está vacia.");
            return;
        }
        Medico m = primero.getMedico();
        System.out.println("Medico en el tope:");
        System.out.println("Codigo: " + m.getCodeMedi());
        System.out.println("Nombre: " + m.getNombMedi());
        System.out.println("Fecha Nacimiento: " + m.getFechaNacim());
    }

    // Print: mostrar todos los médicos
    public void lifoPrint() {
        if (lifoEstaVacia()) {
            System.out.println("La pila está vacia.");
            return;
        }
        nodoPregunta1 actual = primero;
        System.out.println("Medicos en la pila:");
        while (actual != null) {
            Medico m = actual.getMedico();
            System.out.println("Codigo: " + m.getCodeMedi() +
                    ", Nombre: " + m.getNombMedi() +
                    ", Fecha Nacimiento: " + m.getFechaNacim());
            actual = actual.getSiguiente();
        }
    }


    public static void main(String[] args) {
        LifoMedico pila = new LifoMedico();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Agregar médicos
        pila.lifoPush(new Medico(101, "Dr Juan Perez", LocalDate.parse("1980-02-10", df)));
        pila.lifoPush(new Medico(102, "Dra luna Lopez", LocalDate.parse("1985-06-15", df)));
        pila.lifoPush(new Medico(103, "Dr Carlos Ruiz", LocalDate.parse("1990-09-21", df)));

        // Mostrar pila
        pila.lifoPrint();

        // Ver el tope
        pila.lifoPeek();

        // Eliminar un médico (pop)
        pila.lifoPop();

        // Mostrar pila después del pop
        pila.lifoPrint();

        // Ver el tope nuevamente
        pila.lifoPeek();
    
}
}

