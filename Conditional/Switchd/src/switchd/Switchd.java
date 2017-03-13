/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchd;
import java.util.Scanner; //import the scanner

/**
 *
 * @author Joseph
 */
public class Switchd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner inputto = new Scanner(System.in);
        
        int age; //create an integer called age 
        System.out.print("Please input your age: "); 
        age = inputto.nextInt(); //age will store the next Integer value taken from inputto 
        
        while (age<=0){
            System.out.println("You can't be 0 or negative years old dude");
            System.out.print("Please input your age again: ");
            age = inputto.nextInt();
        }
      
      
        
        switch (age){ //switch statement
            case 1:
                System.out.println("Really, you're 1 years old?!");
                break;
                
            case 10:
                System.out.println("You are 10 years old.");
                break;
                
            case 18:
                System.out.println("Congratulations, you are now officially an adult.");
                break;
                
            default:
                System.out.println("hrm I see...");
                System.out.println("So you are " + age + " Years old eh?");
                System.out.println("Cool stuff :D");
     
        }
        
    }
    
}
