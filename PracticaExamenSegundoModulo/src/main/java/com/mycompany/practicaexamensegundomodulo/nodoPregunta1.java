

package com.mycompany.practicaexamensegundomodulo;


public class nodoPregunta1 {
    private Medico medico;
    private nodoPregunta1 siguiente;

    public nodoPregunta1(Medico medico) {
        this.medico = medico;
        this.siguiente = null;
    }

    // Getters y Setters
    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public nodoPregunta1 getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodoPregunta1 siguiente) {
        this.siguiente = siguiente;
    }
}
  