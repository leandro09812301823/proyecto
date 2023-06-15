/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Metodos_y_Funciones;

/**
 *
 * @author Leandro
 */
import java.util.Scanner;
public class ejercicio1 {
    
    static final double PI=3.14; //valor fijo del pi//
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        ejercicio1 fP=new ejercicio1();
        
        fP.menu();
        
    }
        void menu(){
        System.out.println("Seleccione la figura para determinar el area y el perimetro"
                + "\n1. Circulo"
                + "\n2. Rombo"
                + "\n3. Cuadrado"
                + "\n4. Triangulo");
        int op=sc.nextInt();
        switch (op){
            case 1:
                //datos circulo//
                System.out.println("Escriba el radio del circulo");
                int rCir=sc.nextInt();
                System.out.println("Escriba el diametro del circulo");
                int dCir=sc.nextInt();
                System.out.println("El area del circulo es "+aCirculo(rCir));
                System.out.println("El perimetro del circulo es "+pCirculo(dCir));     
                break;
            case 2:
                //datos rombo//
                System.out.println("Escriba la diagonal mayor y la diagonal menor del rombo");
                int dMayor=sc.nextInt();
                int dMenor=sc.nextInt();
                System.out.println("Escriba la medida del lado del rombo");
                int lRom=sc.nextInt();
                System.out.println("El area del rombo es "+aRombo(dMayor, dMenor));
                System.out.println("El perimetro del rombo es "+pRombo(lRom));
                break;
            case 3:
                //datos cuadrado//
                System.out.println("Escriba la medida del lado del cuadrado");
                int lCua=sc.nextInt();
                System.out.println("El area del cuadrado es "+aCuadrado(lCua));
                System.out.println("EL perimetro del cuadrado es "+pCuadrado(lCua));
                break;
            case 4:
                //datos triangulo//
                System.out.println("Escriba la base y la altura del triangulo");
                int bTri=sc.nextInt();
                int hTri=sc.nextInt();
                System.out.println("Escriba la medida del lado del triangulo");
                int lTri=sc.nextInt();
                System.out.println("El area del triangulo es de "+aTriangulo(bTri, hTri));
                System.out.println("El perimetro del triangulo es de "+pTriangulo(lTri));
            }
        }
                 //utilice funciones con parametros//
    //Area y perimetro del circulo//
    public static double aCirculo(int rCir){
        double aCir= (PI*(rCir*rCir));
        return aCir;
    }
    public static double pCirculo(int dCir){
        double pCir=(PI*dCir);
        return pCir;
    }
    
    //Area y perimetro del rombo//
    public static double aRombo(int dMayor, int dMenor){
        double aRom=((dMayor*dMenor)/2);
        return aRom;
    }
    public static double pRombo(int lRom){
        double pRom=(lRom*4);
        return pRom;
    }
    
    //Area y perimetro del cuadrado//
    public static double aCuadrado(int lCua){
        double aCua=(lCua*lCua);
        return aCua;
    }
    public static double pCuadrado(int lCua){
        double pCua=(lCua*4);
        return pCua;
    }
    
    //Area y perimetro del triangulo
    public static double aTriangulo(int bTri, int hTri){
        double aTri=((bTri*hTri)/2);
        return aTri;
    }
    public static double pTriangulo(int lTri){
        double pTri=(lTri*3);
        return pTri;
    }   
}
   
