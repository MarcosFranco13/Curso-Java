public class TipoVar {

    public static void main(String[] args) {
        System.out.println("*** Uso de var en Java ***");
        // Sin el uso de var
        String nombre1 = "Juan";
        System.out.println("nombre1 = " + nombre1);
        // Con el uso de var
        var nombre2 = "Carlos";
        System.out.println("nombre2 = " + nombre2);
        //Definir otras variables usando
        var edad = 30;
        System.out.println("edad = " + edad);
        var sueldo = 5000.5F;//Se infiere tipo float
        System.out.println("sueldo = " + sueldo);
        var esCasado = false; //Se infiere tipo boolean
        esCasado = true;
        //esCasado = "No" ; No podemos asignar un  tipo distinto al valor con que se creó inicialmente
        System.out.println("esCasado = " + esCasado);

        //Se debe definir su valor
        //var precio; Lanza un error, tenemos que asingar un valor

        //Se debe poder inferir el tipo de dato
       // var apellido = null; No se puede inferir el tipo de dato



    }

}
