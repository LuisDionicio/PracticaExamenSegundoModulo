package PreguntaDos;

public class ListaDoblementeEnlazada {

Nodo inicio;
Nodo fin;

    public void agregarInicio(Producto producto) {
        Nodo nuevo = new Nodo(producto);
        if (inicio == null) {
            inicio = fin = nuevo;
        } else {
            nuevo.sig = inicio;
            inicio.ant = nuevo;
            inicio = nuevo;
        }
    }

    public String imprimirAtrasAdelante() {
        String resultado = "";
        Nodo actual = fin;
        while (actual != null) {
            resultado += actual.valor.toString() + "\n";
            actual = actual.ant;
        }
        return resultado;
    }

    public void eliminarUltimo() {
        if (fin == null) {
            System.out.println("Lista vacía, no se puede eliminar.");
        } else if (inicio == fin) { 
            inicio = fin = null;
        } else {
            fin = fin.ant;
            fin.sig = null;
        }
    }

    public void eliminarPrimero() {
        if (inicio == null) {
            System.out.println("Lista vacía, no se puede eliminar.");
        } else if (inicio == fin) {
            inicio = fin = null;
        } else {
            inicio = inicio.sig;
            inicio.ant = null;
        }
    }
        
}