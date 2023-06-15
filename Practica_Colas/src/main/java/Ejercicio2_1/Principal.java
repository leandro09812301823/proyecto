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
public class Principal {
    public static void main(String[] args){
        int menu=0; 
        String Dato_Nodo="";
        Ejercicio2_1.Pila pila=new Ejercicio2_1.Pila();
         
        do{
            try{
                menu=Integer.parseInt((JOptionPane.showInputDialog(null,
                        "opciones de la Cola\n\n"
                                + "1. Mostrar Cola \n"
                                + "2. Insertar un Nuevo Nodo \n"
                                + "3. Extraer un Nodo \n"
                                + "4. Salir\n\n")));
                switch(menu){
                    case 1:
                        pila.MostrarPila();
                        break;
                    case 2:
                        Dato_Nodo=(JOptionPane.showInputDialog(null,
                                "Digite la profesion a incluir en el nodo"));
                        pila.Insertar(Dato_Nodo);
                        break;
                    case 3:
                        if(!pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "Se extrajo la profesion: "
                            +pila.desapilar());
                        }else{
                            JOptionPane.showMessageDialog(null, "La cola esta vacia");
                            
                        }
                        break;
                    case 4:
                    menu=4;
                    break;
                    default:
                        JOptionPane.showInputDialog(null, "la opcion seleccionada no esta dentro del menu");
                        break;
                }
            }catch (NumberFormatException e){
                
            }
        }while (menu!=4);
    }  
}
