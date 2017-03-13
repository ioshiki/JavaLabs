/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.Arrays; //import the array utility

/**
 *
 * @author Joseph
 */
public class ArrayQ {
    
    public static void main(String[] args){ //main method
        
        //EXERCISE G
        
        int[] numbers = {23,6,47,35,2,14};
        int average; 
        
        average = ((numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4] + numbers[5])/ numbers.length); //average is sum of all numbers / # of numbers
        System.out.println("Your Average is :" + average);
        
        
    }
    
}
