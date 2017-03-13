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
public class ArRAY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] RayNum; //created an Array of integers under the variable RayNum
        RayNum = new int[6]; //Java keyword new. Raynum will contain 6 numbers
        //You can also declare it as int[] RayNum = new int[6];
        
        //The default values for RayNum are 0 until defined
        
        RayNum[0] = 226;
        RayNum[1] = 2;
        RayNum[2] = 26;
        RayNum[3] = 1987;
        RayNum[4] = 29;
        RayNum[5] = 30;
        
        Arrays.sort(RayNum);
        
        int i ;
        for (i=0; i<RayNum.length; i++){
            System.out.println("Number: " + RayNum[i]);
        }
//        
//        
//        int RaySUM = RayNum[5] + RayNum[3];
//        System.out.println(RaySUM);
//        
        //We could also declare it in one statement such as
//        int[] RayNum = {226, 2, 26, 1987, 29, 30};
        
        // String will work like        
//        String[] Seasons = {"Spring", "Summer", "Fall", "Winter"};
            
//         System.out.println(Seasons[i]);   
             
     
               
               
    }
    
}
