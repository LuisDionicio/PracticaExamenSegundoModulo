package PreguntaDos;
public class Producto {

    private int codiprod;
    private String nombprod;
    private double precprod;
    private double stocprod;

    public Producto() {
    }

    public Producto(int codiprod, String nombprod) {
        this.codiprod = codiprod;
        this.nombprod = nombprod;
    }

    public Producto(int codiprod, String nombprod, double precprod, double stocprod) {
        this.codiprod = codiprod;
        this.nombprod = nombprod;
        this.precprod = precprod;
        this.stocprod = stocprod;
    }
    
    
    
}