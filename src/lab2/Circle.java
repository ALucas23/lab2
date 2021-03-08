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
public class Circle {
    int r;
    public Circle(int r){
        this.r = r;
    }
    
    public void draw(){
        System.out.println("Here is a circle drawn with radius of: " + r);
    }
}
