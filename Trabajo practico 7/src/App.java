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
        System.out.println("\n Los numeros ingresados son\n");
        for (int i= num1; i <=20; i++) {
            System.out.println(i);
        }
        
        myOb.close();
    }
}
