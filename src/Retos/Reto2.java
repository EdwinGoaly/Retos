package Retos;
import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) {
        int pesoBebe, mesesBebe, dosisVacuna;
        String nombreEnfermera, nombrePadre, nombreBebe;
        Scanner sn= new Scanner(System.in);
        System.out.println("Ingrese el nombre de la enfermera a cargo");
        nombreEnfermera = sn.nextLine();
        System.out.println("Ingrese el nombre del bebe");
        nombreBebe = sn.nextLine();
        System.out.println("Ingrese el nombre del padre");
        nombrePadre = sn.nextLine();
        System.out.println("Ingrese el peso del bebe en gramos");
        pesoBebe = sn.nextInt();
        System.out.println("Ingrese los meses del bebe");
        mesesBebe = sn.nextInt();
        dosisVacuna =(pesoBebe+10/mesesBebe*10)*8;
        System.out.println("El nombre de la enferma a cargo es: " + nombreEnfermera);
        System.out.println("El nombre del bebe es: "+ nombreBebe);
        System.out.println("El nombre del padre es: " + nombrePadre);
        System.out.println("La dosis de la vacuna que se le debe aplicar al bebe es de: " + dosisVacuna + " ml");
        sn.close();

    }
    
}
