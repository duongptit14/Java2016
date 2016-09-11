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
public class StackOfChars {
    private char[] elements;
    private int size;

    public StackOfChars() {
        this.elements = new char[16];
    }

    public StackOfChars(int capacity) {
        this.elements = new char[capacity];
    }
    public boolean isEmpty() {
        return this.size == 0;
    }
    public boolean isFull() {
        return this.size == this.elements.length;
    }
    public char peak() {
        if( this.size == 0 ) System.out.println("peak error");
        else return this.elements[this.size-1];
        return 'e';
    }
    public void push( char ch ) {
        if( this.size + 1 > this.elements.length ) {
            System.out.println("Out of bounds");
        }
        else {
            this.size++;
            this.elements[this.size-1] = ch;
        }
    }
    public char pop() {
        if( this.size == 0 ) {
            System.out.println("pop error");
        }
        else {
            this.size--;
            return this.elements[this.size];
        }
        return 'e';
    }
    public int getSize() {
        return this.size;
    }
}
