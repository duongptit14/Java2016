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
public class Bai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float c = sc.nextFloat();
        float tmp = (float)1.0 / c;
        int n = (int) (tmp-1)/2;
        System.out.println(n);
        float count = 0;
        for( int i = 0; i<=n; i++ ) {
            if( i%2 == 0 ) count += (float) 1.0 / (2*i + 1);
            else count -= (float) 1.0 / (2*i + 1);
        }
        float res = (float)count * 4;
        System.out.println("Result is " + res);
        
    }
    
}
