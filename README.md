# Aplicación de Catálogo de Productos - Tienda RopaLinda SA

Este proyecto permite gestionar un catálogo de productos para la tienda RopaLinda SA, que ofrece productos de tres categorías: Ropa, Electrodomésticos y Perfumería. Cada producto tiene atributos comunes como código, descripción, marca, precio y stock, y atributos adicionales según su categoría.

## Funcionalidades

- **Agregar productos**: Permite agregar productos de las tres categorías.
- **Cantidad de productos por categoría**: Muestra la cantidad de productos de cada categoría (Ropa, Perfumería, Electrodomésticos).
- **Listar productos por categoría**: Permite listar los productos de cada categoría.
- **Calcular precio público**: Cada tipo de producto tiene un incremento específico sobre el precio base:
  - **Electrodomésticos**: 25% de aumento.
  - **Ropa**: 40% de aumento.
  - **Perfumería**: 20% de aumento por cada 100cc.

## Interacción en el Main
1. Instanciar el catálogo.
2. Crear manualmente dos productos de cada categoría.
3. Agregar los productos al catálogo.
4. Obtener la cantidad de productos por categoría.
5. Listar los productos de cada categoría.

## UML
Las clases principales son:
- **Catalogo**: Gestiona los productos.
- **Producto**: Clase base para los productos comunes.
- **Ropa, Electrodomestico, Perfumeria**: Clases específicas que heredan de Producto y definen el cálculo del precio público.

Este sistema permite a la tienda RopaLinda SA gestionar eficientemente su catálogo de productos.
