/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.Arrays;
/**
 *
 * @author Joseph
 */
public class Lotto25 {
    
    public static void main(String[] args){
        
        //Multidimensional Arrays
        
        int[][] Lotto = new int[5][5]; //creating a 5 by 5 grid of arrays
                
                Lotto[0][0]=1;  Lotto[1][0]=6;  Lotto[2][0]=11; Lotto[3][0]=16; Lotto[4][0]=21;              
                Lotto[0][1]=2;  Lotto[1][1]=7;  Lotto[2][1]=12; Lotto[3][1]=17; Lotto[4][1]=22;            
                Lotto[0][2]=3;  Lotto[1][2]=8;  Lotto[2][2]=13; Lotto[3][2]=18; Lotto[4][2]=23;
                Lotto[0][3]=4;  Lotto[1][3]=9;  Lotto[2][3]=14; Lotto[3][3]=19; Lotto[4][3]=24;
                Lotto[0][4]=5;  Lotto[1][4]=10; Lotto[2][4]=15; Lotto[3][4]=20; Lotto[4][4]=25;
                
                int rows = 5;
                int columns = 5;
                
                int i, j; 
                
                for (i=0; i<rows; i++){          //for loop inside a for loop
                    for (j=0; j<columns; j++){   //basically, i=0, it will intiate the i loop which sees that it is less than 5 (rows)
                        System.out.print(Lotto[i][j] + " "); //it then goes into another forloop for j, to print out i j at values [0][0]
                                                     // because we're inside the j loop now, it goes from [0][0] to [0][4] then resolves because it'll be > 5 
                    }
                    System.out.println(" ");   //now that the j loop for j<columns is resolved it goes to a line break, then goes back to i++, i is now 1 and goes back into another set
                }
                    
                        
    }
}
