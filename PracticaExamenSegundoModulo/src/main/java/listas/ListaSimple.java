
package listas;

import java.util.Arrays;

public class ListaSimple {
     private int[] lista;
    private int tamaño;

    public ListaSimple(int capacidad) {
        lista = new int[capacidad];
        tamaño = 0;
    }

    // Insertar al final
    public void insertar(int dato) {
        if (tamaño < lista.length) {
            lista[tamaño] = dato;
            tamaño++;
        } else {
            // Si se llena, ampliar el arreglo
            lista = Arrays.copyOf(lista, lista.length * 2);
            lista[tamaño] = dato;
            tamaño++;
        }
    }

    // Eliminar el último elemento
    public void eliminarUltimo() {
        if (tamaño > 0) {
            tamaño--;
        } else {
            System.out.println("La lista está vacía");
        }
    }

    // Mostrar la lista
    public void imprimir() {
        for (int i = 0; i < tamaño; i++) {
            System.out.print(lista[i] + " -> ");
        }
        System.out.println("null");
    }

    // Verificar si está vacía
    public boolean estaVacia() {
        return tamaño == 0;
    }
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple(5);

        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);

        lista.imprimir(); // 10 -> 20 -> 30 -> null

        lista.eliminarUltimo();
        lista.imprimir(); // 10 -> 20 -> null

        System.out.println("¿La lista está vacía? " + lista.estaVacia());
    }
}


