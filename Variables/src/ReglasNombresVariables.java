public class ReglasNombresVariables {

    public static void main(String[] args) {
        //Reglas nombres variables
        String nombreCompleto = "Marcos Del Angel"; //Correcto, y buenas prácticas
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Marcos Del Angel 2"; //Correcto, no aplica las buenas prácticas
        System.out.println("NombreCompleto = " + NombreCompleto);
        //String nombre-cliente = "Marcos"; //Incorrecto
        String nombre_cliente = "Marcos"; //Correcto, no aplica buenas practicas
        String _apellido = "Del Angel"; //Correcto y aceptable
        String $apellido = "Franco"; //Correcta y aceptable
        int totPzs = 10; // Correcto, no aplica buenas practicas
        int totalPiezas = 10; //Correcto, aplica las buenas practicas
        boolean casado = true; //Correcto, aun puede mejorar
        boolean esCasado = false; //Coreccto, y aplica buenas practicas
        boolean isCasado = false; //Correcto y aplica buenas practicas *
        boolean tieneSaldo = true; //Correcto, aplica buenas practicas
        boolean hasSaldo = true; //Correcto, tiene buenas practicas*
    }
}
