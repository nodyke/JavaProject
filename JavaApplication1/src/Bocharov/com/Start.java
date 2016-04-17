/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bocharov.com;

import Bocharov.com.sorts.*;



/**
 *
 * @author Дмитрий
 */
public class Start {
    public void start()
    {
        int[] mas={4,5,1,2,5,67,100};
        SelectionSort test=new SelectionSort(mas.clone());
      
        System.out.println();
        test.sort();
        test.outArray();  
        for(int a:mas)System.out.print(a+" ");
    }
    
}
