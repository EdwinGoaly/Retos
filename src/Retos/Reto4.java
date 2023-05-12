package Retos;
import java.util.Scanner;
public class Reto4 {
    public static void main(String[] args) throws Exception {
        int eleccion, eleccionMaquina;
        Scanner sc = new Scanner(System.in);
        eleccionMaquina = (int) (Math.random()*3);
        System.out.println("--------------------------------------------------");
        System.out.println("                      BIENVENIDO             ");
        System.out.println("--------------------------------------------------");
        System.out.println();
        System.out.println("Elija una opcion, 1) PIEDRA 2) PAPEL, 3) TIJERA   ");
        System.out.println();
        System.out.println("--------------------------------------------------");
        eleccion = sc.nextInt();
        if(eleccion==1){
            if (eleccionMaquina==0) {
                System.out.println("--------------------------------------------------");
                System.out.println("El jugador ha seleccionado 1) PIEDRA");
                System.out.println("La maquina ha seleccionado 1) PIEDRA");
                System.out.println("HAS EMPATADO");
                System.out.println("--------------------------------------------------");
                
            } else if(eleccionMaquina==1){
                System.out.println("--------------------------------------------------");
                System.out.println("El jugador ha seleccionado 1) PIEDRA");
                System.out.println("La maquina ha seleccionado 3) TIJERA");
                System.out.println("HAS GANADO");
                System.out.println("--------------------------------------------------");
            } else{
                System.out.println("--------------------------------------------------");
                System.out.println("El jugador ha seleccionado 1) PIEDRA");
                System.out.println("La maquina ha seleccionado 1) PAPEL");
                System.out.println("HAS PERDIDO");
                System.out.println("--------------------------------------------------");
            }
        }else if(eleccion==2){
            if (eleccionMaquina==0) {
                System.out.println("--------------------------------------------------");
                System.out.println("El jugador ha seleccionado 2) PAPEL");
                System.out.println("La maquina ha seleccionado 3) TIJERA");
                System.out.println("HAS PERDIDO");
                System.out.println("--------------------------------------------------");
                
            } else if(eleccionMaquina==1){
                System.out.println("--------------------------------------------------");
                System.out.println("El jugador ha seleccionado 2) PAPEL");
                System.out.println("La maquina ha seleccionado 1) PIEDRA");
                System.out.println("HAS GANADO");
                System.out.println("--------------------------------------------------");
            } else{
                System.out.println("--------------------------------------------------");
                System.out.println("El jugador ha seleccionado 2) PAPEL");
                System.out.println("La maquina ha seleccionado 2) PAPEL");
                System.out.println("HAS EMPATADO");
                System.out.println("--------------------------------------------------");
            }

        }else if(eleccion==3){
            if (eleccionMaquina==0) {
                System.out.println("--------------------------------------------------");
                System.out.println("El jugador ha seleccionado 3) TIJERA");
                System.out.println("La maquina ha seleccionado 1) PAPEL");
                System.out.println("HAS GANADO");
                System.out.println("--------------------------------------------------");
                
            } else if(eleccionMaquina==1){
                System.out.println("--------------------------------------------------");
                System.out.println("El jugador ha seleccionado 3) TIJERA");
                System.out.println("La maquina ha seleccionado 3) TIJERA");
                System.out.println("HAS EMPATADO");
                System.out.println("--------------------------------------------------");
            } else{
                System.out.println("--------------------------------------------------");
                System.out.println("El jugador ha seleccionado 3) TIJERA");
                System.out.println("La maquina ha seleccionado 2) PIEDRA");
                System.out.println("HAS PERDIDO");
                System.out.println("--------------------------------------------------");
            }
        } else{
            System.out.println("ELECCION INCORRECTA");
        }
        sc.close();
    }
}

