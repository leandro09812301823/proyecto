/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leandro
 */
public class bidimensionales_ejer2 {
    public static void main(String[] args) {
        String [][]letras=new String[5][5];
        
        letras[0][0]="A";
        letras[0][1]="B";
        letras[0][2]="C";
        letras[0][3]="D";
        letras[0][4]="E";
        
        letras[1][0]="F";
        letras[1][1]="G";
        letras[1][2]="H";
        letras[1][3]="I";
        letras[1][4]="J";
        
        letras[2][0]="K";
        letras[2][1]="L";
        letras[2][2]="M";
        letras[2][3]="N";
        letras[2][4]="O"; 
        
        letras[3][0]="P";
        letras[3][1]="Q";
        letras[3][2]="R";
        letras[3][3]="S";
        letras[3][4]="T";
        
        letras[4][0]="U";
        letras[4][1]="V";
        letras[4][2]="W";
        letras[4][3]="X";
        letras[4][4]="Y";
        
        for(int i=0;i<5;i++){
            System.out.println("  ");
            for(int j=0;j<5;j++){
                System.out.print(letras[i][j]+"   ");
            }
        }
        
        
        
        
        
    }
}
