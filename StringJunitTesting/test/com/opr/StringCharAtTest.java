package com.opr;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class StringCharAtTest {
	@Parameter
	public int input;
	@Parameter(value=1)
	public String input2;
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                 {2,"ABC"}, {1,"ABC" }, { 0,"ABC" }});
    }
	StringOpr s=new StringOpr(); 
	@Test
	public void testStringCharAt(){
		assertEquals(input2.charAt(input), s.getChar(input,input2));
	}
}
