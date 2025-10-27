package PreguntaUno;

public class Nodo {

    Factura valor;
    Nodo sig;
    
    public Nodo(Factura valor){
     this.valor=valor;
     this.sig=null;
    }

    public Factura getValor() {
        return valor;
    }

    public void setValor(Factura valor) {
        this.valor = valor;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    
    
    
}