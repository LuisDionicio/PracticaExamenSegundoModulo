
package listas;

public class ListasEnlasadaDoble {
    private NodoEnlasadaDoble cabeza;
    private NodoEnlasadaDoble cola;

    public ListasEnlasadaDoble() {
        cabeza = null;
        cola = null;
    }

    // Agregar al final
    public void agregar(String dato) {
        NodoEnlasadaDoble nuevo = new NodoEnlasadaDoble(dato);
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }

    // Mostrar de inicio a fin
    public void mostrarAdelante() {
        NodoEnlasadaDoble actual = cabeza;
        System.out.print("Lista hacia adelante: ");
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    // Mostrar de fin a inicio
    public void mostrarAtras() {
        NodoEnlasadaDoble actual = cola;
        System.out.print("Lista hacia atrás: ");
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.anterior;
        }
        System.out.println();
    }

    // Eliminar un nodo por valor
    public void eliminar(String dato) {
        NodoEnlasadaDoble actual = cabeza;
        while (actual != null) {
            if (actual.dato == dato) {
                if (actual == cabeza) {
                    cabeza = actual.siguiente;
                    if (cabeza != null) cabeza.anterior = null;
                } else if (actual == cola) {
                    cola = actual.anterior;
                    if (cola != null) cola.siguiente = null;
                } else {
                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                }
                return; // elemento eliminado
            }
            actual = actual.siguiente;
        }
    }
    public static void main(String[] args) {
        ListasEnlasadaDoble lista = new ListasEnlasadaDoble();

        lista.agregar("Juan");
        lista.agregar("Luis");
        lista.agregar("Carlos");

        lista.mostrarAdelante(); // 10 20 30
        lista.mostrarAtras();    // 30 20 10

        lista.eliminar("Luis");
        lista.mostrarAdelante(); // 10 30
    }
}

