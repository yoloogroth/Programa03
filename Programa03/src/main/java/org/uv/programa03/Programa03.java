/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uv.programa03;

/**
 *
 * @author Yolotzin Groth Hdez
 */
public class Programa03 {

    public static void main(String[] args) {
        ClaseConcreta c = new ClaseConcreta();
        c.imprimir();
        
        ClaseAHija cah = new ClaseAHija();
        cah.imprimir();
        
        ClaseA ca = null;
        ca = new ClaseAHija();
        ca.imprimir();
        
        ca = new ClaseAHija2();
        ca.imprimir();
        
        ca = new ClaseA(){
            @Override
            public void msg(){
                System.out.println("Otra clase anónima");
            }
        };
        ca.imprimir();
        
        IClaseInterface eje = null;
        eje = new IClaseConcretaUno();
        eje.msg();
        
        eje = new IClaseConcretaDos();
        eje.msg();
        
        //Instancia anónima
        eje = new IClaseInterface(){
            @Override
            public void msg(){
                System.out.println("Otro...");
            }
        };
        eje.msg();
    }
}