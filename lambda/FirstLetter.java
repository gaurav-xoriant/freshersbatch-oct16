package com.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FirstLetter {

	public static void main(String[] args) {
		List<String>ls=new ArrayList<>();
		ls.add("abc");
		ls.add("bac");
		ls.add("abc");
		
		Consumer<List<String>> consumer =
				(List<String>ls1)->System.out.println(ls1);
	}

}
