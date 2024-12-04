
package a_tiendalindasa;


public class Producto {
    
    protected int codigo;
    protected String descripcion;
    protected String marca; 
    protected double precioLista;
    protected int stock;

    public Producto(int codigo, String descripcion, String marca, double precioLista, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.marca = marca;
        this.precioLista = precioLista;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecioLista() {
        return precioLista;
    }

    public void setPrecioLista(double precioLista) {
        this.precioLista = precioLista;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
 public double calcularPrecioPublico(){
 
     return precioLista;
 }   

    
}// fin class
