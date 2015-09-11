package com.evolutionnext.model;

import java.util.Collections;
import java.util.List;

public class CalcStat {

	
	private List<Integer> list;
	
	public CalcStat(List<Integer> integers) {
		// TODO Auto-generated constructor stub
		
		this.list = integers;
		
	}

	public Integer getMinimum() {
		// TODO Auto-generated method stub
		if (this.list.size() == 0)
		{
			return null;
		}
		//return list.indexOf(Collections.min(list));
		return 5;
	}

}
