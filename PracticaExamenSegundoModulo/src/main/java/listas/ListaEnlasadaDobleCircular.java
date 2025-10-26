
package listas;

public class ListaEnlasadaDobleCircular {
    private NodoEnlasadadobleCircular cabeza;
    private NodoEnlasadadobleCircular cola;

    public ListaEnlasadaDobleCircular() {
        cabeza = null;
        cola = null;
    }

    // Agregar un nodo al final
    public void agregar(String dato) {
        NodoEnlasadadobleCircular nuevo = new NodoEnlasadadobleCircular(dato);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;
        } else {
            nuevo.anterior = cola;
            nuevo.siguiente = cabeza;
            cola.siguiente = nuevo;
            cabeza.anterior = nuevo;
            cola = nuevo;
        }
    }

    // Mostrar hacia adelante
    public void mostrarAdelante() {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        NodoEnlasadadobleCircular actual = cabeza;
        System.out.print("Lista circular hacia adelante: ");
        do {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        } while (actual != cabeza);
        System.out.println();
    }

    // Mostrar hacia atrás
    public void mostrarAtras() {
        if (cola == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        NodoEnlasadadobleCircular actual = cola;
        System.out.print("Lista circular hacia atrás: ");
        do {
            System.out.print(actual.dato + " ");
            actual = actual.anterior;
        } while (actual != cola);
        System.out.println();
    }

    // Eliminar un nodo por valor
    public void eliminar(String dato) {
        if (cabeza == null) return;

        NodoEnlasadadobleCircular actual = cabeza;
        boolean encontrado = false;

        do {
            if (actual.dato == dato) {
                encontrado = true;
                break;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);

        if (!encontrado) return;

        if (actual == cabeza && actual == cola) { // Solo un elemento
            cabeza = null;
            cola = null;
        } else if (actual == cabeza) { // Elimina el primero
            cabeza = cabeza.siguiente;
            cabeza.anterior = cola;
            cola.siguiente = cabeza;
        } else if (actual == cola) { // Elimina el último
            cola = cola.anterior;
            cola.siguiente = cabeza;
            cabeza.anterior = cola;
        } else { // En medio
            actual.anterior.siguiente = actual.siguiente;
            actual.siguiente.anterior = actual.anterior;
        }
    }
       public static void main(String[] args) {
        ListaEnlasadaDobleCircular lista = new ListaEnlasadaDobleCircular();

        lista.agregar("Luis");
        lista.agregar("Juan");
        lista.agregar("Jose");
        lista.agregar("Luna");

        lista.mostrarAdelante(); // 10 20 30 40
        lista.mostrarAtras();    // 40 30 20 10

        lista.eliminar("Luna");
        lista.mostrarAdelante(); // 10 20 40
    }
}
