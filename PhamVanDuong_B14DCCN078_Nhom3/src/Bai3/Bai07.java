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
public class Bai07 {

    public static int getPriority(char ch) {
        if (ch == '(') {
            return 0;
        }
        if (ch == '+' || ch == '-') {
            return 1;
        }
        if (ch == '*' || ch == '/') {
            return 2;
        }
        return 3;
    }

    public static String trungTo2HauTo(String str) {
        StackOfChars st = new StackOfChars(1000);
        StringBuilder res = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                res = res.append(str.charAt(i));
            } else if (str.charAt(i) == '(') {
                st.push(str.charAt(i));
            } else if (str.charAt(i) == ')') {
//                while(st.peak() != '(' ) {
//                    res = res.append(st.pop());
//                }
                System.out.println("peak = " + st.peak());
                while (true) {
                    if (st.peak() == '(') {
                        st.pop();
                        break;
                    }
                    res = res.append(st.pop());
                }
            } else {
                while (true) {
                    if( st.isEmpty() ) break;
                    if( getPriority(str.charAt(i)) > getPriority(st.peak()) ) break;
                    res = res.append(st.pop());
                }
                st.push(str.charAt(i));
            }
        }
        while(!st.isEmpty()) {
            res = res.append(st.pop());
        }

        return res.toString();
    }
    public static int test( String str ) {
//        StackOfChars st = new StackOfChars(1000);
        StackOfIntergers st = new StackOfIntergers(1000);
        for( int i = 0; i<str.length(); i++ ){
            if( str.charAt(i) >= '0' && str.charAt(i) <= '9' ) st.push(Integer.parseInt(str.charAt(i) + ""));
            else {
                if( str.charAt(i) == '+' ) {
                    int y = Integer.parseInt(st.pop() + "");
                    int x = Integer.parseInt(st.pop() + "");
                    int tmp = x+y;
                    st.push(tmp);
                }
                else if( str.charAt(i) == '-' ) {
                    int y = Integer.parseInt(st.pop() + "");
                    int x = Integer.parseInt(st.pop() + "");
                    int tmp = x-y;
                    st.push(tmp);
                }
                else if( str.charAt(i) == '*' ) {
                    int y = Integer.parseInt(st.pop() + "");
                    int x = Integer.parseInt(st.pop() + "");
                    int tmp = x*y;
                    st.push(tmp);
                }
                else if( str.charAt(i) == '/' ) {
                    int y = Integer.parseInt(st.pop() + "");
                    int x = Integer.parseInt(st.pop() + "");
                    int tmp = x/y;
                    st.push(tmp);
                }
            }
            
        }
        
        
        return Integer.parseInt(st.pop()+"");
        
    }
    public static int getValue( String str ) {
        StackOfChars st = new StackOfChars(1000);
        
        for( int i = 0; i<str.length(); i++ ){
            if( str.charAt(i) >= '0' && str.charAt(i) <= '9' ) st.push(str.charAt(i));
            else {
                if( str.charAt(i) == '+' ) {
                    int y = Integer.parseInt(st.pop() + "");
                    int x = Integer.parseInt(st.pop() + "");
                    int tmp = x+y;
                    st.push((char)(tmp+'0'));
                }
                else if( str.charAt(i) == '-' ) {
                    int y = Integer.parseInt(st.pop() + "");
                    int x = Integer.parseInt(st.pop() + "");
                    int tmp = x-y;
                    st.push((char)(tmp+'0'));
                }
                else if( str.charAt(i) == '*' ) {
                    int y = Integer.parseInt(st.pop() + "");
                    int x = Integer.parseInt(st.pop() + "");
                    int tmp = x*y;
                    st.push((char)(tmp+'0'));
                }
                else if( str.charAt(i) == '/' ) {
                    int y = Integer.parseInt(st.pop() + "");
                    int x = Integer.parseInt(st.pop() + "");
                    int tmp = x/y;
                    st.push((char)(tmp+'0'));
                }
            }
            
        }
        
        
        return Integer.parseInt(st.pop()+"");
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap bieu thuc trung to :");
        String str = sc.nextLine();
        System.out.println(trungTo2HauTo(str));
//        System.out.println(str);
//        char tmp = '2';
//        System.out.println(Integer.parseInt(tmp+""));
        System.out.println("Gia tri :" + test(trungTo2HauTo(str)));

    }
}
