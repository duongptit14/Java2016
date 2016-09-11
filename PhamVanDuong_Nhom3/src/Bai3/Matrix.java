/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;
import java.util.*;
/**
 *
 * @author phamduong
 */
public class Matrix {
    private float[][] a;
    public Matrix() {
        this.a = new float[3][3];
    }
    public Matrix( int rows, int cols ) {
        this.a = new float[rows][cols];
    }
    public Matrix add( Matrix m ) {
        if(this.a.length != m.a.length || this.a[0].length != m.a[0].length  ) {
            System.out.println("Khong cong duoc");
            return null;
        }
        Matrix res = new Matrix(this.a.length, this.a[0].length );
        for( int i = 0; i< this.a.length; i++ ) {
//            res.a[i] = new float[this.a]
            for( int j = 0; j< this.a[0].length; j++ ) {
                res.a[i][j] = this.a[i][j] + m.a[i][j];
            }
        }
        
        return res;
    }
    public Matrix sub( Matrix m ) {
        if(this.a.length != m.a.length || this.a[0].length != m.a[0].length  ) {
            System.out.println("Khong tru duoc");
            return null;
        }
        Matrix res = new Matrix(this.a.length, this.a[0].length );
        for( int i = 0; i< this.a.length; i++ ) {
            for( int j = 0; j< this.a[0].length; j++ ) {
                res.a[i][j] = this.a[i][j] - m.a[i][j];
            }
        }
        
        return res;
    }
    public Matrix neg() {
        Matrix res = new Matrix( this.a.length , this.a[0].length );
        
        for( int i = 0; i< this.a.length; i++ ) {
            for( int j = 0; j< this.a[0].length; j++ ) {
                res.a[i][j] = -this.a[i][j];
            }
        }
        
        return res;
    }
    public Matrix transpose() {
        Matrix res = new Matrix( this.a[0].length , this.a.length);
        
        for( int i = 0; i< this.a.length; i++ ) {
            for( int j = 0; j< this.a[0].length; j++ ) {
                res.a[j][i] = this.a[i][j];
            }
        }
        return res;
    }
    public Matrix mul( Matrix m) {
        if( this.a[0].length != m.a.length ) {
            System.out.println("khong nhan duoc");
            return null;
        }
        Matrix res = new Matrix(this.a.length , m.a[0].length );
        for(int i = 0; i< this.a.length; i++ ){
            for( int j = 0; j< m.a[0].length; j++ ){
                res.a[i][j] = 0;
                for( int k = 0; k< this.a[0].length; k++ ) res.a[i][j] += this.a[i][k] + m.a[k][j];
            }
        }
        
        return res;
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        for( int i = 0; i< this.a.length; i++ ) {
            for( int j = 0; j< this.a[0].length; j++ ) {
                
                this.a[i][j] =  sc.nextFloat();
            }
        }
    }
    public void print() {
        for( int i = 0; i< this.a.length; i++ ) {
            for( int j = 0; j< this.a[0].length; j++ ) {
                
                System.out.print(this.a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
