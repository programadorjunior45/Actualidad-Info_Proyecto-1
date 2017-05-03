/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1_ej2;
import java.util.Scanner;
/**
 *
 * @author IGNACIO
 */
public class TP1_EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double area;
        Scanner entrada = new Scanner (System.in);
        System.out.println("ingrese el valor del radio: ");
        double radio = entrada.nextDouble();
        area = radio * radio * 3.14159;
        System.out.println("el area de dicho circulo con radio "+ radio + " es "+ area);
    }
}
