
package listas;

public class NodoEnlasadadobleCircular {
        String dato;
    NodoEnlasadadobleCircular siguiente;
    NodoEnlasadadobleCircular anterior;

    public NodoEnlasadadobleCircular(String dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}
