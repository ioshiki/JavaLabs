/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Joseph
 */
public class Cat extends Animal  //Cat inherits from Animal
{
    public void talk() //this overrides the talk method from Animal
    {
        System.out.println("Meow"); 
    }
}
