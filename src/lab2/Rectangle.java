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
public class Rectangle {
    int a;
    int b;
    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public void draw(){
        System.out.println("Here is a rectangle drawn with width of: " + a + " and height of: " + b);
    }
}
