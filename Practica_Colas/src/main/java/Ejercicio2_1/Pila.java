/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2_1;

/**
 *
 * @author Leandro
 */
import javax.swing.JOptionPane;
public class Pila {
    //asignando el comportamiento de una pila//
    private Ejercicio2_1.Nodo inicio,fin;
    String Pila="";/*para saber el contenido de la cola*/
    
    //constructor de la cola//
    public Pila(){
        inicio=null;
        fin=null;
    }
    //metodos del programa (Cola Vacia)//
    public boolean PilaVacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }
    //insercion de la cola//
    public void Insertar(String valor){
        Ejercicio2_1.Nodo nuevoNodo=new Ejercicio2_1.Nodo();
        nuevoNodo.datos=valor;
        nuevoNodo.Siguiente=null;
        
        if (PilaVacia()){
            inicio=nuevoNodo;
            fin=nuevoNodo;
        }else{
            fin.Siguiente=nuevoNodo;
            fin=nuevoNodo;
        }
    }
    public String desapilar(){
        String dEliminado=fin.datos;
        if(inicio==fin){
            inicio=null;
            fin=null;
    }else{
            Nodo puntero=inicio;
            while(puntero.Siguiente!=fin){
                puntero=puntero.Siguiente;
            }
            fin=puntero;
            fin.Siguiente=null;
        }
        return dEliminado;
    }
    public void MostrarPila(){
        Ejercicio2_1.Nodo buscar=inicio;
        String PilaInvertida="";
        while(buscar!=null){
            Pila+= buscar.datos+"";
            buscar=buscar.Siguiente;
        }
        String cadena[]=Pila.split("");
        for(int i=0;i<cadena.length;i++){
        PilaInvertida+=""+cadena[i];
        }
        JOptionPane.showMessageDialog(null, PilaInvertida);
        Pila="";
    }
}
