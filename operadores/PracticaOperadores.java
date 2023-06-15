/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

/**
 *
 * @author Leandro
 */
public class PracticaOperadores {
    public static void main(String[] args) {
        
        //inicializamos las variables//
        String nom= "Leandro";
        String ap1= "Poveda";
        String ap2= "Villalobos";
        String datos= (nom+" "+ap1+" "+ap2); //sumamos las variables//
           
        //inicializamos las variables//
        String a= "el mundo";
        String b= "esta";
        String c= "de cabeza";
        String mundo= (a+" "+b+" "+c); //sumamos las variables//
        
        //incializamos las variables//
        int n1= 120;
        int n2= 24;
        int n3= 56;
        int n4= 5;
        int suma= (n1+n2+n3+n4); //declaramos la suma//
        int resta= (n1-n2-n3-n4); //declaramos la resta//
        int div= (n1/n2/n3/n4); //declaramos la division//
        int mod= (n1%n2%n3%n4); //declaramos el modulo//
        int mult= (n1*n2*n3*n4); //declaramos la resta//
        
        //incrementamos el valor en de las dos variables//
        n1++;
        n4++;
        
       //imprimimos los valores de las operaciones//
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(div);
        System.out.println(mod);
        System.out.println(mult);
        
        //inicializamos las variables//
        boolean condicion=true;
        boolean t=!condicion; //el ! es para invertir el valor de la variable condicion//
         
        //inicializamos las variables//
        int h=5;
        int f=8;
        int m=3;
        int r=4;
        
        int suma1=(h+1);//declaramos la suma//
        int resta1=(f-2);//declaramos la resta//
        int mult1=(m*2);//declaramos la multiplicacion//
        int div1=(r/1);//declaramos la division//
        
        //imprimimos los resultados// 
        System.out.println(suma1);
        System.out.println(resta1);
        System.out.println(div1);
        System.out.println(mult1);
    }
}
