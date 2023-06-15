/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leandro
 */
public class bidimensionales_ejer6 {
    public static void main(String[] args) {
        String [][]palabras=new String[4][5];
        
        palabras[0][0]="Menta";
        palabras[0][1]="Curcuma";
        palabras[0][2]="Culantro";
        palabras[0][3]="Mejorana";
        palabras[0][4]="Salvia";
        
        palabras[1][0]="Comino";
        palabras[1][1]="Ajo";
        palabras[1][2]="Cilantro";
        palabras[1][3]="Romero";
        palabras[1][4]="Cebollin";
        
        palabras[2][0]="Perejil";
        palabras[2][1]="Curri";
        palabras[2][2]="Laurel";
        palabras[2][3]="Albahaca";
        palabras[2][4]="Calendula";
        
        palabras[3][0]="Oregano";
        palabras[3][1]="Pimienta";
        palabras[3][2]="Tomillo";
        palabras[3][3]="Hierbabuena";
        palabras[3][4]="Manzanilla";
        
        for(int i=0;i<4;i++){
            System.out.println("  ");
            for(int j=0;j<5;j++){
                System.out.print(palabras[i][j]+"   ");
            }
        }
    }
}
