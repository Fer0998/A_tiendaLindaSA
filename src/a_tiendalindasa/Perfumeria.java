
package a_tiendalindasa;


public class Perfumeria extends Producto {
    
    private int tamañoEnCC;

 //------------------------------------------------------------------------------
    public Perfumeria(int tamañoEnCC, int codigo, String descripcion, String marca, double precioLista, int stock) {
        super(codigo, descripcion, marca, precioLista, stock);
        this.tamañoEnCC = tamañoEnCC;
    }

    public int getTamañoEnCC() {
        return tamañoEnCC;
    }

    public void setTamañoEnCC(int tamañoEnCC) {
        this.tamañoEnCC = tamañoEnCC;
    }
    
 //------------------------------------------------------------------------------
    @Override   
     public double calcularPrecioPublico(){

         return precioLista + (precioLista*0.2);
     }          

    @Override
    public String toString() {
            return "PERFUMERÍA"+"\n"+
           "---------------------------------"+"\n" +
           " Código       = " + codigo + "\n" +
           " Descripción  = " + descripcion + "\n" +
           " Marca        = " + marca + "\n" +
           " Precio       = " + precioLista + "\n" +           
           " Stock        = " + stock + "\n" +
           " Tamaño en CC = " + tamañoEnCC +" CC"+"\n" +
           "---------------------------------"+"\n" ;    
    }
    
}// fin class
