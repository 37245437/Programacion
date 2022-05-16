import java.util.Scanner;

public class App {
    public static void main(String[] args){
        
        Scanner myObject = new Scanner (System.in);

        System.out.println("\nGrados\n");
        double centigrados, fahrenheit;
        System.out.println("Introdusca los grados en ºC ");
        centigrados = myObject.nextDouble();
        fahrenheit = 32 + (9* centigrados / 5);
        System.out.println("\nLa equivalencia en ºF es " + fahrenheit);


        System.out.println("\nContraseña\n");
        String usuario = "Ivana";
        String contrasena = "Casa";
        System.out.println("\nIngrese el usuario");
        String user = myObject.next();
        System.out.println("\nIngrese la contraseña");
        String contr = myObject.next();
        while (contr.equals(contrasena) == false && user.equals(usuario) == false ) {
            System.out.println("\nUsuario Incorreto\nIngrese el usuario");
            user = myObject.next();
            System.out.println("\nContraseña incorrecta\nIngrese la contraseña");
            contr = myObject.next();
        }
        System.out.println("\nIngreso\nBienvenido");
        
        
        myObject.close();

    }
}
