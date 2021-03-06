import java.util.Scanner;
import java.util.TimeZone;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class App {
    public static void main(String[] args) {
        try (Scanner myOb = new Scanner(System.in)) {
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
        }
        System.out.println("\nFecha\n");
        int anio, mes, dia;
        try (Scanner teclado = new Scanner(System.in)) {
            boolean valido = false;
            do {
                System.out.println("\nMes (1-12): ");
                mes = teclado.nextInt();
                if (mes > 0 && mes < 13) {
                    valido = true;
                }

            } while (!valido);

            valido = false;
            do {
                System.out.println("\nDia (1-31): ");
                dia = teclado.nextInt();
                if (mes == 2 && dia < 29) {
                    valido = true;
                } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia < 31) {
                    valido = true;
                } else if ((mes == 1 || mes == 3 || mes == 5
                        || mes == 7 || mes == 8 || mes == 10 ||
                        mes == 12) && dia < 32) {
                    valido = true;
                }
                if (dia < 1) {
                    valido = false;
                }
            } while (!valido);

            valido = false;
            do {
                System.out.println("Anio: ");
                anio = teclado.nextInt();
                if ((anio == 1582 && (mes > 10 || (mes == 10 && dia > 14))) || anio > 1582) {
                    valido = true;
                }

            } while (!valido);
        }
        System.out.println(dia + " / " + mes + " / " + anio);
        String letraD = "";
        TimeZone timezone = TimeZone.getDefault();
        Calendar calendar = new GregorianCalendar(timezone);
        calendar.set(anio, mes-1, dia);
        int nS=calendar.get(Calendar.WEEK_OF_YEAR);
        int nD=calendar.get(Calendar.DAY_OF_WEEK);
        switch (nD){
            case 1: System.out.println(letraD + "Domingo");
            break;
            case 2: System.out.println(letraD + "Lunes");
            break;
            case 3: System.out.println(letraD + "Martes");
            break;
            case 4: System.out.println(letraD + "Miercoles");
            break;
            case 5: System.out.println(letraD + "Jueves");
            break;
            case 6: System.out.println(letraD + "Viernes");
            break;
            case 7: System.out.println(letraD + "Sabado");
            break;
        }
        System.out.println("Semana numero: "+ nS + "\n"+dia+" / "+mes +" / " +anio);
        
    }
}
