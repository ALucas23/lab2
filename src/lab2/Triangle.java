/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author lucas
 */
public class Triangle {
    int a;
    int ah;
    public Triangle(int a, int ah){
        this.a = a;
        this.ah = ah;
    }
    
    public void draw(){
        System.out.println("Here is a triangle drawn with width of: " + a + " and height of: " + ah);
    }
}
