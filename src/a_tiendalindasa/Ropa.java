
package a_tiendalindasa;

public class Ropa extends Producto {
    
    private String tipoDeTela;
    
//------------------------------------------------------------------------------
    
    public Ropa(String tipoDeTela, int codigo, String descripcion, String marca, double precioLista, int stock) {
        super(codigo, descripcion, marca, precioLista, stock);
        this.tipoDeTela = tipoDeTela;
    }
    public String getTipoDeTela() {
        return tipoDeTela;
    }

    public void setTipoDeTela(String tipoDeTela) {
        this.tipoDeTela = tipoDeTela;
    }
//------------------------------------------------------------------------------    
    @Override   
     public double calcularPrecioPublico(){

         return precioLista + (precioLista*0.4);
     }   
//------------------------------------------------------------------------------
    @Override
    public String toString() {
            return "ROPA"+"\n"+
           "---------------------------------"+"\n" +
           " Código       = " + codigo + "\n" +
           " Descripción  = " + descripcion + "\n" +
           " Marca        = " + marca + "\n" +
           " Precio       = " + precioLista + "\n" +           
           " Stock        = " + stock + "\n" +
           " Tipo de Tela = " + tipoDeTela + "\n" +
           "---------------------------------"+"\n" ;    
    }
    
}//fin class
