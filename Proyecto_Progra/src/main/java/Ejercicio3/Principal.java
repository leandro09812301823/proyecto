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
public class Principal {
    public static void main(String[] args){
        int menu=0;
        double Dato_Nodo=0;
        Ejercicio3.Cola cola=new Ejercicio3.Cola();
         
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
                        cola.MostrarCola();
                        break;
                    case 2:
                        Dato_Nodo=Double.parseDouble(JOptionPane.showInputDialog(null,
                                "Digite la edad a incluir en el nodo"));
                        cola.Insertar(Dato_Nodo);
                        break;
                    case 3:
                        if(!cola.ColaVacia()){
                            JOptionPane.showMessageDialog(null, "Se extrajo una edad con el valor: "
                            +cola.Extraer());
                        }else{
                            JOptionPane.showMessageDialog(null, "La cola esta vacia");
                            
                        }
                        break;
                    case 4:
                    menu=4;
                    break;
                    default:
                        JOptionPane.showMessageDialog(null, "la opcion seleccionada no esta dentro del menu");
                        break;
                }
            }catch (NumberFormatException e){
                
            }
        }while (menu!=4);
    }  
}
