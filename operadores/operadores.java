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
public class operadores {
    public static final double p =12.4;
    public static void main(String[] args) {
    
        int num=0;
        int num1=5;
        double num2=8.65;
        double num3=3.4;
        float num4=12.5f;
        
        //operadores aritmeticos//
        //suma//
        double sum=num2+num1;
        //resta//
        float rest=num4-num;
        //multiplicacion//
        int mult=num*num1;
        //division//
        double divi=num2/num1;
        //determinar el resto de una division
        double restDiv=num2%num1;
        //potencia//
        int pot=num1^2;
        
        
        num1=5;
        num2=4;
        //operadores relacionales//
        boolean comp1=num1==num2; //igualdad//
        boolean comp2=(num1!=num2); //diferente de//
        boolean comp3=(num1>num2); //mayor que//
        boolean comp4=(num1<num2); //menor que//
        boolean comp5=(num1>=num2); //mayor o igual que//
        boolean comp6=(num1<=num2); //menor o igual que//
        
        //operador incremental//
        num1++;
        //operador decremental//
        num1--;
        
    }
}
