
package PreguntaDos;

public class Nodo {

    Producto valor;
    Nodo sig;
    Nodo ant;
    public Nodo(Producto valor){
       this.valor=valor;
       this.sig=null;
       this.ant=null;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }

    public Producto getValor() {
        return valor;
    }

    public void setValor(Producto valor) {
        this.valor = valor;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    
    
    
}