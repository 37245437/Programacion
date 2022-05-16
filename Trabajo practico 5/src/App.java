import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner myObjet = new Scanner(System.in);
        System.out.println("\nSuma de 10 numeros");
        int num1 = 0, num2 = 0;
        do  {
            System.out.println("\nEscribir un numero");
            num1 = myObjet.nextInt();
            System.out.println("\nEscriba un numero");
            num2 = myObjet.nextInt();
        }while (num1 != num2);
        System.out.println("\nLos numeros ingresados son iguales");

        System.out.println("\nSumando con do-while");
        double num3;
        double contador = 1;
        double suma = 0;
        do {
            System.out.println("\nEscribir un numero");
            num3 = myObjet.nextDouble();
            suma = suma + num3;
            contador ++;
        }while (contador<=10);
        System.out.println("\nLa suma es " + suma);

        System.out.println("\nSumando con for");
        int sumar = 0;
        for (int i = 1; i <=10; i ++) {
            System.out.println("\nIngrese un numero " + i);
            int num4 = myObjet.nextInt();
            sumar = sumar + num4;   
        }System.out.println("\nLa suma es " + sumar); 
        
        System.out.println("\nDias");
        int dias;
        System.out.println("\nEscribe un numero del 1 al 7");
        dias = myObjet.nextInt();
        switch (dias) {
            case 1 :
            System.out.println("\nLunes");
            break;
            case 2 :
            System.out.println("\nMartes");
            break;
            case 3 :
            System.out.println("\nMiercoles");
            break;
            case 4 :
            System.out.println("\nJueves");
            break;
            case 5 :
            System.out.println("\nViernes");
            break;
            case 6 :
            System.out.println("\nSabado");
            break;
            case 7 :
            System.out.println("\nDomingo");
            break;
            default :
            System.out.println("\nEl numero ingresado es incorrecto");
        }

        System.out.println("\nSumando con do-while");
        double num5;
        double contador1 = 1;
        double suma1 = 0;
        double positivo = 0, negativo = 0;
        do {
            System.out.println("\nEscribir un numero");
            num5 = myObjet.nextDouble();
            suma1 = suma1 + num5;
            contador1 ++;
            if (num5 > 0) {
                positivo ++;
            }else {
                negativo ++;
            }
        }while (contador1<=10);
        System.out.println("\nLa suma de numeros es " + suma1 + "\nHay " + positivo + " numeros positivos" + "\nHay " + negativo + " numeros negativos");

        System.out.println("\nSumando con for");
        int sumar1 = 0;
        int positivo1 = 1, negativo1 = 1;
        for (int i = 1; i <=10; i ++) {
            System.out.println("\nIngrese un numero " + i);
            int num6 = myObjet.nextInt();
            sumar1 = sumar1 + num6;
            if (num6 > 0) {
                positivo1 ++;
            }else {
                negativo1 ++;
            }
              
        }System.out.println("\nLa suma de numeros " + sumar1 + "\nHay " + positivo1 + " numeros positivos" + "\nHay " + negativo1 + " numeros negativos" );

        System.out.println("\nDias");
        int notas = 0;
        System.out.println("\nEscribe la nota correspondiente");
        notas = myObjet.nextInt();
        switch (notas) {
            case 5 : 
            System.out.println("Suficiente");
            break;
            case 6 : 
            System.out.println("Bien");
            break;
            case 7 :
            System.out.println("Notable bajo");
            break;
            case 8 :
            System.out.println("Notable alto");
            break;
            case 9 :
            System.out.println("Sobresaliente");
            break;
            case 10 :
            System.out.println("Matricula de honor");
            break;
            default :
            if (notas < 5){
                System.out.println("Suspenso");
            }else {
                System.out.println("Nota superior");
            }
        }  
        myObjet.close();
    }
}
