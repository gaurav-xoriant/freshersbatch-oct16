package com.opr;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class StringConcatOprTest {
	@Parameter
	public String input;
	@Parameter(value=1)
	public String input2;
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                 {"hELLO","ABC"}, {"O","ABC" }, { "LLO","ABC" }});
    }
	StringOpr s=new StringOpr(); 
	@Test
	public void testStringConcat(){
		assertEquals(input.concat(input2),s.concat(input, input2));
	}
}
