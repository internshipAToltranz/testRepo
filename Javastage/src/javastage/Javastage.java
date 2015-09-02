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
public class Javastage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j,n=6,k,space=1,sp=n,l;
  for(l=n;l>=0;l--)
  System.out.print(" ");
  System.out.print("*\n");
  for(k=1;k<=n;k++)
  {
for(i=sp;i>=1;i--)
System.out.print(" ");
sp-=1;
System.out.print("*");
for(j=1;j<=space;j++)
System.out.print(" ");
System.out.print("*\n");
space+=2;
}
int o,p,q=n+2,x,y;
for(o=1;o<=n-1;o++)
{
    for(p=0;p<=o;p++)
    {
        System.out.print(" ");
        }
        System.out.print("*");
        for(x=q;x>=0;x--)
        System.out.print(" ");
        System.out.print("*\n");
        q-=2;
    }
    for(y=n;y>=0;y--)
    System.out.print(" ");
    System.out.print("*\n");
    // Another test for reminder
    String f="Even this works, oh Dios...!!!";
    Another an=new Another();
    String b=an.func(f);
    int s=20,w=0;
    int t=an.func(n,s);
    System.out.println(t);
    System.out.println(b);
    
    int max=4;
    an.triangle(max);
    
    Listing lst=new Listing();
    lst.hashlisting();
    
    Careau cr=new Careau();
    cr.create();
    }
    
}
