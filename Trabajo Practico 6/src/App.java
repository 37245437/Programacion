import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myOb = new Scanner(System.in);
        System.out.println("\nDigitos\n");
        int num1;
        do {
            System.out.println("Ingrese un numero entre 0 y 999\n");
            num1 = myOb.nextInt();
            if (num1 >=100 && num1 <= 999){
                System.out.println("\nEl numero tiene 3 digitos");
            }else if (num1 >= 10 && num1 <= 99){
                System.out.println("\nEl numero tiene 2 digitos");
            }else {
                System.out.println("\nEl numero tiene 1 digito\n");
            }
        }while (num1 != 0 && num1 <= 999);
        System.out.println("\nEl ciclo ha sido cerrado");

        System.out.println("\nNotas alumnos\n");
        int num2;
        int menores = 0, mayores = 0;
        do {
            System.out.println("Ingrese la nota correspondiente\n");
            num2 = myOb.nextInt();
            if (num2 >=7){
                mayores ++;
            }else {
                menores ++;
            }
        }while (num2 != 0);
        System.out.println("\nHay " + mayores + " alumnos con nota mayor o igual a 7\nHay " + menores + " alumno con notas menor que 7");
        
        System.out.println("\nEdades");
        int Edad, Suma = 0,Contador = 0,Promedio=0;
        do {
            System.out.println("\nIngrese la edad de la persona");
            Edad=myOb.nextInt();
            Suma=Suma+Edad;
            Contador=Contador+1;
            Promedio=Suma/Contador;
            System.out.println("\nEl promedio por ahora es " +Promedio);
            if (Promedio>25) {
                System.out.println("\nEl promedio fue superior que 25 y el programa ha finalizado");
                break;
            }else {
                System.out.println("\nReinicia el programa ya que el promedio no fue superior a 25");
            }  
            
        } while (Edad>0);
        System.out.println("\nLa suma de las edades es :" + Suma    + " \nLa Cantidad  de edades ingresadas fueron: "+ Contador);

        System.out.println("\n De 0 a 100\n");
        for (int i = 0; i <= 100; i++){
            System.out.println("Numero: " + i);
        }
        
        myOb.close();
    }
}
