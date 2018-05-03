package com.amiabledata.archertracker.score;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;
public class Score {
    private Integer SetNumber;
    
    public void setSetNumber(Integer value){
        this.SetNumber = value;
    }
    public Integer getSetNumber(){
        return this.SetNumber;
    }
    public static Integer getStaticSum(ArrayList<Integer> value) {
    	Integer sum = 0;
    	for(Iterator<Integer>it = value.iterator(); it.hasNext();) {
    		sum+=it.next();
    	}
    	return sum;
    }
     public static Integer getStaticSum(Integer[] value) {
    	Integer sum = 0;
    	for(Integer i = 0; i < value.length; i++) {
    		sum+=value[i];
    	}
    	return sum;
    }
     public static Integer getStaticSum(Integer[][] value) {
     Integer sum = 0;
     for(Integer i = 0; i < value.length; i++) {
      for(Integer j = 0; j < value[i].length;j++){
         sum+=value[i][j];
      }
     }
     return sum;
    }

}

    
   