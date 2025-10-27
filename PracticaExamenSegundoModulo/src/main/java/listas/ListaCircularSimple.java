
package listas;

public class ListaCircularSimple {
 private NodoListaCircularSimple cabeza;

    public ListaCircularSimple() {
        cabeza = null;
    }

    // Verificar si la lista está vacía
    public boolean estaVacia() {
        return cabeza == null;
    }

    // Insertar al final
    public void insertar(int dato) {
        NodoListaCircularSimple nuevo = new NodoListaCircularSimple(dato);
        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza; // Apunta a sí mismo
        } else {
            NodoListaCircularSimple actual = cabeza;
            while (actual.siguiente != cabeza) { // recorrer hasta el último
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
            nuevo.siguiente = cabeza; // último apunta al primero
        }
    }

    // Mostrar la lista (una vuelta)
    public void imprimir() {
        if (estaVacia()) {
            System.out.println("La lista está vacía");
            return;
        }
        NodoListaCircularSimple actual = cabeza;
        do {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        } while (actual != cabeza);
        System.out.println("(vuelta al inicio)");
    }
}

