/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;
import java.util.Scanner;
/**
 *
 * @author phamduong
 */
public class Bai13 {
    public static void process( int n ) {
        for( int i = 2; i<= n; i++ ) {
            if( n%i == 0 ) {
                System.out.print(i + " ");
                n /= i;
                i--;
                
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        process(n);
    }
}
