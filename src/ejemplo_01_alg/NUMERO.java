/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_01_alg;
import java.util.Scanner;
/**
 *
 * @author MOISES OSCCO HUAROCC
 */
public class NUMERO {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        int suma = 0;
        int prod = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("PROGRAMA QUE CALCULA LA SUMA DE LOS 5 PRIMEROS NUMEROS Y LA MULTIPLICACION DE LOS 5 ULTIMOS NUMEROS.");  
        for (int i = 1; i < 6; i++) {

            System.out.println("Ingrese el numero "+i);
            int num = sc.nextInt();
            suma = suma+num;
        }
        for (int i = 6; i < 11; i++) {
            System.out.println("Ingrese el numero "+i);
            int num = sc.nextInt();
            prod = prod*num;
        }
        System.out.println("La suma de los 5 primeros numeros es: "+suma);
        System.out.println("La multiplicacion de los 5 ultimos numeros es: "+prod);
    }
}
