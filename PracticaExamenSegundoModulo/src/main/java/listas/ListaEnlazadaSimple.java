
package listas;

public class ListaEnlazadaSimple {
   private NodoListaEnlasadaSimple cabeza;

    public ListaEnlazadaSimple() {
        cabeza = null;
    }

    // Verificar si la lista está vacía
    public boolean estaVacia() {
        return cabeza == null;
    }

    // Insertar al final
    public void insertar(int dato) {
        NodoListaEnlasadaSimple nuevo = new NodoListaEnlasadaSimple(dato);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoListaEnlasadaSimple actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    // Mostrar la lista
    public void imprimir() {
        NodoListaEnlasadaSimple actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    // Eliminar el primer nodo
    public void eliminarPrimero() {
        if (!estaVacia()) {
            cabeza = cabeza.siguiente;
        } else {
            System.out.println("La lista está vacía");
        }
    } 
     public static void main(String[] args) {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();

        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);

        lista.imprimir(); // 10 -> 20 -> 30 -> null

        lista.eliminarPrimero();
        lista.imprimir(); // 20 -> 30 -> null
    }
}
