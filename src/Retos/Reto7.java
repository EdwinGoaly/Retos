package Retos;
import java.util.Scanner;
public class Reto7 {
    public static void main(String[] args) {
        int precioCompra=0,precio,productos;
        Scanner entrada = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("Ingrese la cantidad de productos");
        System.out.println("--------------------------------------------------");
        productos = entrada.nextInt();
        for(int i=1; i<=productos; i++){
            System.out.println("--------------------------------------------------");
            System.out.println("Ingrese el precio del producto "+i);
            System.out.println("--------------------------------------------------");
            precio = entrada.nextInt();
            precioCompra+=precio;
        }
        System.out.println("El total de su compra es de: "+precioCompra+"$");
        entrada.close();
    }
}
