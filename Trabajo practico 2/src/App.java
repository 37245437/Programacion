import java.util.Scanner;

public class App {
    
    public static void main(String[]args) {

        //Ejercicio 1
        Scanner elObj = new Scanner (System.in);
        System.out.println("Intercambio de variables");
        System.out.println("Ingresa un numero");
        int  varA = elObj.nextInt();
        System.out.println("Ingresa otro numero");
        int  varB = elObj.nextInt();
        System.out.println("Ha ingresado las siguientes variables A= " + varA + " B= " + varB);
        int vari0 = varA + varB;
        int variB = vari0 - varB;
        int variA = vari0 - varA;
        System.out.println("Intercambio de variables A= " + variA + " B= " + variB);
        
        System.out.println(" ");

        //Ejercicio 2
        System.out.println("Operaciones Basicas");
        System.out.println("Ingresa un numero");
        Double  num1 = elObj.nextDouble();
        System.out.println("Ingresa otro numero");
        Double  num2 = elObj.nextDouble();
        if (num2 == 0) { 
            System.out.println("Ingresa un numero distinto de cero");
            num2 = elObj.nextDouble();
        }
        Double suma = num1 + num2, resta = num1 - num2, mult = num1 * num2, div = num1 / num2;
        System.out.println("Resultado suma " + suma + ", resta " + resta + ", multiplicacion " + mult + ", division " + div);

        System.out.println(" ");

        //Ejercicio 3
        System.out.println("Cual es mayor");
        System.out.println("Ingresa 1er numero");
        int  num3 = elObj.nextInt();
        System.out.println("Ingresa 2do numero");
        int  num4 = elObj.nextInt();
        if (num3 == num4) {
            System.out.println("Son numeros iguales");
        } else if(num3 > num4){
            System.out.println("El 1er numero ingresado es mayor " + num3);
        } else {
            System.out.println("El 2do numero ingresado es mayor " + num4);
        }

        System.out.println(" ");

        //Ejercicio 4
        System.out.println("Cual es mayor");
        System.out.println("Ingresa el 1er numero");
        int  num5 = elObj.nextInt();
        System.out.println("Ingresa el 2do nueero");
        int  num6 = elObj.nextInt();
        System.out.println("Ingresa el 3er numero");
        int  num7 = elObj.nextInt();
        if (num5 > num6 && num5 > num7) {
            System.out.println("El 1er Nº ingresado es mayor " + num5);
        } else if(num6 > num5 && num6 > num7){
            System.out.println("El 2do Nª ingresado es mayor " + num6);
        } else {
            System.out.println("El 3er Nº ingresado es mayor " + num7);
        }

        System.out.println(" ");

        //Ejercicio 5
        System.out.println("Operaciones con condiciones");
        System.out.println("Ingresa el 1er numero");
        int  num8 = elObj.nextInt();
        System.out.println("Ingresa el 2do numero");
        int  num9 = elObj.nextInt();
        System.out.println("Ingresa el 3er numero");
        int  num10 = elObj.nextInt();
        int suma1 = num8 + num9 + num10;
        int producto = num8 * num9 * num10;
        if (num8 < 0) {
            System.out.println("Resultado " + producto);
        } else {
            System.out.println("Resultado " + suma1);
        }

        elObj.close(); 
    } 
        
}