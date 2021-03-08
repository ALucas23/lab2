/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
public class ComputeArray {
    public int[] data;
    public ComputeArray() {
        data = new int[10];
    }
    public void set(int idx, int x) {
        data[idx] = x;
    }
    public int maximum() {
        int maxVal = data[0];
        for (int i = 0; i < data.length; i++) {
            maxVal = Soon.max(data[i], maxVal);
        }
        return maxVal;
    }
    public int minimum() {
        int minVal = data[0];
        for (int i = 0; i < data.length; i++) {
            minVal = Soon.min(data[i], minVal);
        }
        return minVal;
    }
}

