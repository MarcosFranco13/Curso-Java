public class Cadenas {
    public static void main(String[] args) {
        System.out.println("*** Manejo de Cadenas en Java ***");
        var cadenas1 = "Hola";
        System.out.println("cadenas1 = " + cadenas1);

        var cadenas2 = new String("Mundo");
        System.out.println("cadenas2 = " + cadenas2);

        var cadena3 = cadenas1 + " " + cadenas2;
        System.out.println("cadena3 = " + cadena3);

        //Cadena de multiples lineas (text block)
        var cadena4 = """         
                Este es un texto 
                multilinea
                """;
        System.out.println("cadena4 = " + cadena4);

    }
}
