package com.Business;
import java.util.*;

public class CustomComparator implements Comparator<Integer> {
	@Override
	public int compare(Integer num1,Integer num2){
	   return (num1>num2 ? num1 : num2);	
	}
}
