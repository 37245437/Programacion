import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        //Ejercicio 1
        System.out.println("Solucion Suma");
        int num1, num2, resultado;
        Scanner myObjet = new Scanner (System.in);
        System.out.println("Escriba un numero entero");
        num1 = myObjet.nextInt ();
        System.out.println("Escriba otro numero entero");
        num2 = myObjet.nextInt ();
        resultado = num1 + num2;
        System.out.println("El resultado es " + resultado);
        
        System.out.println(" ");

        //Ejercicio 2
        System.out.println("Ingresar");
        String usuario, contrasena;
        System.out.println("Ingresar usuario");
        usuario = myObjet.next();
        System.out.println("Ingresar crontraseña");
        contrasena = myObjet.next();
        if (usuario.equals("Ivana") && contrasena.equals("Casa")) {
            System.out.println("Bienvenido");
        } else {
            System.out.println("Error de Ususario o contraseña");
        }
       
        System.out.println(" ");

        //Ejercicio 3
        System.out.println("¿Entramos en el aula?");
        int alumnos, bancos;
        System.out.println("Cantidad de alumnos");
        alumnos = myObjet.nextInt();
        System.out.println("Cantidad de bancos");
        bancos = myObjet.nextInt();
        if (alumnos == bancos) {
           System.out.println("Entramos");
        }else if (alumnos > bancos) {
            System.out.println("La cantidad de bancos que faltan son " + (alumnos-bancos)); 
        }else if (alumnos < bancos) {
            System.out.println("Sobran Bancos");
        }
        
        System.out.println(" ");

        //Ejercicio 4
        System.out.println("Descuento");
        Double monto, desc;
        int fdep;
        System.out.println("Precio del Producto");
        monto = myObjet.nextDouble();
        System.out.println("Ingrese un numero segun su forma de pago: 1-Contado 2-Tarjeta 3-Otra forma de pago");
        fdep = myObjet.nextInt();              
        if (fdep == 1) {
            desc = monto - (monto * 10 / 100);
            System.out.println("Produc5to con descuento, debe abonar " + desc);
        }else if (fdep != 1 && fdep != 2 && fdep != 3) {
            System.out.println("La opcion ingresada es incorrecta.");
        }else {
            System.out.println("Producto sin descuento, debe abonar " + monto);
        }
        myObjet.close();

    }   

    
}
