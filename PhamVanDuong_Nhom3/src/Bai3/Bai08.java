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
public class Bai08 {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao bieu thuc trung to :");
        String str = sc.nextLine();
        System.out.println("Bieu thuc hau to :" + trungTo2HauTo(str));
        
    }
}
