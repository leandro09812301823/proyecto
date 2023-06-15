/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Leandro
 */
import javax.swing.JOptionPane;
public class Cola {
    //asignando el comportamiento de una cola//
    private Ejercicio3.Nodo inicio, fin;
    String Cola="";/*para saber el contenido de la cola*/
    
    //constructor de la cola//
    public Cola(){
        inicio=null;
        fin=null;
    }
    //Metodos del programa (Cola Vacia)//
    public boolean ColaVacia(){
        if(inicio==null){
            return true;
            
        }else{
            return false;
        }
    }
    //Insercion en la cola//
    public void Insertar(double datos){
        Ejercicio3.Nodo nuevoNodo=new Ejercicio3.Nodo();
        nuevoNodo.datos=datos;
        nuevoNodo.Siguiente=null;
                if(ColaVacia()){
                    inicio=nuevoNodo;
                    fin=nuevoNodo;
                }else{
                    fin.Siguiente=nuevoNodo;
                    fin=nuevoNodo;
                }
    }
    public double Extraer(){
        if(!ColaVacia()){
            double dato=inicio.datos;
            
            if (inicio==fin){
                inicio=null;
                fin=null;
            }else{
                inicio=inicio.Siguiente;
                
            }
            return dato;
        }else{
            return inicio.datos;
        }
    }
    //Mostrar el contenido//
    public void MostrarCola(){
        Ejercicio3.Nodo buscar=inicio;
        String ColaInvertida="";//invertimos una cadena de textos//
        while(buscar!=null){
        Cola+=buscar.datos;
        buscar=buscar.Siguiente;
        }
    String cadena[]=Cola.split(" ");
    //para invertir la cadena creada con los espacios correctos//
    
        for(int i=0;i<cadena.length;i++){
    ColaInvertida+=""+cadena[i];
    }
    JOptionPane.showMessageDialog(null,ColaInvertida);
    Cola="";
  }
}
