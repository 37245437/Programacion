import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("\nMeses\n");
        int mes;
        System.out.println("Escribe un numero entre 1 y 12");
        Scanner myObjet = new Scanner (System.in);
        mes = myObjet.nextInt();
        switch (mes) {
            case 1 :
            System.out.println("Enero");
            break;
            case 2 :
            System.out.println("Febrero");
            break;
            case 3 :
            System.out.println("Marzo");
            break;
            case 4 :
            System.out.println("Abril");
            break;
            case 5 :
            System.out.println("Mayo");
            break;
            case 6 :
            System.out.println("Junio");
            break;
            case 7 :
            System.out.println("Julio");
            break;
            case 8 :
            System.out.println("Agosto");
            break;
            case 9 :
            System.out.println("Septiembre");
            break;
            case 10 :
            System.out.println("Octubre");
            break;
            case 11 :
            System.out.println("Noviembre");
            break;
            case 12 :
            System.out.println("Diciembre");
            break;
            default :
            System.out.println("El numero ingresado no es correcto");
        }

        System.out.println("\nTabla de multiplicacion\n");
        int n1, n2;
        int multiplicador = 1;
        System.out.println ("Ingrese un numero entero del 1 al 10");
        n1 = myObjet.nextInt();
        System.out.println ("Ingrese hasta que numero quiere mostrar");
        n2 = myObjet.nextInt();
        if (n1 >= 1 && n1 <= 10) {
            while (multiplicador <= n2) {
                System.out.println(n1 + " * " + n2 + " = " + n1*multiplicador);
                multiplicador ++;
            }
        }else {
            System.out.println ("El numero ingresado es incorrecto");
        }

        System.out.println("\nTabla de multiplicacion\n");
        int n3, n4;
        int multiplicador1 = 1;
        System.out.println ("Ingrese un numero entero del 1 al 10");
        n3 = myObjet.nextInt();
        System.out.println ("Ingrese hasta que numero queire mostrar");
        n4 = myObjet.nextInt();
        if (n3 >= 1 && n3 <= 10) {
            do {
                System.out.println(n3 + " * " + n4 + " = " + n3*multiplicador1);
                multiplicador1 ++;
            }while (multiplicador1 <= n4);

        }else {
            System.out.println ("El numero ingresado es incorrecto");
        }
        
        System.out.println("\nPromedio\n");
        System.out.println();
        double acumulador = 0;
        double promedio, numero;
        for (int i=1; i <= 4; i++) {
            System.out.println ("Ingrese un numero" + i);
            numero = myObjet.nextInt();
            acumulador = acumulador + numero;
            promedio = acumulador/4;
            System.out.println ("El promedio es " + promedio);       
        }
        myObjet.close();
    }
            
}
