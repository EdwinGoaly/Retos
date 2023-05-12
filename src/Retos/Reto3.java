package Retos;
import java.util.Scanner;
public class Reto3 {
    //cara o sello
    public static void main(String[] args) {
        String resulLanzamiento;
        String eleccion;
        int random  = (int)(Math.random()*2+1);
        Scanner entrada = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Escoja alguna de las siguientes opciones y escribela:\nSello\nCara");
        System.out.println("-------------------------------------------------------------------");
        eleccion = entrada.next();
        switch (random) {
            case 1:
            resulLanzamiento="Sello";
            if (eleccion.equalsIgnoreCase("Sello")){
                System.out.println("---------------------------------------------------------------------------------------------");
                System.out.println("Seleccionaste "+eleccion+" y el resultado del lanzamiento fue "+resulLanzamiento+", HAS GANADO");
                System.out.println("---------------------------------------------------------------------------------------------");
            } else{
                System.out.println("---------------------------------------------------------------------------------------------");
                System.out.println("Seleccionaste "+eleccion+" y el resultado del lanzamiento fue "+resulLanzamiento+", HAS PERDIDO");
                System.out.println("---------------------------------------------------------------------------------------------");
            }
                break;
            case 2:    
            resulLanzamiento= "Cara";
            if (eleccion.equals("2") || eleccion.equalsIgnoreCase("Cara")){
                System.out.println("---------------------------------------------------------------------------------------------");
                System.out.println("Seleccionaste "+eleccion+" y el resultado del lanzamiento fue "+resulLanzamiento+", HAS GANADO");
                System.out.println("---------------------------------------------------------------------------------------------");
            } else{
                System.out.println("---------------------------------------------------------------------------------------------");
                System.out.println("Seleccionaste "+eleccion+" y el resultado del lanzamiento fue "+resulLanzamiento+", HAS PERDIDO");
                System.out.println("---------------------------------------------------------------------------------------------");
            }
                break;        
        }
        entrada.close();

    }
}
