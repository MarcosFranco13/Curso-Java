public class DetalleProducto {
    public static void main(String[] args) {
        //Detalle del producto
        System.out.println("*** Tienda en Linea (Detalle productos) ***");
        String nombreProducto = "Refrigerador";
        System.out.println("nombreProducto = " + nombreProducto);
        float precioProducto = 11999.99F;
        System.out.println("precio = " + precioProducto);
        int cantidadDisponible = 4;
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        boolean esDisponibleVenta = false;
        System.out.println("esDisponibleVenta = " + esDisponibleVenta);

        System.out.println();
        nombreProducto = "Ventilador";
        System.out.println("nombreProducto = " + nombreProducto);
        precioProducto = 899.99F;
        System.out.println("precio = " + precioProducto);
        cantidadDisponible = 10;
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        esDisponibleVenta = true;
        System.out.println("esDisponibleVenta = " + esDisponibleVenta);


    }
}
