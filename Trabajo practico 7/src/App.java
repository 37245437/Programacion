import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myOb = new Scanner(System.in);
        System.out.println ("\nFrutas\n");
        System.out.println ("Ingrese una fruta\n");
        String fruta = myOb.nextLine();
        for (int i=1; i < 10; i++) {
            System.out.println(fruta);   
        }

        System.out.println("\nNumero 20\n");
        System.out.println("Ingrese un numero menor 20\n");
        int num1 = myOb.nextInt();
        if (num1<= 20){
            System.out.println("\nLos numeros sucesivos son\n");
            for (int j= num1; j <=20; j++) {
            System.out.println(j);
            }
        }else {
            System.out.println("\nNumero ingresado incorrecto");
        }
        
        System.out.println("\nNumeros Pares\n");
        double suma = 0, producto = 1;
        int k;
        for (k = 20; k <=100; k++){
            if (k % 2 == 0) {
                suma= suma + k;
                producto = producto * k;
            }
        }
        System.out.println("La suma de los numeros es \n" + suma);
        System.out.println("\nEl producto de los numeros es \n" + producto);

        System.out.println("\nDe 100 a 1\n");
        int num2 = 100;
        while (num2 >= 1){
            System.out.println(num2);
            num2--;
        }

        System.out.println("\nDe 100 a 1\n");
        int num3 = 100;
        do {
            System.out.println(num2);
            num2--;
        }while (num3 >=1 );

        System.out.println("\nDe 100 a 1\n");
        for (int l=100; l >= 1; l--) {
            System.out.println(l);
        }

        System.out.println("\nFecha\n");
        int año, mes, dia;
        System.out.println("Ingrese el numero del dia\n");
        dia = myOb.nextInt();
        System.out.println("\nIngrese el numero del mes\n");
        mes = myOb.nextInt();
        System.out.println("\nIngrese el numero del año\n");
        año = myOb.nextInt();
        
        
        myOb.close();
    }
}
