/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastage;

/**
 *
 * @author Owner
 */
public class Another {
public String func(String from){
    String a="My God it works "+" from main class " + from;
    
    return a;
}
public int func(int a, int b){
    a=10;
    int sum=a+b;
    return sum;
    
}
public void triangle(int maxRows) {
    int r, num;
    int ctrl=maxRows;
    for (int i = 0; i <= maxRows; i++) {
        
        for(int sp=ctrl;sp>=0;sp--){
            System.out.print(" ");
            }
            ctrl--;
        
        num = 1;
        r = i + 1;
        for (int j = 0; j <= i; j++) {
            if (j > 0) {
                num = num * (r - j) / j;    
            }
            System.out.print(num + " ");
        }
        System.out.println();
    }
    double x=Math.pow(11,9);
    long l = (new Double(x)).longValue();
    System.out.println("Power of 11 by 8 = "+l);
}
}