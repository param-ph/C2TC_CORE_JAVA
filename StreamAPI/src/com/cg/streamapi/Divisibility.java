package com.cg.streamapi;

import java.util.Arrays;
import java.util.List;

public class Divisibility {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,10);
		int result = 0;
		for(int i : list) {
			if(i%5==0)
				result = result + i*2;
		}
		System.out.println(result);
		System.out.println(list.stream().filter(i-> i%5==0).map(i->i*2).reduce(0, (c,e)-> (c+e)));
	}

}
