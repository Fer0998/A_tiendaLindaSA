
package a_tiendalindasa;

import java.util.ArrayList;


public class Catalogo {
    
    private ArrayList<Producto> elemento;
    
public Catalogo(){
    
    this.elemento = new ArrayList();
}
//------------------------------------------------------------------------------
public void agregarProducto(Producto p){

    elemento.add(p);
    System.out.println("Producto agregado ");
}
//------------------------------------------------------------------------------
public void cantidadDeProductoDeCadaCategoria(){
    int ropa=0; int elec=0; int perf=0;
    
    for (Producto p:elemento){
        if (p instanceof Ropa){
            ropa+=1;
        }else if(p instanceof Electrodomestico){
            elec+=1;
        }else{
            perf+=1;
        }  
    }   
    System.out.println("-------------------------");
    System.out.println("Electrodomesticos = "+elec);
    System.out.println("Ropa              = "+ropa);
    System.out.println("Perfumeria        = "+perf);
    System.out.println("-------------------------");
}
//------------------------------------------------------------------------------
public void listaRopa(){
    
  for (Producto p:elemento){
        if (p instanceof Ropa){
            System.out.println(p); 
        }
  }
}
//------------------------------------------------------------------------------
public void listaElectro(){

    for (Producto p:elemento){
        if (p instanceof Electrodomestico){
            System.out.println(p); 
        }
    }
}
//------------------------------------------------------------------------------
public void listaPerfumeria(){

    for (Producto p:elemento){
        if (p instanceof Perfumeria){
            System.out.println(p); 
        }
    }
}
}// fin clas

