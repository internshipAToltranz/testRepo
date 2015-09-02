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
public class Careau {
    int sp=7,spin=0,spck=sp;
    int sp2=sp-1;
    public void create(){
    for(int i=1;i<=6;i++){
    for(int j=sp;j>=2;j--){
        System.out.print(" ");
    }
    sp-=1;
    System.out.print("*");
    if(sp<spck){
    for(int a=0;a<=spin;a++){
    System.out.print(" ");
    }
    spin+=2;
    System.out.print("*");
    }
    System.out.println("");
    if(i>=6){
   //do a decrement
    int a,b,c;
    for(a=1;a<=sp2-1;a++){
    for(b=0;b<=a;b++){
    System.out.print(" ");
    }
    System.out.print("*");
    for(int d=spin-3;d>=1;d--){
    System.out.print(" ");
    }
    spin-=2;
    System.out.println("*");
    }
   }
    }
    

    }
}
