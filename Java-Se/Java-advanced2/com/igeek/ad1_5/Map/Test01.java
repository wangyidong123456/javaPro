package com.igeek.ad1_5.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test01 {
	public static void main(String[] args) {
	    HashMap<String,String> hs=new HashMap<String,String>();
	    hs.put("1", "Lucy");
	    hs.put("2", "John");
	    hs.put("3", "Smith");
	    hs.put("4", "Aimee");
	    hs.put("5", "Amanda");
	    Set<String> set= hs.keySet();
	    Iterator<String> it= set.iterator();
	    while(it.hasNext()){
	    	System.out.println(hs.get(it.next()));
	    }
	}
}