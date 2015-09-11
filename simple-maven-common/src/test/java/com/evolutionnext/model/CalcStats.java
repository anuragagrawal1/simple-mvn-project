package com.evolutionnext.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CalcStats {

	@Test
	public void testMinimumValueWithNoElements(){
		List<Integer> integers = new ArrayList<Integer>();
		
       CalcStat calcStats =  new CalcStat(integers);
       assertNull(calcStats.getMinimum());
	}
	

	@Test
	public void testMinimumValueWithOneElements(){
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(5);
       CalcStat calcStats =  new CalcStat(integers);
       assertEquals(new Integer(5),calcStats.getMinimum());
	}

	
}
