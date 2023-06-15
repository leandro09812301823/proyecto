/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_repaso;

/**
 *
 * @author Leandro
 */
public class repaso {
    public static void main(String[] args) {
        //punto1//
        //triangulo
        //declaramos e inicializamos las variables//
        int b1= 57;
        int h=64;
        //escribimos la formula del area//
        int a1=(b1*h/2);
        
        //circulo//
        //declaramos e inicializamos la variable//
        int r=0xC;
        //escribimos la formula
        double a2= 3.14*(r*r);
        
        //IMC//
        //determinamos e inicializamos las variables//
        int p=86;
        float h1=1.80f;
        
        //escribimos la operacion//
        double imc= p/(h1*h1);
        
        //declaramos e incializamos la variable//
        int edad= 19;
        boolean edad1= edad >= 18;
        
        //punto2//
        //declaramos e inicializamos las variables//
        int a=8;
        int b=3;
        int c=5;
        
        //escribimos las operaciones//
        int suma=(a+b+c);
        int div=(a/b);
        int div2=(a/c);
        int op=2*b+3*(a-c);
        int resto=a%b;
        int resto1=a%c;
        int mult=a*(b/c);
        int div3=a/(c/b);
        int op1=a*b/c;
        int op2=(a-4*b)%(c+2*a)/(a-c);
        
        //punto3//
        //declaramos e inicializamos las variables//
        String c1="54";
        String c2="20";
        String c3="36";
        
        //convertimos los strings en int y escribimos las operaciones//
        int convC1=Integer.parseInt(c1);
        int convC2=Integer.parseInt(c2);
        int convC3=Integer.parseInt(c3);
        int sum2= (convC1+convC2);
        int div4= (convC1/convC3);
        int op3= (convC1*convC3+convC2);
        int op4= (convC2^2*convC1-convC2);
        
        //PROGRAMACION//
        //punto4//
        //declaramos e iniciamos las variables//
        boolean X=true;
        boolean Y=false;
        boolean Z=true;
        //declaramos las expresiones//
        boolean expresion= (X && Y) || (X && Z);
        boolean expresion1= (X && Z || Y);
        boolean expresion2= (X && !Y && !X || !Z && Y);
        boolean expresion3= !X && Z &&(!Z || !X);
        
        //punto5//
        //declaramos e inicializamos las variables//
        int I=9;
        int j=4;
        float x=0.005f;
        float y=-0.01f;
        char C=5;
        char d=3;
        
        //punto6//
        //escribimos los booleanos//
        boolean ij= (I<=j);
        boolean ij2= !(I<=j);
        boolean X0= !(x>0);
        boolean I0j9= (I<0 && j<9);
        boolean j10= (-j == (I - 10));
        boolean xi= (x != I);
        boolean b99= ((a + b) == 99);
        
    }
    
}
