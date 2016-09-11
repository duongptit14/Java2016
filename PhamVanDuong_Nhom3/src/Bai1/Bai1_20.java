/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;
import static java.lang.Math.pow;
import java.util.Scanner;
/**
 *
 * @author phamduong
 */
public class Bai1_20 {
    public static long gt( int n ) {
        if( n == 0 ) return 1;
        return n * gt(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float c = sc.nextFloat();
        int x = sc.nextInt();
        int n = 0;
        float res = 0;
        while( (float)pow(x,n) / gt(n) > c ) {
            res += (float)pow(x,n) / gt(n);
            n++;
        }
        
        System.out.println(res);
        
    }
}
