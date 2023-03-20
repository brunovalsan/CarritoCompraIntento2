package Clases;
import java.time.LocalDate;

public class Producto {

    private String nombre;
    private String codigo;
    private Double precio;

    public Producto(String nombre, String codigo, Double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getCodigo() {
        return this.codigo;
    }
    public Double getPrecio() {
        return this.precio;
    }

    Producto prod1 = new Producto("Leche")
}
