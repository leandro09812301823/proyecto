/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Leandro
 */
public class Datos {
    public static void main(String[] args) {
        //Tipos de datos//
        //Enteros (byte, short, int, long)//
        
        Byte variableByte=10;
        System.out.println("Tamano de un tipo byte "+Byte.SIZE);
        System.out.println("Valor maximo de tipo byte "+Byte.MAX_VALUE);
        System.out.println("Valor minimo de un tipo byte "+Byte.MIN_VALUE);
        
        short variableShort=1020;
        System.out.println("Cantidad de un tipo short "+Short.SIZE);
        System.out.println("valor maximo de tipo byte "+Short.MAX_VALUE);
        System.out.println("valor minimo de un tipo byte "+Short.MIN_VALUE);
        
        int variableInt=20;
        System.out.println("Cantidad de bits de un tipo int "+Integer.SIZE);
        System.out.println("Valor maximo de tipo int "+Integer.MAX_VALUE);
        System.out.println("Valor minimo de un tipo int "+Integer.MIN_VALUE);
        
        long variableLong=20;
        System.out.println("Cantidad de bits de un tipo long "+Long.SIZE);
        System.out.println("Valor maximo de tipo long "+Long.MAX_VALUE);
        System.out.println("Valor minimo de un tipo long "+Long.MIN_VALUE);
        
        System.out.println("");
        //Utilizar numeros BINARIOS/OCTALES/HEXADECIMALES//
        //Decimal//
        int nDecimal=12;
        System.out.println("El valor de numero decimal es "+nDecimal);
        
        //Octal//
        int nOctal=012;
        System.out.println("El valor del numero octal es "+nOctal);
        
        //Hexadecimal//
        int nHexadecimal=0xA;
        System.out.println("El valor del numero hexadecimal es "+nHexadecimal);
        
        //Binario//
        int nBinario=0b1010;
        System.out.println("El valor del numero binario es "+nBinario);
 
        //Tipos primitivos flotantes (Float y Double)
        //Tipo Float//
        float variableFloat=1000.10F;
        System.out.println("Variable flotante "+variableFloat);
        System.out.println("Tamano de float "+Float.SIZE);
        System.out.println("Valor minimo de un float "+Float.MAX_VALUE);
        System.out.println("Valor minimo de un float "+Float.MIN_VALUE);
        
        //Tipo double//
        double variableDouble=1000.10F;
        System.out.println("Variable doble "+variableDouble);
        System.out.println("Tamano de double "+Double.SIZE);
        System.out.println("Valor maximo de un double "+Double.MAX_VALUE);
        System.out.println("Valor minimo de un double "+Double.MIN_VALUE);
        
        //Tipo primitivo chart//
        char vChar1='A';
        System.out.println("Variable char "+vChar1);
        System.out.println("Tamano de char "+Character.SIZE);
        System.out.println("Valor maximo de un char "+Character.MAX_VALUE);
        System.out.println("Valor minimo de un char "+Character.MIN_VALUE);
        
        //Char utilizando valores unicode//
        char vChar2='\u0021';
        System.out.println("El valor de vChar2 "+vChar2);
        
        //Char utilizando el simbolo
        char vChar3='!';
        System.out.println("El valor de vChar3 "+vChar3);
        
        //Char utilizando numero decimal//
        char vChar4=33;
        System.out.println("El valor de vChar2 "+vChar4);
        
        //Tipo primitivo booleano
        boolean vBoolean=true;
        System.out.println("El valor de vBoolean es "+vBoolean);
        System.out.println("valor de verdad tipo boolean "+Boolean.TRUE);
        System.out.println("");
    }
}

