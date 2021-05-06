/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.its.sw;

import java.util.Comparator;

/**
 *
 * @author lorenz
 */
public class LastNameComparator implements Comparator<Person>{



    @Override
    public int compare(Person o1, Person o2) {
        if (o1.lastName.compareTo(o2.lastName)<0){
            return -1;
        }else if (o1.lastName.compareTo(o2.lastName)==0){
            return 0;
        }else {
            return 1;
        }
        
    }
    
}
