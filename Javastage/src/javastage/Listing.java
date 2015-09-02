/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastage;

import java.util.*;

/**
 *
 * @author Owner
 */
public class Listing {
    //Public declaration
    String a;
    public void hashlisting(){
        //consol information
        a="New Public Transpotation Tariff";
    // Create a hash map
      HashMap hm = new HashMap();
      // Put elements to the map
      hm.put("Kigali-Huye", new Double(2300));
      hm.put("Kigali-Ruhango", new Double(1500));
      hm.put("Kigali-Nyanza", new Double(2000));
      
      // Get a set of the entries
      Set set = hm.entrySet();
      // Get an iterator
      Iterator itr = set.iterator();
      // Display elements
      System.out.println((char)27 +"[1m"+a);
      while(itr.hasNext()) {
         Map.Entry me = (Map.Entry)itr.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
      }
      System.out.println();
      // Deposit 1000 into Zara's account
      double newbalance = ((Double)hm.get("Kigali-Huye")).doubleValue();
      hm.put("Kigali-Huye", new Double(newbalance + 100));
      System.out.println("Changed price of Kigali-Huye is : " +
      hm.get("Kigali-Huye"));
    }
}
