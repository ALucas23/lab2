/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.*;

public class Soon {
    public static int max(int a, int b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }
    public static int min(int a, int b){
        if(a < b){
            return a;
        }else{
            return b;
        }
    }

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ex1a = s.nextInt();
        int ex1b = s.nextInt();
        System.out.println("You just wrote: " + ex1a + " and " + ex1b);
        
        int ex2a = s.nextInt();
        int ex2b = s.nextInt();
        System.out.println("Maximum: " + Math.max(ex2a, ex2b) + " Minimum: " + Math.min(ex2a, ex2b));
    
        //This is how we solved ex 5, but apparently it is the same solution for ex 6...
        int nr5 = s.nextInt();
        int[] nrs = new int[nr5];
        for(int i = 0; i < nr5; i++){
            nrs[i] = s.nextInt();
        }
        int min5 = nrs[0];
        int max5 = nrs[0];
        for(int i = 0; i < nr5; i++){
            min5 = min(nrs[i],min5);
            max5 = max(nrs[i],max5);
        }
        System.out.println("Maximum: " + max5 + " Minimum: " + min5);
        
        ComputeArray array = new ComputeArray();
        array.set(0, 1);
        array.set(1, 17);
        array.set(2, 9);
        array.set(3, -4);
        array.set(4, 200);
        System.out.println(array.maximum() + " : " + array.minimum());
    }
}
