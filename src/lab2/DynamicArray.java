package lab2;

public class DynamicArray {
        
    private static int INITIAL_CAPACITY = 5;
    private int[] data;
    private int size;
    public DynamicArray() {
        data = new int[INITIAL_CAPACITY];
        size = 0;
    }

    // Returns `true` if the array is empty.
    public boolean isEmpty() {
        return size == 0;
    }

    // Returns the size of the array.
    public int size() {
        return size;
    }

    // Remove all elements from data.
    public void clear() {
        size = 0;
        data = new int[INITIAL_CAPACITY];
    }

    // Create a `String` with the elements of the array separated by comma, without a new line character at the end.
    // For instance: 4, 5, 6
    public String toString() {
        if(this.isEmpty()){
            return "";
        }else{
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < size-1; i++) {
                res.append(data[i]); //4, 5, 
                res.append(", ");
            }
            res.append(data[size-1]);//4, 5, 6
            return res.toString();
        }
    }

    // Returns `true` if the array `data` is full: no more element can be added to `data`.
    // Returns `false` otherwise.
    private boolean isFull() {
        return size == data.length;
    }

    // If the array `data` is full:
    //  1. Create a new array `data2` doubling the size of data.
    //  2. Copy the elements of `data` into `data2`.
    //  3. Assign `data2` to `data`.
    private void realloc() {
        if(this.isFull()){
            int[] data2 = new int[data.length*2];
            for (int i = 0; i < size; i++) {
                data2[i] = data[i];
            }
            data = data2;
        }
    }

    // The element `x` is added to `data`, and `size` is incremented by one.
    // `data` is automatically resized if it is too small.
    public void add(int x) {
        this.realloc();
        this.data[size] = x;
        size++;
    }

    private void checkIndex(int idx) {
        if(idx >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    // Set the ith element of `data` to `x`.
    public void set(int idx, int x) {
        this.checkIndex(idx);
        this.data[idx] = x;
    }

    // Return the element at the index `idx` of `data`.
    public int get(int idx) {
        this.checkIndex(idx);
        return this.data[idx];
    }

    // Remove the element at index `idx`.
    // Shift all the elements after `idx` of one position to the left.
    public void remove(int idx) {//4, 5, 6  idx=1
        if(!this.isEmpty()){
            for (int i = idx+1; i < size; i++) {
                this.data[i-1] = this.data[i];
            }//4, 6, 6  idx=1
            size--;//4, 6  idx=1
        }
    }
    
    public void sort(){
        for (int i = 0; i < size; i++) {
            for (int t = 0; t < size-1; t++) {
                if(this.data[t] > this.data[t+1]){
                    int temp = this.data[t];
                    this.data[t] = this.data[t+1];
                    this.data[t+1] = temp;
                }
            }
        }
    }
    
    public void add(int[] a){
        for (int elem : a) {
            this.add(elem);
        }
    }
}