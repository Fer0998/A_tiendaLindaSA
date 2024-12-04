
package a_tiendalindasa;


public class Electrodomestico extends Producto {
    
    private int consumoEnW;
    
//------------------------------------------------------------------------------    

    public Electrodomestico(int consumoEnW, int codigo, String descripcion, String marca, double precioLista, int stock) {
        super(codigo, descripcion, marca, precioLista, stock);
        this.consumoEnW = consumoEnW;
    }

    public int getConsumoEnW() {
        return consumoEnW;
    }

    public void setConsumoEnW(int consumoEnW) {
        this.consumoEnW = consumoEnW;
    }
//------------------------------------------------------------------------------
    @Override   
     public double calcularPrecioPublico(){

         return precioLista + (precioLista*0.25);
     }       

    @Override
    public String toString() {
            return "ELECTRODOMESTICO"+"\n"+
           "---------------------------------"+"\n" +
           " Código       = " + codigo + "\n" +
           " Descripción  = " + descripcion + "\n" +
           " Marca        = " + marca + "\n" +
           " Precio       = " + precioLista + "\n" +           
           " Stock        = " + stock + "\n" +
           " Consumo en W = " + consumoEnW + " W"+"\n" +
           "---------------------------------"+"\n" ;    
    }
   
}// fin class
