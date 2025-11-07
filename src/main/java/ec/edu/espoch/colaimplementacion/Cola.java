/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.colaimplementacion;

/**
 *
 * @author PERSONAL
 */
public class Cola {

    private Nodo frente;
    private int tamaño;
    private Nodo ultimo;

    public Cola(Nodo frente, int tamaño, Nodo ultimo) {
        this.frente = null;
        this.tamaño = 0;
        this.ultimo = null;
    }
    
    

   
    public boolean encolar(int datos) {
        Nodo nuevo = new Nodo(datos);
        boolean resp=false;
        if (isEmpty()) {

            frente = nuevo;
            ultimo = nuevo;
            resp = true;

        } else {
            
        }
        tamaño++;
        return resp;
    }
   

    public boolean isEmpty() {
        boolean resp = false;

        if (frente == null) {
            resp = true;
        }
        return resp;
    }

    public int peek() {
        return frente.datos;
        
    }
    
     public int collalena() {
        return tamaño;
    }
     
     public String desencolar() {
        if (frente == null) {
           
        }
        
        return " La cola está vacía.";
    }
     
     public void mostrar() {
        if (frente == null) {
            System.out.println("La cola está vacía.");
            return;
        }
     }
}
