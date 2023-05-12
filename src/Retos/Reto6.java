


package Retos;
import java.util.Scanner;
public class Reto6{
    public static void main(String[] args) throws Exception {
        int eleccionMaquina, eleccion;
        boolean a= false;
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("                      BIENVENIDO             ");
        System.out.println("--------------------------------------------------");
        while(!a){
            System.out.println("--------------------------------------------------");
            System.out.println("Elija una opcion, 1) PIEDRA 2) PAPEL, 3) TIJERA 4) SALIR  ");
            System.out.println("--------------------------------------------------");
            eleccion = sc.nextInt();
            eleccionMaquina= (int)(Math.random()*3);
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
                } else if(eleccionMaquina==2){
                    System.out.println("--------------------------------------------------");
                    System.out.println("El jugador ha seleccionado 1) PIEDRA");
                    System.out.println("La maquina ha seleccionado 2) PAPEL");
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
                } else if(eleccionMaquina==2){
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
                    System.out.println("La maquina ha seleccionado 2) PAPEL");
                    System.out.println("HAS GANADO");
                    System.out.println("--------------------------------------------------");
                
                } else if(eleccionMaquina==1){
                    System.out.println("--------------------------------------------------");
                    System.out.println("El jugador ha seleccionado 3) TIJERA");
                    System.out.println("La maquina ha seleccionado 3) TIJERA");
                    System.out.println("HAS EMPATADO");
                    System.out.println("--------------------------------------------------");
                } else if(eleccionMaquina==2){
                    System.out.println("--------------------------------------------------");
                    System.out.println("El jugador ha seleccionado 3) TIJERA");
                    System.out.println("La maquina ha seleccionado 2) PIEDRA");
                    System.out.println("HAS PERDIDO");
                    System.out.println("--------------------------------------------------");
                }

            }else if(eleccion == 4){
                System.out.println("--------------------------------------------------");
                System.out.println("HAS DECIDIDO SALIR ");
                System.out.println("--------------------------------------------------");
                a=true;

            } else{
                System.out.println("--------------------------------------------------");
                System.out.println("ELECCION INCORRECTA");
                System.out.println("--------------------------------------------------");
            }
        }
        sc.close();
    }
}
