package calculadora;
import java.util.Scanner;
public class Calculadora {
	public static void main(String[] args) {
		int opcion = 0;
Scaner sc;
sc = new Scanner(System.in);
do { //imprimiremos el menú
System.out.println(“\n”); //linea en blanco
System.out.println("***** CALCULADORA *****");
System.out.println(“1. Sumar”);
System.out.println(“2. Restar”);
System.out.println(“3. Multiplicar”);
System.out.println(“4. Dividir”);
System.out.println(“5. Resto”);
System.out.println(“0. Salir del programa”);
System.out.print(“Introduzca una opción válida: ”);
opcion = Integer.parseInt(sc.nextLine());
if (opcion < 0 || opcion > 5) {
System.out.println(“opcion no valida, vuelve a escojer”);
} else if ( opcion != 0) {
System.out.println(“\n”);
float operando1, operando2;
System.out.print(“Introduzca el primer operando: ”);
operando1 = Float.parseFloat(sc.nextLine());
System.out.print(“Introduzca el segundo operando: ”);
operando2 = Float.parseFloat(sc.nextLine());
System.out.println(“\n”);
switch(opcion) {
case 1:
System.out.println(“el resultado de la suma es ” + (operando1 + operando2));
break;
case 2:
System.out.println(“el resultado de la resta es” + (operando1 - operando2));
break;
case 3:
System.out.println(“el resultado de la multiplicacion es” + (operando1 * operando2));
break;
case 4:
System.out.println(“el resultado de la division es” + (operando1 / operando2));
break;
case 5:
System.out.println(“el resultado de dividir ” +operando1 + “ entre ” + operando2 + “ es ” + (operando1 % operando2));
break;
}
}
} while (opcion != 0);
sc.close();
System.out.println(“Finalizando la ejecucion de la calculadora”);
}
