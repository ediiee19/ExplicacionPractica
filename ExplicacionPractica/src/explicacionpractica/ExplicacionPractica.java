/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package explicacionpractica;

import java.util.Scanner;

/**
 *
 * @author caste
 */
public class ExplicacionPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresar radio del primer circulo: ");
        double rad1 = entrada.nextDouble();
        //Crear un objeto circulo
        Circulo circulo1 = new Circulo(rad1);// se le pon el requisito del objeto
        
        System.out.print("Ingresar radio del segundo circulo: ");
        double rad2 = entrada.nextDouble();
        Circulo circulo2 = new Circulo(rad1);
        
        System.out.println("");
        
        //muestra de informacion
        System.out.println("Circulo 1:");
        System.out.println("Radio: "+ circulo1.getRadio());
        System.out.println("Area: "+ circulo1.calcularArea());
        System.out.println("Perimetro: "+ circulo1.calcularPerimetro());
        
        System.out.println("Circulo 2:");
        System.out.println("Radio: "+ circulo2.getRadio());
        System.out.println("Area: "+ circulo2.calcularArea());
        System.out.println("Perimetro: "+ circulo2.calcularPerimetro());
    }

}
