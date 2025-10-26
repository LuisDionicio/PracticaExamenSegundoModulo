
package com.mycompany.practicaexamensegundomodulo;

import java.time.LocalDate;


public class Medico {
    private int codeMedi;
    private String nombMedi;
    private LocalDate fechaNacim;

    public Medico(int codeMedi, String nombMedi, LocalDate fechaNacim) {
        this.codeMedi = codeMedi;
        this.nombMedi = nombMedi;
        this.fechaNacim = fechaNacim;
    }

    // Getters y Setters
    public int getCodeMedi() {
        return codeMedi;
    }

    public void setCodeMedi(int codeMedi) {
        this.codeMedi = codeMedi;
    }

    public String getNombMedi() {
        return nombMedi;
    }

    public void setNombMedi(String nombMedi) {
        this.nombMedi = nombMedi;
    }

    public LocalDate getFechaNacim() {
        return fechaNacim;
    }

    public void setFechaNacim(LocalDate fechaNacim) {
        this.fechaNacim = fechaNacim;
    }
} 
