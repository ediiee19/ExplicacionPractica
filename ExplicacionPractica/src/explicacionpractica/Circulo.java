/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package explicacionpractica;

/**
 *
 * @author caste
 */
public class Circulo {
    /*requisito
    estos requisitos pueden variar y haber mas o menos, 
    todo depende de los compnentes del objeto*/
   private double radio;
   
    /*constructor
    esto se puede decir metaforicamente
    como la base de una construcion*/
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    /*getter y setters
    estos son metodos para llamar el radio y poder usarlo*/
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //metodo para sacar el area
    public double calcularArea(){
        return 3.14 * radio * radio;
    }
    
    //metodo para sacr el perimetro
    public double calcularPerimetro(){
        return 2 * 3.14 * radio;
    }
}
