package datos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leandro
 */
public class PRACT_1_1 {
    public static void main(String[] args) {
       //declaramos las variables//
        String num;
        float salario; 
        double peso; 
        double estatura; 
        String edad; 
        short nacimiento; 
        boolean isEstudiante;
        
        //inicializamos las variables//
        num= "10"; //las comillas son para darle el valor al string//
        salario=780993.67f; //la f se coloca siempre en el double//
        peso=68.9f;
        estatura= 1.67;
        edad= "12";
        nacimiento= 1990;
        isEstudiante= true;
        
        //escribimos las conversiones//
        int convNum=Integer.parseInt(num);
        String convSalario=String.valueOf(salario);
        float convPeso= (float)peso;
        String convEstatura=String.valueOf(estatura);
        int convEdad=Integer.parseInt(edad);
        String convNacimiento=String.valueOf(nacimiento);
        String convIsestudiante=String.valueOf(isEstudiante);
    }
}
