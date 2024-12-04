
package a_tiendalindasa;

public class A_tiendaLindaSA {

 
    public static void main(String[] args) {
      
    Catalogo agendaProductos = new Catalogo();
   
    Producto r1 = new Ropa("Algodón",101,"Camiseta blanca de manga corta","Nike",4500.99, 25);
    Producto r2 = new Ropa("Poliéster",102,"Pantalón deportivo negro","Adidas",7500.50, 15);
    Producto r3 = new Ropa("Denim", 103,"Jeans azul clásico","Levi's",12000.00,10);
    Producto r4 = new Ropa("Lana",104,"Suéter gris de invierno","Zara",8500.75,20);
    Producto e1 = new Electrodomestico(800,201,"Licuadora de alta velocidad","Philips",12000.99,30);
    Producto e2 = new Electrodomestico(1500,202,"Microondas con grill","Samsung",22000.50,20);
    Producto e3 = new Electrodomestico(2500,203,"Horno eléctrico","LG",35000.00,10);
    Producto e4 = new Electrodomestico(1200,204,"Aspiradora inalámbrica","Dyson",45000.75, 5);

    Producto p1 = new Perfumeria(50,301,"Perfume floral","Chanel",15000.99, 20);
    Producto p2 = new Perfumeria(100,302, "Eau de toilette fresco","Dior",25000.50,15);
    Producto p3 = new Perfumeria(75,303,"Colonia cítrica","Carolina Herrera",18000.75, 10);
    Producto p4 = new Perfumeria(30,304,"Perfume amaderado","Versace",12000.99, 25);

    agendaProductos.agregarProducto(r1);
    agendaProductos.agregarProducto(r2);
    agendaProductos.agregarProducto(r3);
    agendaProductos.agregarProducto(r4);
    agendaProductos.agregarProducto(e1);
    agendaProductos.agregarProducto(e2);
    agendaProductos.agregarProducto(e3);
    agendaProductos.agregarProducto(e4);
    agendaProductos.agregarProducto(p1);
    agendaProductos.agregarProducto(p2);
    agendaProductos.agregarProducto(p3);
    agendaProductos.agregarProducto(p4);
    
    agendaProductos.cantidadDeProductoDeCadaCategoria();
    agendaProductos.listaRopa();
    agendaProductos.listaElectro();
    agendaProductos.listaPerfumeria();
    }
    
}
