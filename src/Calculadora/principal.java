// programa principal de calculadora, pido por teclado dos numeros y muestro un menu para elección de operación a realizar
package Calculadora;
// importo clase scanner de la librería java.util

import java.util.Scanner;

public class principal {

    public static void main(String[] arg) {

        //objeto clase scanner
        Scanner sc = new Scanner(System.in);
        System.out.println(" Introduce primner numero de la calculadora: ");
        // metodo para leer un double por teclado
        double n1 = sc.nextDouble();
        System.out.println("Introduce el segundo numero de la calcualdora: ");
        double n2 = sc.nextDouble();

        // instancio un objeto de clase calculadora que he creado en archivo aparte con los dos numeros pasados
        Calculadora casio = new Calculadora(n1, n2);

        int operacion = 0;
        do {
            System.out.println(" Introduce Operacion a realizar");
            System.out.println(" 1. suma \n 2. resta \n 3. multiplicar \n 4. dividir \n 5. módulo \n 6. salir");
            // leo por teclado un entero como opción del menú
            operacion = sc.nextInt();
            // segun valor elegido ejecuto método del objeto claculadora
            switch (operacion) {
                case 1:
                    System.out.println(" la suma es " + casio.suma());
                    break;
                case 2:
                    System.out.println(" la resta es " + casio.resta());
                    break;
                case 3:
                    System.out.println(" la multipilcacion es " + casio.multiplicacion());
                    break;
                case 4:
                    System.out.println(" La division es " + casio.division());
                    break;
                case 5:
                    System.out.println(" El módulo es " + casio.modulo());
                    break;
                default:
                    System.out.println(" Debes elegir una opción de 1 a 6");
            }

        } while (operacion != 6);

        System.out.println(" Gracias por usar la calculadora...hasta luegooooorrr");

        sc.close();
    }

}
