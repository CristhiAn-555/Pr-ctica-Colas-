/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.colaimplementacion;

/**
 *
 * @author PERSONAL
 */
public class ColaImplementacion {

    public static void main(String[] args) {
         
         Cola cola = new Cola();

        
        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);

        
        cola.mostrar();

        
        System.out.println(cola.desencolar());
        cola.mostrar();

       
        System.out.println("Elemento al frente: " + cola.peek());

        
        System.out.println("Tamaño actual: " + cola.collalena());
    }
}
