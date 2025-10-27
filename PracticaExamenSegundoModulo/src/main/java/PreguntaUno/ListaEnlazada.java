package PreguntaUno;

import java.time.LocalDate;
import java.time.Month;

public class ListaEnlazada {

    Nodo raiz = null;

    public void agregar(Factura factura) {
        if (raiz == null) {
            raiz = new Nodo(factura);
        } else {
            Nodo p = raiz;
            while (p.getSig() != null) {
                p = p.getSig();
            }
            p.setSig(new Nodo(factura));

        }
    }

    public String mostrar() {
        String resultado = "";
        Nodo f = raiz;

        while (f != null) {
            resultado += "Factura 0" + f.getValor().getCodiFact()
                    + " - " + f.getValor().getFechFact() + " - " + f.getValor().getCliente().getNombClie()+"\n";
            f = f.getSig();
        }
        return resultado;

    }

    public static void main(String[] args) {

        ListaEnlazada lista = new ListaEnlazada();

        lista.agregar(new Factura(01, LocalDate.of(2025, 01, 01), new Cliente(1, "Carlos Chinga")));
        lista.agregar(new Factura(02, LocalDate.of(2025, 01, 03), new Cliente(2, "Juan Chinga")));
        lista.agregar(new Factura(03, LocalDate.of(2025, 02, 03), new Cliente(3, "Luis Chinga")));
        lista.agregar(new Factura(04, LocalDate.of(2025, 01, 01), new Cliente(4, "Luis Dionicio")));
        lista.agregar(new Factura(05, LocalDate.of(2025, 01, 01), new Cliente(5, "Jesus Dionicio")));

        System.out.println(lista.mostrar());
    }

}
 
