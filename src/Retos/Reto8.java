package Retos;
import java.util.Scanner;
public class Reto8 {
    public static void main(String[] args) {
        int cantidadDinero, valorGanado = 0, resultadoAlea, opcion, i = 0;
        String moneda;
        boolean repetir = false;
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE LA CANTIDAD DE DINERO PARA APOSTAR");
        cantidadDinero = entrada.nextInt();
        entrada.nextLine(); // consume el carácter de nueva línea
        do {
            System.out.println("ELIJA UNA OPCION\n1) CARA\n2) SELLO");
            moneda = entrada.nextLine().toUpperCase();
            resultadoAlea = (int) (Math.random() * 5 + 1);
            if (resultadoAlea == 1 || resultadoAlea == 3 || resultadoAlea == 4) {
                System.out.println("Usted ha elegido opción " + moneda);
                System.out.println("Has ganado la apuesta");
                valorGanado += cantidadDinero;
                System.out.println("Tu dinero acumulado es " + valorGanado);
            } else {
                System.out.println("Usted ha elegido la opción " + moneda);
                System.out.println("Has perdido la apuesta");
                valorGanado -= cantidadDinero;
                System.out.println("Tu dinero acumulado es " + valorGanado);
            }
            System.out.println("¿Desea seguir jugando? 1.SI, 2.NO");
            opcion = entrada.nextInt();
            if (opcion == 1) {
                repetir = false;
            } else if (opcion == 2) {
                repetir = true;
            } 
            i++;
        } while (!repetir && valorGanado > 0);
        if (repetir) {
            System.out.println("Has decidido abandonar el juego");
            System.out.println("Jugaste " + i + " veces y tu dinero acumulado es: " + valorGanado);
        } else {
            System.out.println("No tienes suficiente dinero para seguir jugando");
            System.out.println("Jugaste " + i + " veces y tu dinero acumulado es: " + valorGanado);
        }
        entrada.close();
    }
}
