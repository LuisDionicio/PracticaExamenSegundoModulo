package PreguntaUno;

import java.time.LocalDate;

public class Factura {

  private int codiFact;
  private LocalDate fechFact;   
 private Cliente cliente;

    public Factura(int codiFact, LocalDate fechFact, Cliente cliente) {
        this.codiFact = codiFact;
        this.fechFact = fechFact;
        this.cliente = cliente;
    }

    public int getCodiFact() {
        return codiFact;
    }

    public void setCodiFact(int codiFact) {
        this.codiFact = codiFact;
    }

    public LocalDate getFechFact() {
        return fechFact;
    }

    public void setFechFact(LocalDate fechFact) {
        this.fechFact = fechFact;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
  
    
    
    
    
    
    
    
}