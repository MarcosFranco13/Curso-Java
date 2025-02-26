import java.util.Scanner;

public class ReservacionHotel {
    public static void main(String[] args) {
        System.out.println("*** Captura de datalles de reservación de hoteles ***");

        //Definimos variables
        String nombreCliente = "Manuel Castillo";
        int diasEstancia = 15;
        float tarifaDiaria = 499.99F;
        Boolean tieneHabitacionVistaMar = true;

        //Imprime detalles de la reserva
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("tieneHabitacionVistaMar = " + tieneHabitacionVistaMar);

        //Modificación de reserva
        System.out.println("*** Modificación de valores ***");
        nombreCliente = "Marcos Del Angel";
        diasEstancia = 8;
        tarifaDiaria = 399.99F;
        tieneHabitacionVistaMar = false;

        //Imprimir detalles de la reserva
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("tieneHabitacionVistaMar = " + tieneHabitacionVistaMar);




    }
}
