/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.*;

/**
 *
 * @author lucas
 */
public class AdvancedGeometry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        java.util.List<Rectangle> rectangles = new ArrayList<>();
        java.util.List<Triangle> triangles = new ArrayList<>();
        java.util.List<Circle> circles = new ArrayList<>();
        int param;
        do{
            System.out.println("Which shape? (0 means exit and draw, 1 means rectangle, 2 means triangle, 3 means circle) ");
            param = s.nextInt();
            switch (param) {
                case 1:
                    System.out.println("specify width and height: ");
                    rectangles.add(new Rectangle(s.nextInt(),s.nextInt()));
                    break;
                case 2:
                    System.out.println("specify width and height: ");
                    triangles.add(new Triangle(s.nextInt(),s.nextInt()));
                    break;
                case 3:
                    System.out.println("specify radius: ");
                    circles.add(new Circle(s.nextInt()));
                    break;
                default:
                    break;
            }
        }while(param != 0);
        rectangles.forEach((rectangle) -> {
            rectangle.draw();
        });
        triangles.forEach((triangle) -> {
            triangle.draw();
        });
        circles.forEach((circle) -> {
            circle.draw();
        });
    }
    
}
