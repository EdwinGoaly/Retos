package Retos;
import java.util.Scanner;
public class Reto5 {
    public static void main(String[] args) {
        int mesNacimiento, diaNacimiento;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el día de su nacimiento 1-31");
        diaNacimiento= entrada.nextInt();
        System.out.println("Ingrese el mes de su nacimiento 1-12");
        mesNacimiento = entrada.nextInt();
        if(diaNacimiento>=22 && diaNacimiento<=31 && mesNacimiento==12 || diaNacimiento>=1 && diaNacimiento<=20 && mesNacimiento==1){
            System.out.println("Su signo zodiacal es Capricornio");
            System.out.println("Capricornio cuenta con las siguientes características:");
            System.out.println("1) Planean cada parte de su vida\n2) Son muy críticos\n3)Suelen ser muy exigentes cuando se trata de salir con alguien\n4) Están muy comprometidos con su trabajo\n5) Son emocionalmente reservados");
        }else if (diaNacimiento>=21 && diaNacimiento<=31 && mesNacimiento==1 || diaNacimiento>=1 && diaNacimiento<=19 && mesNacimiento==2){
            System.out.println("Su signo zodiacal es Acuario");
            System.out.println("Acuario cuenta con las siguientes características:");
            System.out.println("1) Creatividad\n2) Puede llegar a ser muy intelectual\n3) Carácter humanitario\n4) Alta capacidad de socializar\n5) Tolerancia\n6) Honestidad\n7) Inseguridad\n8) Les cuesta confiar en la gente\nSus naturaleza de ir a contracorriente puede hacerles sentir desplazados\nSe aburren con facilidad\nSolitarios");
        }else if (diaNacimiento>=20 && diaNacimiento<=29 && mesNacimiento==2 || diaNacimiento>=1 && diaNacimiento<=20 && mesNacimiento==3){
            System.out.println("Su signo zodiacal es Piscis");
            System.out.println("Piscis cuenta con las siguientes características:");
            System.out.println("1. Sensible y compasivo.\n2. Creativo e imaginativo.\n3. Intuitivo y empático.\n4. Misterioso y enigmático.\n5. Idealista y soñador.");
        }else if (diaNacimiento>=21 && diaNacimiento<=31 && mesNacimiento==3 || diaNacimiento>=1 && diaNacimiento<=19 && mesNacimiento==4){
            System.out.println("Su signo zodiacal es Aries");
            System.out.println("Aries cuenta con las siguientes características:");
            System.out.println("1. Impulsivo/a.\n2. Líder natural.\n3. Valiente.\n4. Energético/a.\n5. Apasionado/a.");
        }else if (diaNacimiento>=20 && diaNacimiento<=30 && mesNacimiento==4 || diaNacimiento>=1 && diaNacimiento<=20 && mesNacimiento==5){
            System.out.println("Su signo zodiacal es Tauro");
            System.out.println("Tauro cuenta con las siguientes características:");
            System.out.println("1. Fiel y perseverante\n2. Le gusta la estabilidad y la seguridad\n3. Confiado y seguro de sí mismo\n4. Práctico y trabajador\n5. Le encanta la buena comida y el confort\n");
        }else if (diaNacimiento>=21 && diaNacimiento<=31 && mesNacimiento==5 || diaNacimiento>=1 && diaNacimiento<=21 && mesNacimiento==6){
            System.out.println("Su signo zodiacal es Géminis");
            System.out.println("Géminis cuenta con las siguientes características:");
            System.out.println("Características de Géminis:\n1. Son sociables y divertidos.\n2. Les gusta aprender y explorar nuevas cosas.\n3. Son ingeniosos y astutos.\n4. Pueden ser un poco indecisos y cambiantes.\n5. Les encanta comunicarse y tienen habilidades para la persuasión.");
        }else if (diaNacimiento>=22 && diaNacimiento<=30 && mesNacimiento==6 || diaNacimiento>=1 && diaNacimiento<=21 && mesNacimiento==7){
            System.out.println("Su signo zodiacal es Cancer");
            System.out.println("Cancer cuenta con las siguientes características:");
            System.out.println("1. Emotivos e intuitivos\n2. Protector y compasivo\n3. Cambian de humor con facilidad\n4. Leales y familiares\n5. Sensibles y empáticos");
        }else if (diaNacimiento>=22 && diaNacimiento<=31 && mesNacimiento==7 || diaNacimiento>=1 && diaNacimiento<=21 && mesNacimiento==8){
            System.out.println("Su signo zodiacal es Leo");
            System.out.println("Leo cuenta con las siguientes características:");
        }else if (diaNacimiento>=22 && diaNacimiento<=31 && mesNacimiento==8 || diaNacimiento>=1 && diaNacimiento<=22 && mesNacimiento==9){
            System.out.println("Su signo zodiacal es Virgo");
            System.out.println("Virgo cuenta con las siguientes características:");
        }else if (diaNacimiento>=23 && diaNacimiento<=30 && mesNacimiento==9 || diaNacimiento>=1 && diaNacimiento<=22 && mesNacimiento==10){
            System.out.println("Su signo zodiacal es Libra");
            System.out.println("Libra cuenta con las siguientes características:");
        }else if (diaNacimiento>=23 && diaNacimiento<=31 && mesNacimiento==10 || diaNacimiento>=1 && diaNacimiento<=21 && mesNacimiento==11){
            System.out.println("Su signo zodiacal es Escorpio");
            System.out.println("Escorpio cuenta con las siguientes características:");
        }else if (diaNacimiento>=22 && diaNacimiento<=30 && mesNacimiento==11 || diaNacimiento>=1 && diaNacimiento<=21 && mesNacimiento==12){
            System.out.println("Su signo zodiacal es Sagitario");
            System.out.println("Sagitario cuenta con las siguientes características:");
        }
        else{
            System.out.println("Fecha incorrecta");
        }
        entrada.close();
    }
}
