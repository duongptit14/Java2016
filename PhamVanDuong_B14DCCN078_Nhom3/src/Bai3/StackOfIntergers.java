/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author phamduong
 */
public class StackOfIntergers {
    private int[] elements;
    private int size;

    public StackOfIntergers() {
        this.elements = new int[16];
        this.size = 16;
    }

    public StackOfIntergers(int capacity) {
        this.elements = new int[capacity];
    }
    public boolean isEmpty( ) {
        return this.size == 0;
    }
    public boolean isFull( ) {
        return this.size == this.elements.length;
    }
    public int peak( ) {
        if( this.size == 0 ) {
            System.out.println("Stack rong");
            return -1;
        }
        return this.elements[size-1];
    }
    public void push( int x ) {
        if( this.size + 1 < this.elements.length ) {
            this.size++;
            this.elements[size-1] = x;
        }
        else System.out.println("elements :Out of bounds");
    }
    public int pop() {
        if( this.size == 0 ) {
            System.out.println("Rong");
        }
        else {
            this.size--;
            return elements[this.size];
        }
        return -1;
    }
    public int getSize() {
        return this.size;
    }
    
}
