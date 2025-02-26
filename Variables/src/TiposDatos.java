public class TiposDatos {
    public static void main(String[] args) {
        // Tipo de Datos en java
        //Entero (Su valor por default es 0)
        byte tipoByte = (byte)128; //Maximo 8byte 127
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321098765432L; //Para poder soportar mas digitos indicamos con una literal al ultimo eb mayuscula
        System.out.println("tipoLong = " + tipoLong);

        //punto flotante (Su valor por defecto es 0.0)
        float tipoFloat = 3.14F;
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315;
        System.out.println("tipoDouble = " + tipoDouble);

        //Caracter (Valor por default '\u0000')
        char tipoChar = 'A'; //Caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 64;
        System.out.println("tipoChar = " + tipoChar);

        //Booleano (Valor por default false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        //Tipos Object (Referencia Valor por default null)
        String nombre = null;
        System.out.println("nombre = " + nombre);
        nombre = "Marcos";
        System.out.println("nombre = " + nombre);
        

    }
}
