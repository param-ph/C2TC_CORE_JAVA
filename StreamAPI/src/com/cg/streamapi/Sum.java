package com.cg.streamapi;

import java.util.Arrays;
import java.util.List;

public class Sum {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,5,6,7);
		System.out.println(list.stream().map(i->i*2).reduce(0,(c,e)->(c+e)));
		
	}

}
